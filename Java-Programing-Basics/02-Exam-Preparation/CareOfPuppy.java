import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityFood = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int rest = quantityFood * 1000;
        while (!command.equals("Adopted")) {
            int foodPerDay = Integer.parseInt(command);
            rest -= foodPerDay;

            command = scanner.nextLine();

        }
        if (rest >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", rest);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(rest));
        }
    }
}
