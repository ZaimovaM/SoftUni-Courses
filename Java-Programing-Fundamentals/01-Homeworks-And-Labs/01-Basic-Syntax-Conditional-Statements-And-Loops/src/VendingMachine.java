import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sumOfCoins = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
            } else {
                sumOfCoins += coins;
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            if (sumOfCoins > 0) {
                if (product.equals("Nuts")) {
                    if (sumOfCoins >= 2.0) {
                        sumOfCoins = sumOfCoins - 2.0;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (product.equals("Water")) {
                    if (sumOfCoins >= 0.7) {
                        sumOfCoins = sumOfCoins - 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (product.equals("Crisps")) {
                    if (sumOfCoins >= 1.5) {
                        sumOfCoins = sumOfCoins - 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (product.equals("Soda")) {
                    if (sumOfCoins >= 0.8) {
                        sumOfCoins = sumOfCoins - 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (product.equals("Coke")) {
                    if (sumOfCoins >= 1.0) {
                        sumOfCoins = sumOfCoins - 1.0;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                }
                else {
                    System.out.println("Invalid product");
                }
            } else {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumOfCoins);

    }

}

