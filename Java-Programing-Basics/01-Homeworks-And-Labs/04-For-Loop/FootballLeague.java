import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allPlaces = Integer.parseInt(scanner.nextLine());
        int countFans = Integer.parseInt(scanner.nextLine());
        int countFansA = 0;
        int countFansB = 0;
        int countFansV = 0;
        int countFansG = 0;

        for (int fan = 1; fan <= countFans; fan++) {
                String group = scanner.nextLine();
                if (group.equals("A")) {
                    countFansA++;
                } else if (group.equals("B")) {
                    countFansB++;
                } else if (group.equals("V")) {
                    countFansV++;
                } else if (group.equals("G")) {
                    countFansG++;
                }
            }

            double percentA = 1.0 * countFansA / countFans * 100;
            double percentB = 1.0 * countFansB / countFans * 100;
            double percentV = 1.0 * countFansV / countFans * 100;
            double percentG = 1.0 * countFansG / countFans * 100;
            double percentPlaces = 1.0 * countFans / allPlaces * 100;
            System.out.printf("%.2f%%%n", percentA);
            System.out.printf("%.2f%%%n", percentB);
            System.out.printf("%.2f%%%n", percentV);
            System.out.printf("%.2f%%%n", percentG);
            System.out.printf("%.2f%%%n", percentPlaces);
        }

    }


