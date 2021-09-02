import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMoves = Integer.parseInt(scanner.nextLine());

        double sumNumber = 0;
        int count0to9 = 0;
        int count10to19 = 0;
        int count20to29 = 0;
        int count30to39 = 0;
        int count40to50 = 0;
        int countInvaid = 0;

        for (int move = 1; move <= totalMoves; move++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 0 && number <= 9) {
                count0to9++;
                sumNumber = sumNumber + number * 0.20;
            } else if (number >= 10 && number <= 19) {
                count10to19++;
                sumNumber = sumNumber + number * 0.30;
            } else if (number >= 20 && number <= 29) {
                count20to29++;
                sumNumber = sumNumber + number * 0.40;
            } else if (number >= 30 && number <= 39) {
                count30to39++;
                sumNumber = sumNumber + 50;
            } else if (number >= 40 && number <= 50) {
                count40to50++;
                sumNumber = sumNumber + 100;
            } else {
                countInvaid++;
                sumNumber = sumNumber / 2;
            }


        }
        double percent0to9 = 1.0 * count0to9 / totalMoves * 100;
        double percent10to19 = 1.0 * count10to19 / totalMoves * 100;
        double percent20to29 = 1.0 * count20to29 / totalMoves * 100;
        double percent30to39 = 1.0 * count30to39 / totalMoves * 100;
        double percent40to50 = 1.0 * count40to50 / totalMoves * 100;
        double percentInvalid = 1.0 * countInvaid / totalMoves * 100;

        System.out.printf("%.2f%n", sumNumber);
        System.out.printf("From 0 to 9: %.2f%%%n", percent0to9);
        System.out.printf("From 10 to 19: %.2f%%%n", percent10to19);
        System.out.printf("From 20 to 29: %.2f%%%n", percent20to29);
        System.out.printf("From 30 to 39: %.2f%%%n", percent30to39);
        System.out.printf("From 40 to 50: %.2f%%%n", percent40to50);
        System.out.printf("Invalid numbers: %.2f%%%n", percentInvalid);
    }
}
