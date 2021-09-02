import java.util.Scanner;

public class BonusScoreSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfStudent = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = Double.MIN_VALUE;
        int lectures = 0;

        for (int student = 1; student <= countOfStudent; student++) {
            int attendances = Integer.parseInt(scanner.nextLine());

            double totalBonus = Math.ceil((1.0 * attendances / countOfLectures ) * (5 + initialBonus));
            if (totalBonus >= maxBonus){
                maxBonus = totalBonus;
                lectures = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", lectures);
    }
}
