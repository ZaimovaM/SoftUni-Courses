import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeYear = scanner.nextLine();
        int countHoliday = Integer.parseInt(scanner.nextLine());
        int countWeekend = Integer.parseInt(scanner.nextLine());

        int countWeekendInSofia = 48 - countWeekend;
        double countPlaySofia =(double)countWeekendInSofia * 3/4;
        double countPlayHoliday = (double)countHoliday * 2/3;
        double totalGames = countPlayHoliday + countPlaySofia + countWeekend;

        if (typeYear.equals("leap")) {
            totalGames = totalGames + (0.15 * totalGames);

        }
            System.out.printf("%.0f",Math.floor(totalGames));



    }
}
