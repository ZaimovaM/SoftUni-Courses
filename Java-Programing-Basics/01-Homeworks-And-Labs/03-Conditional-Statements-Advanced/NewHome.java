import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlower = scanner.nextLine();
        int countFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double priceFlower = 0;
        if (typeFlower.equals("Roses")) {
            priceFlower = countFlower * 5;
            if (countFlower > 80) {
                priceFlower = priceFlower * 0.90;
            }
        } else if (typeFlower.equals("Dahlias")) {
            priceFlower = countFlower * 3.80;
            if (countFlower > 90) {
                priceFlower = priceFlower * 0.85;
            }
        } else if (typeFlower.equals("Tulips")) {
            priceFlower = countFlower * 2.80;
            if (countFlower > 80) {
                priceFlower = priceFlower * 0.85;
            }
        } else if (typeFlower.equals("Narcissus")) {
            priceFlower = countFlower * 3;
            if (countFlower < 120) {
                priceFlower = priceFlower + (priceFlower * 0.15);
            }
        } else if (typeFlower.equals("Gladiolus")) {
            priceFlower = countFlower * 2.50;
            if (countFlower < 80) {
                priceFlower = priceFlower + (priceFlower * 0.20);
            }
        }
        if (priceFlower <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlower, typeFlower, budget - priceFlower);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", priceFlower - budget);
        }

    }

}

