import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            double money = 0;

            while(money < budget){
                double saveMoney = Double.parseDouble(scanner.nextLine());
                money += saveMoney;
            }
            System.out.printf("Going to %s!%n", command);

            command = scanner.nextLine();
        }
    }
}
