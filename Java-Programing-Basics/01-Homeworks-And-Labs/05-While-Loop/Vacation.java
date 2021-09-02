import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double needMoney = Double.parseDouble(scanner.nextLine());
        double balance = Double.parseDouble(scanner.nextLine());
        int countDay = 0;
        int countSpendDay = 0;
        double sumMoney = balance;
        while (sumMoney < needMoney) {
            String action = scanner.nextLine();
            double value = Double.parseDouble(scanner.nextLine());
            countDay++;
            if (action.equals("save")) {
                countSpendDay = 0;
                sumMoney += value;
            } else {
                countSpendDay++;
                if (countSpendDay == 5){
                    break;
                }
                if (sumMoney - value < 0) {
                    sumMoney = 0;
                } else {
                    sumMoney -= value;
                }
            }
        }
        if (sumMoney >= needMoney) {
            System.out.printf("You saved the money for %d days.", countDay);
        } else {
            System.out.println("You can't save the money.");
            System.out.printf("%d", countDay);
        }
    }
}
