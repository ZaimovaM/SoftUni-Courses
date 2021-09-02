import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double sum = 0;
        boolean flag = false;
        int countProduct = 0;
        int countAll = 0;

        while (!command.equals("Stop")){
            double price = Double.parseDouble(scanner.nextLine());
            countProduct++;
            countAll++;
            if (countProduct == 3){
                price = price / 2;
                countProduct = 0;
            }
            sum += price;
            budget -= price;

            if (budget < 0){
                flag = true;
                break;
            }


            command = scanner.nextLine();
        }
        if (flag){
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!",Math.abs(budget));
        }else {
            System.out.printf("You bought %d products for %.2f leva.", countAll, sum);
        }

    }
}
