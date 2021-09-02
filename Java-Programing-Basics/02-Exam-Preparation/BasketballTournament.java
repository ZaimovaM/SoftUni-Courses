import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int countGames = 0;
        int countWin = 0;
        int countLost = 0;

        while (!command.equals("End of tournaments")){

            int n = Integer.parseInt(scanner.nextLine());
            countGames += n;

            for (int game = 1; game <= n; game++) {
                int teamDessi = Integer.parseInt(scanner.nextLine());
                int otherTeam = Integer.parseInt(scanner.nextLine());
                int diff = Math.abs(teamDessi - otherTeam);
                if (teamDessi > otherTeam){
                    countWin++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", game, command, diff);
                }
                else {
                    countLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", game, command, diff);
                }

            }
            command = scanner.nextLine();
        }
        double win = 1.0 * countWin / countGames * 100;
        double lost = 1.0 * countLost / countGames * 100;

        System.out.printf("%.2f%% matches win%n", win);
        System.out.printf("%.2f%% matches lost", lost);
    }
}
