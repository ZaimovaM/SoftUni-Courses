import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());
        String userInput = scanner.nextLine();
        boolean isWon = false;
        boolean isLost = false;

        while (!userInput.equals("Retire")) {
            String[] splitUserInput = userInput.split("\\s+");
            String command = splitUserInput[0];
            if (command.equals("Fire")) {
                int index = Integer.parseInt(splitUserInput[1]);
                int damage = Integer.parseInt(splitUserInput[2]);
                boolean isValidIndex = validIndex(index, warShip);
                if (isValidIndex) {
                    int value = warShip.get(index);
                    value -= damage;
                    
                    if (value <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        isWon = true;
                        break;
                    } else {
                        warShip.set(index, value);
                    }
                }
            } else if (command.equals("Defend")) {
                int startIndex = Integer.parseInt(splitUserInput[1]);
                int endIndex = Integer.parseInt(splitUserInput[2]);
                int damage = Integer.parseInt(splitUserInput[3]);
                boolean isValidIndexes = validIndexes(startIndex, endIndex, pirateShip);
                if (isValidIndexes) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        int element = pirateShip.get(i);
                        element = element - damage;

                        if (element <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            isLost = true;
                            break;
                        } else {
                            pirateShip.set(i, element);

                        }
                    }
                }

            } else if (command.equals("Repair")) {
                int index = Integer.parseInt(splitUserInput[1]);
                int health = Integer.parseInt(splitUserInput[2]);
                boolean isValidIndex = validIndex(index, pirateShip);
                if (isValidIndex) {
                    int element = pirateShip.get(index);
                    element = element + health;
                    if (element > maxHealth) {
                        element = maxHealth;
                    }
                    pirateShip.set(index, element);
                }
            } else if (command.equals("Status")) {
                int count = 0;
                for (int i = 0; i <= pirateShip.size() - 1; i++) {
                    double health = 0.20 * maxHealth;
                    if (pirateShip.get(i) < health) {
                        count++;

                    }
                }
                System.out.printf("%d sections need repair.%n", count);
            }


            userInput = scanner.nextLine();
        }
        if (!isLost && !isWon) {
            int sumPirateShip = 0;
            for (int element : pirateShip) {
                sumPirateShip += element;
            }
            System.out.printf("Pirate ship status: %d%n", sumPirateShip);

            int sumWarship = 0;
            for (int element : warShip) {
                sumWarship += element;
            }
            System.out.printf("Warship status: %d%n", sumWarship);
        }
    }

    private static boolean validIndexes(int startIndex, int endIndex, List<Integer> pirateShip) {
        return startIndex >= 0 && startIndex <= pirateShip.size() - 1 && endIndex >= 0 && endIndex <= pirateShip.size() - 1;
    }

    private static boolean validIndex(int index, List<Integer> warShip) {
        return index >= 0 && index <= warShip.size() - 1;
    }
}
