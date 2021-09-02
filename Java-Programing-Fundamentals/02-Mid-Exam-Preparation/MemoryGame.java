import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        int wonCounter = 0;
        int counter = 0;
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            counter++;
            String[] splitCommand = command.split("\\s+");
            int firstIndex = Integer.parseInt(splitCommand[0]);
            int secondIndex = Integer.parseInt(splitCommand[1]);
            boolean isValidIndex = isValidIndex(firstIndex, secondIndex, numbers);
            if (numbers.size() == 0) {
                System.out.printf("You have won in %d turns!", wonCounter);
                break;
            }
            if (!isValidIndex) {
                System.out.println("Invalid input! Adding additional elements to the board");
                String additionalNumber = String.format("-%da", counter);


                int middleIndex = numbers.size() / 2;
                numbers.add(middleIndex, additionalNumber);
                numbers.add(middleIndex, additionalNumber);
                command = scanner.nextLine();
                continue;
            }

            if (numbers.get(firstIndex).equals(numbers.get(secondIndex))) {
                String element = numbers.get(firstIndex);
                wonCounter++;
                numbers.set(firstIndex, "-44");
                numbers.set(secondIndex, "-44");
                numbers.removeAll(Arrays.asList("-44"));

                System.out.printf("Congrats! You have found matching elements - %s!%n", element);


            } else {
                System.out.println("Try again!");
            }


            command = scanner.nextLine();
        }
        if (!numbers.isEmpty()) {
            System.out.println("Sorry you lose :(");
            for (String number : numbers) {
                System.out.print(number + " ");
            }
        }

    }

    private static boolean isValidIndex(int firstIndex, int secondIndex, List<String> numbers) {
        if (firstIndex != secondIndex && firstIndex >= 0 && firstIndex <= numbers.size() - 1 &&
                secondIndex >= 0 && secondIndex <= numbers.size() - 1) {

            return true;
        } else {
            return false;
        }


    }
}
