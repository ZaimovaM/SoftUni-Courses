import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rooms = (scanner.nextLine().split("\\|"));
        int initialHealth = 100;
        int initialBitcoins = 0;
        boolean isDied = false;
        for (int room = 0; room < rooms.length; room++) {
            String[] commands = rooms[room].split("\\s+");
            String command = commands[0];
            int number = Integer.parseInt(commands[1]);
            if (command.equals("potion")) {
                initialHealth += number;

                if (initialHealth >= 100) {

                    int healed = number - (initialHealth - 100);
                    initialHealth = 100;
                    System.out.printf("You healed for %d hp.%n", healed);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                } else {
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                }
            } else if (command.equals("chest")) {
                initialBitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else {
                initialHealth -= number;
                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    isDied = true;
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", room + 1);
                    break;
                }
            }
        }
        if (!isDied){
            System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", initialBitcoins, initialHealth);
        }
    }
}
