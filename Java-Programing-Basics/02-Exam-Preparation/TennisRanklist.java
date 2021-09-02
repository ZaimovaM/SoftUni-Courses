import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTour = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int countWin = 0;
        int sum = 0;
        int count = 0;

        for (int tour = 1; tour <= countTour; tour++) {
            String stage = scanner.nextLine();
            count++;
            if (stage.equals("W")){
                points += 2000;
                countWin++;
                sum += 2000;

            } else if (stage.equals("F")){
                points += 1200;
                sum += 1200;
            } else if (stage.equals("SF")) {
                points += 720;
                sum += 720;
            }

        }
        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %d%n", (sum / count));
        System.out.printf("%.2f%%", 100.0 * countWin / count);
    }
}
