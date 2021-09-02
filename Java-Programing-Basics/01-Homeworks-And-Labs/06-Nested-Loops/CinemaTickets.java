import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int countBillet = 0;
        int countStudentTickets = 0;
        int countStandardTickets = 0;
        int countKidTickets = 0;

        while (!command.equals("Finish")) {

            int freeSeats = Integer.parseInt(scanner.nextLine());

            String type = scanner.nextLine();
           int countTicketPerFilm = 0;
            while (!type.equals("End")) {


                countTicketPerFilm++;
                if (type.equals("student")) {
                    countStudentTickets++;
                } else if (type.equals("standard")) {
                    countStandardTickets++;
                } else if (type.equals("kid")) {
                    countKidTickets++;
                }

                if (countTicketPerFilm == freeSeats) {
                    break;
                }
                type = scanner.nextLine();

            }
            countBillet += countTicketPerFilm;
            double percentSeats = 1.0 * countTicketPerFilm / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", command, percentSeats);
            command = scanner.nextLine();

        }

        double percentStudentTicket = 1.0 * countStudentTickets / countBillet * 100;
        double percentStandardTicket = 1.0 * countStandardTickets / countBillet * 100;
        double percentKidTicket = 1.0 * countKidTickets / countBillet * 100;
        System.out.printf("Total tickets: %d%n", countBillet);
        System.out.printf("%.2f%% student tickets.%n", percentStudentTicket);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTicket);
        System.out.printf("%.2f%% kids tickets.%n", percentKidTicket);

    }
}
