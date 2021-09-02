import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());
        int age = 17;


        for (int year = 1800; year <= years; year++) {
            age++;
            if (year % 2 == 0) {
                inheritedMoney -= 12000;
            } else {
                inheritedMoney -= 12000 + (50 * age);
            }

        }
        if (inheritedMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritedMoney));
        }
    }
}
