import java.util.Scanner;

public class P03Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double sum = 0;

        if (season.equals("spring")) {
            if (countPeople <= 5) {
                sum = countPeople * 50.00;
            } else {
                sum = countPeople * 48.00;
            }

        } else if (season.equals("summer")) {
            if (countPeople <= 5) {
                sum = countPeople * 48.50;
                sum = sum - (sum * 0.15);
            } else {
                sum = countPeople * 45.00;
                sum = sum - (sum * 0.15);
            }

        } else if (season.equals("autumn")) {
            if (countPeople <= 5) {
                sum = countPeople * 60.00;
            } else {
                sum = countPeople * 49.50;
            }

        } else if (season.equals("winter")) {
            if (countPeople <= 5) {
                sum = countPeople * 86.00;
                sum = sum + (sum * 0.08);
            } else {
                sum = countPeople * 85.00;
                sum = sum + (sum * 0.08);
            }

        }
        System.out.printf("%.2f leva.", sum);
    }
}
