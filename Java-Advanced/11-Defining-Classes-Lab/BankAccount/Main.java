package BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();
        while (!command.equals("End")) {
            String[] commandParts = command.split("\\s+");

            String output = null;

            if (commandParts[0].equals("Create")) {
                BankAccount account = new BankAccount();
                bankAccounts.put(account.getId(), account);
                output = "Account ID" + account.getId() + " created";

            } else if (commandParts[0].equals("Deposit")) {
                int id = Integer.parseInt(commandParts[1]);
                int amount = Integer.parseInt(commandParts[2]);

                if (!bankAccounts.containsKey(id)) {
                    output = "Account does not exist";
                } else {
                    bankAccounts.get(id).deposit(amount);
                    output = "Deposited " + amount + " to ID" + id;
                }

            } else if (commandParts[0].equals("SetInterest")) {
                double interest = Double.parseDouble(commandParts[1]);
                BankAccount.setInterestRate(interest);

            } else if (commandParts[0].equals("GetInterest")) {
                int id = Integer.parseInt(commandParts[1]);
                int years = Integer.parseInt(commandParts[2]);

                if (!bankAccounts.containsKey(id)) {
                    output = "Account does not exist";
                } else {
                    double interest = bankAccounts.get(id).getInterest(years);
                    output = String.format("%.2f", interest);
                }

            }
            if (output != null) {
                System.out.println(output);
            }
            command = scanner.nextLine();
        }
    }
}
