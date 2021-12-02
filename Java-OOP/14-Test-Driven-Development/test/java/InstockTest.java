import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class InstockTest {

    private ProductStock stock;

    @Before
    public void setUp() {
        this.stock = new Instock();
    }

    @Test
    public void testContainsShouldReturnFalseWhenIsAbsentAndThenTrueWhenAdded() {

        Product product = new Product("test_product", 9.99, 1);
        assertFalse(stock.contains(product));
        stock.add(product);
        assertTrue(stock.contains(product));
    }

    @Test
    public void testCountShouldReturnZeroWhenEmptyAndNoneZeroWhenProductsAreAdded() {
        assertEquals(0, this.stock.getCount());

        createAndAddProducts(this.stock);

        assertEquals(4, this.stock.getCount());
    }

    @Test
    public void testFindShouldReturnTheCorrectNthElement() {
        Product[] addedProducts = createAndAddProducts(this.stock);
        int index = addedProducts.length - 2;

        Product product = this.stock.find(index);
        assertNotNull(product);
        assertEquals(addedProducts[index].getLabel(), this.stock.find(2).getLabel());

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFindShouldFailWhenIndexIsGrater() {
        int firstGreaterIndex = createAndAddProducts(this.stock).length;
        this.stock.find(firstGreaterIndex);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFindShouldFailWhenIndexIsNegative() {
        createAndAddProducts(this.stock);
        this.stock.find(-1);
    }

    @Test
    public void testChangeQuantityShouldUpdateTheCorrectItemInStock() {
        Product[] addedProducts = createAndAddProducts(this.stock);
        Product product = addedProducts[1];
        int newQuantity = product.getQuantity() + 10;
        this.stock.changeQuantity(product.getLabel(), newQuantity);

        assertEquals(newQuantity, product.getQuantity());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChangeQuantityShouldFailWhenNoSuchProductInStoke() {
        createAndAddProducts(this.stock);
        Product notAddedProduct = new Product("not_added_test_product", 9.99, 1);
        this.stock.changeQuantity(notAddedProduct.getLabel(), notAddedProduct.getQuantity() + 12);

    }

    @Test
    public void testGetByLabelShouldReturnTheCorrectProduct() {
        Product[] addedProducts = createAndAddProducts(this.stock);
        String expected = addedProducts[2].getLabel();

        Product product = this.stock.findByLabel(expected);
        assertNotNull(product);
        String actual = product.getLabel();

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByLabelShouldFailWhenNoSuchProductInStoke() {
        createAndAddProducts(this.stock);
        this.stock.findByLabel("not_added_test_product");

    }

    @Test
    public void testFindFirstByAlphabeticalOrderShouldReturnCorrectNumbersOfProducts() {
        Product[] addedProducts = createAndAddProducts(this.stock);

        this.stock.add(new Product("test_product_5", 9.99, 1));

        Iterable<Product> iterable = this.stock.findFirstByAlphabeticalOrder(addedProducts.length);
        int count = assertAndExtract(iterable).size();

        assertEquals(addedProducts.length, count);

    }

    @Test
    public void testFindFirstByAlphabeticalOrderShouldReturnInTheCorrectOrder() {
        Product[] addedProducts = createAndAddProducts(this.stock);

        Iterable<Product> iterable = this.stock.findFirstByAlphabeticalOrder(addedProducts.length);

        List<String> actualProducts = assertAndExtract(iterable, Product::getLabel);

        List<String> expectedProducts = Arrays.stream(addedProducts)
                .map(Product::getLabel)
                .sorted()
                .collect(Collectors.toList());

        assertEquals(expectedProducts, actualProducts);

    }

    @Test
    public void testFindFirstByAlphabeticalOrderShouldReturnEmptyCollectionWhenOutOfRange() {
        Product[] addedProducts = createAndAddProducts(this.stock);

        Iterable<Product> iterable = this.stock.findFirstByAlphabeticalOrder(addedProducts.length + 1);

        List<Product> products = assertAndExtract(iterable);
        assertTrue(products.isEmpty());
    }

    @Test
    public void testFindAllInPriceRangeShouldReturnCorrectRange() {
        Product[] addedProducts = createAndAddProducts(this.stock);
        double start = addedProducts[0].getPrice();
        double end = addedProducts[2].getPrice();
        Iterable<Product> iterable = this.stock.findAllInRange(start, end);

        List<Double> returnedPrices = assertAndExtract(iterable, Product::getPrice);

        double actual = returnedPrices.get(0);
        assertEquals(1, returnedPrices.size());
        assertEquals(end, actual, 0.00);
    }

    @Test
    public void testFindAllInPriceRangeShouldReturnCorrectRangeAndInCorrectOrder() {
        Product[] addedProducts = createAndAddProducts(this.stock);
        double start = addedProducts[0].getPrice();
        double end = addedProducts[2].getPrice();
        Iterable<Product> iterable = this.stock.findAllInRange(start, end);

        List<Double> returnedPrices = assertAndExtract(iterable, Product::getPrice);

        List<Double> collect = Arrays.stream(addedProducts)
                .map(Product::getPrice)
                .filter(p -> p > start && p<= end)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    @Test
    public void testFindAllInPriceRangeShouldReturnEmptyCollectionWhenNonMatched() {
        Product[] addedProducts = createAndAddProducts(this.stock);
        double start = -10;
        double end = -5;
        Iterable<Product> iterable = this.stock.findAllInRange(start, end);
        List<Double> returnedPrices = assertAndExtract(iterable, Product::getPrice);

        assertTrue(returnedPrices.isEmpty());
    }

    @Test
    public void testFindFirstMostExpensiveProductsShouldReturnFirstThreeMostExpensiveProducts() {
        List<Double> expected = Arrays.stream(createAndAddProducts(this.stock))
                .map(Product::getPrice)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        Iterable<Product> iterable = this.stock.findFirstMostExpensiveProducts(3);
        List<Double> actual = assertAndExtract(iterable, Product::getPrice);

        assertEquals(expected, actual);

    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindFirstMostExpensiveProductsShouldFailWhenLessProductsIntStock() {
        Product[] addedProducts = createAndAddProducts(this.stock);
        this.stock.findFirstMostExpensiveProducts(addedProducts.length + 1);
    }

    @Test
    public void testIteratorShouldReturnAllProducts() {
        List<Product> expectedProducts = Arrays.asList(createAndAddProducts(this.stock));

        Iterator<Product> iterator = this.stock.iterator();
        assertNotNull(iterator);

        List<Product> actualProducts = new ArrayList<>();

        while (iterator.hasNext()) {
            Product p = iterator.next();
            actualProducts.add(p);
        }

        assertEquals(expectedProducts, actualProducts);

    }

    private Product[] createProducts() {
        return new Product[]{
                new Product("test_product_4", 10.00, 1),
                new Product("test_product_2", 9.99, 1),
                new Product("test_product_3", 50.00, 1),
                new Product("test_product_1", 50.99, 1)

        };
    }

    private Product[] createAndAddProducts(ProductStock stock) {
        Product[] products = createProducts();

        for (Product product : products) {
            stock.add(product);
        }
        return products;
    }

    private List<Product> assertAndExtract(Iterable<Product> iterable) {
        return assertAndExtract(iterable, p -> p);
    }

    private static <T> List<T> assertAndExtract(Iterable<Product> iterable, Function<Product, T> mapper) {
        assertNotNull(iterable);
        List<T> result = new ArrayList<>();

        for (Product p : iterable) {
            result.add(mapper.apply(p));
        }
        return result;
    }

}
