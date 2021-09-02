import java.util.Scanner;

public class PassengersPerFlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countAirlines = Integer.parseInt(scanner.nextLine());
        String nameHigh = "";
        int countHigh = 0;

        for (int i = 1; i <= countAirlines; i++) {
            int countFlies = 0;
            int sumPas = 0;

            String name = scanner.nextLine();
            String command = scanner.nextLine();
            while (!command.equals("Finish")) {
                int pasager = Integer.parseInt(command);
                countFlies++;
                sumPas += pasager;


                command = scanner.nextLine();
            }
            int sum = sumPas / countFlies;
            System.out.printf("%s: %d passengers.%n", name, sum);
            if (sum >= countHigh) {
                countHigh = sum;
                nameHigh = name;
            }

        }
        System.out.printf("%s has most passengers per flight: %d", nameHigh, countHigh);
    }
}
