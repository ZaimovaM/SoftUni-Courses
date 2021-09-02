import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sumForNewComputer = 0;
        while (!command.equals("special") && !command.equals("regular")) {
            double prices = Double.parseDouble(command);
            if (prices > 0) {
                sumForNewComputer += prices;
            } else {
                System.out.println("Invalid price!");
            }

            command = scanner.nextLine();
        }

        if (sumForNewComputer == 0) {
            System.out.println("Invalid order!");
        } else if (sumForNewComputer > 0) {

            double tax = sumForNewComputer * 20 / 100;
            double totalSumWhitTax = sumForNewComputer + tax;
            if (command.equals("special")){
              double discount = totalSumWhitTax * 0.10;
              totalSumWhitTax = totalSumWhitTax - discount;
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%nTaxes: %.2f$%n", sumForNewComputer, tax);
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$", totalSumWhitTax);
            } else {
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%nTaxes: %.2f$%n", sumForNewComputer, tax);
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$", totalSumWhitTax);
            }
        }


    }
}
