import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGroup = Integer.parseInt(scanner.nextLine());
        int sumMusala = 0;
        int sumMonblan = 0;
        int sumKilimandjaro = 0;
        int sumK2 = 0;
        int sumEverest = 0;
        int countAllClimber = 0;

        for (int count = 1; count <= countGroup ; count++) {
            int climber = Integer.parseInt(scanner.nextLine());
            countAllClimber += climber;
            if (climber <= 5){
                sumMusala += climber;
            } else if (climber <= 12){
                sumMonblan += climber;
            } else if (climber <= 25){
                sumKilimandjaro += climber;
            } else if (climber <= 40){
                sumK2 += climber;
            } else {
                sumEverest += climber;
            }


        }

        System.out.printf("%.2f%%%n", sumMusala * 1.0 / countAllClimber * 100);
        System.out.printf("%.2f%%%n", sumMonblan * 1.0 / countAllClimber * 100);
        System.out.printf("%.2f%%%n", sumKilimandjaro * 1.0 / countAllClimber * 100);
        System.out.printf("%.2f%%%n", sumK2 * 1.0 / countAllClimber * 100);
        System.out.printf("%.2f%%", sumEverest * 1.0 / countAllClimber * 100);
    }
}
