import java.util.Scanner;

public class PadwanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double expenseForLightSabers = (countOfStudents + Math.ceil(countOfStudents * 0.10)) * priceOfLightSabers;
        double totalExpense = (expenseForLightSabers + (countOfStudents * priceOfRobes) + (countOfStudents * priceOfBelts));
        if (countOfStudents >= 6) {
            int countFreeBelt = countOfStudents / 6;
            int countBelts = countOfStudents - countFreeBelt;
            totalExpense = (expenseForLightSabers + (countOfStudents * priceOfRobes) + (countBelts * priceOfBelts));

        }
        if (budget >= totalExpense){
            System.out.printf("The money is enough - it would cost %.2flv.",totalExpense);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalExpense - budget);
        }

    }
}
