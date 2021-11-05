package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.money = money;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be an empty");
        }
        this.name = name;
    }

    public void buyProduct(Product product) {
        if (this.money < product.getCost()) {
            String message = String.format("%s can't afford %s", this.name, product.getName());
            throw new IllegalArgumentException(message);
        }
        this.products.add(product);
        this.money -= product.getCost();
        System.out.printf("%s bought %s%n", this.name, product.getName());

    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts(){
        return products;
    }
}
