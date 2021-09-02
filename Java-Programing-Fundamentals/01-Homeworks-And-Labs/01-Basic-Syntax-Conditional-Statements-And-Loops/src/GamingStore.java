import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        double spentMoney = 0;

        String command = scanner.nextLine();
        boolean isEnoughMoney = true;

        while (!command.equals("Game Time")) {
            String gameName = command;
            if (gameName.equals("OutFall 4")) {
                if (currentBalance >= 39.99) {
                    spentMoney += 39.99;
                    currentBalance -= 39.99;
                    System.out.println("Bought OutFall 4");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (gameName.equals("CS: OG")) {
                if (currentBalance >= 15.99) {
                    spentMoney += 15.99;
                    currentBalance -= 15.99;
                    System.out.println("Bought CS: OG");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (gameName.equals("Zplinter Zell")) {
                if (currentBalance >= 19.99) {
                    spentMoney += 19.99;
                    currentBalance -= 19.99;
                    System.out.println("Bought Zplinter Zell");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (gameName.equals("Honored 2")) {
                if (currentBalance >= 59.99) {
                    spentMoney += 59.99;
                    currentBalance -= 59.99;
                    System.out.println("Bought Honored 2");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (gameName.equals("RoverWatch")) {
                if (currentBalance >= 29.99) {
                    spentMoney += 29.99;
                    currentBalance -= 29.99;
                    System.out.println("Bought RoverWatch");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (gameName.equals("RoverWatch Origins Edition")) {
                if (currentBalance >= 39.99) {
                    spentMoney += 39.99;
                    currentBalance -= 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                isEnoughMoney = false;
                break;
            }

            command = scanner.nextLine();
        }
        if (isEnoughMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoney, currentBalance);
        }
    }
}
