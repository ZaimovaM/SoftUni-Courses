import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        boolean flag = false;
        int maxGoals = 0;
        String name = "";
        while (!command.equals("END")) {
            String namePlayer = command;
            int countGoals = Integer.parseInt(scanner.nextLine());
            if (countGoals > maxGoals) {
                maxGoals = countGoals;
                name = namePlayer;
            }
            if (countGoals >= 3) {
                flag = true;
            }
            if (countGoals >= 10) {
                break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", name);
        if (flag) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
