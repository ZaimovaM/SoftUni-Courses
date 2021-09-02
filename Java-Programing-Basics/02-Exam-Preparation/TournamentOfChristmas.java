import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countWinTour = 0;
        int countLoseTour = 0;
        double sumAllDays = 0;
        for (int days = 1; days <= n; days++) {
            String command = scanner.nextLine();
            double sum = 0;
            int countWin = 0;
            int countLose = 0;
            while (!command.equals("Finish")) {
                String sport = command;
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    sum += 20;
                    countWin++;
                } else {
                    countLose++;
                }


                command = scanner.nextLine();
            }
            if (countWin > countLose){
                sum = sum + (sum * 0.10);
            }
            sumAllDays += sum;
            countWinTour += countWin;
            countLoseTour += countLose;

        }
        if (countWinTour > countLoseTour){
            sumAllDays = sumAllDays + (sumAllDays * 0.20);
            System.out.printf("You won the tournament! Total raised money: %.2f", sumAllDays);
        }
        else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", sumAllDays);
        }

    }
}
