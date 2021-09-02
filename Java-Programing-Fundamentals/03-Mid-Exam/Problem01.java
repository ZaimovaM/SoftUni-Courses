
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountBiscuits = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int otherFactory = Integer.parseInt(scanner.nextLine());

        double biscuitsPerDay = 0;
        double totalBiscuits = 0;
        for (int day = 1; day <= 30; day++) {
            if (day % 3 == 0) {
                biscuitsPerDay = Math.floor(0.75 * (amountBiscuits * countOfWorkers));
            } else {
                biscuitsPerDay = amountBiscuits * countOfWorkers;
            }
            totalBiscuits += biscuitsPerDay;
        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n", totalBiscuits);
        double diffPercent = 0;
        if (totalBiscuits > otherFactory){
            diffPercent = (totalBiscuits - otherFactory) / otherFactory * 100;
            System.out.printf("You produce %.2f percent more biscuits.", diffPercent);
        } else {
            diffPercent = (otherFactory - totalBiscuits) / otherFactory * 100;
            System.out.printf("You produce %.2f percent less biscuits.", diffPercent);
        }



    }
}
