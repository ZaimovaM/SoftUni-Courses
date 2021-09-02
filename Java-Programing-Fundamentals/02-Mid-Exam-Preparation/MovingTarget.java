import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] splitCommand = command.split("\\s+");
            String commands = splitCommand[0];
            int index = Integer.parseInt(splitCommand[1]);

            if (commands.equals("Shoot")) {
                int power = Integer.parseInt(splitCommand[2]);
                if (validIndex(index, targets)) {
                    int element = targets.get(index);
                    int remainder = element - power;

                    if (remainder <= 0) {
                        targets.remove(index);
                    } else {
                        targets.set(index, remainder);
                    }
                }
            } else if (commands.equals("Add")) {
                int value = Integer.parseInt(splitCommand[2]);
                boolean isValidIndex = validIndex(index, targets);
                if (isValidIndex) {
                    targets.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if (commands.equals("Strike")) {
                int radius = Integer.parseInt(splitCommand[2]);

                boolean isValidIndexAndRadius = indexAndRadius(index, radius, targets);
                if (isValidIndexAndRadius) {
                    targets.set(index, -1);
                    for (int i = index; i <= index + radius; i++) {
                        targets.set(i, -1);
                    }
                    for (int i = index - radius; i < index; i++) {
                        targets.set(i, -1);
                    }

                } else {
                    System.out.println("Strike missed!");
                }
            }


            command = scanner.nextLine();
        }
        targets.removeAll(Arrays.asList(-1));
        for (int index = 0; index <= targets.size() - 1; index++) {
            if (index == targets.size() - 1){
                System.out.print(targets.get(index));
            } else {
                System.out.print(targets.get(index) + "|");
            }
        }
    }

    private static boolean indexAndRadius(int index, int radius, List<Integer> targets) {
        return index + radius <= targets.size() - 1 && index - radius >= 0 && index + radius >= 0 && index - radius <= targets.size() - 1;

    }

    private static boolean validIndex(int index, List<Integer> targets) {
        return index >= 0 && index <= targets.size() - 1;
    }
}
