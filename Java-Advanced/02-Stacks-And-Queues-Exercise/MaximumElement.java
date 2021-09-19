import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 1; i <= countCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String typeCommand = command[0];
            if (typeCommand.equals("1")) {
                int number = Integer.parseInt(command[1]);
                numbers.push(number);
            } else if (typeCommand.equals("2")) {
                numbers.pop();
            } else if (typeCommand.equals("3")) {
                if (numbers.size() > 0) {
                    int maximumElement = Collections.max(numbers);
                    System.out.println(maximumElement);
                }
            }
        }
    }
}
