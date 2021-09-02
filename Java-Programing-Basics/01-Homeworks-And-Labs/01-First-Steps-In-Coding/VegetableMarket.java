import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerKilogramVeg = Double.parseDouble(scanner.nextLine());
        double pricePerKilogramFru = Double.parseDouble(scanner.nextLine());
        double kilogramVeg = Double.parseDouble(scanner.nextLine());
        double kilogramFru = Double.parseDouble(scanner.nextLine());

        double priceVeg = pricePerKilogramVeg * kilogramVeg;
        double priceFru = pricePerKilogramFru * kilogramFru;
        double totalSum = priceFru + priceVeg;
        double totalSumEuro = totalSum / 1.94;
        System.out.printf("%.2f", totalSumEuro);
    }
}
