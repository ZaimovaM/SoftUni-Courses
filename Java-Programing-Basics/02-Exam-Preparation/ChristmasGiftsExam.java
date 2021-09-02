import java.util.Scanner;

public class ChristmasGiftsExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int countOver16 = 0;
        int countUnder16 = 0;
        int sumToys = 0;
        int sumSelves = 0;

        while (!command.equals("Christmas")) {
            int age = Integer.parseInt(command);
            if (age <= 16) {
                countUnder16++;
                sumToys += 5;
            } else {
                countOver16++;
                sumSelves += 15;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Number of adults: %d%n", countOver16);
        System.out.printf("Number of kids: %d%n", countUnder16);
        System.out.printf("Money for toys: %d%n", sumToys);
        System.out.printf("Money for sweaters: %d%n", sumSelves);
    }
}
