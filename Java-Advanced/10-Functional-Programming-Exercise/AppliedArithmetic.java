import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        Function<int[], int[]> add = array ->
                Arrays.stream(array).map(number -> number += 1).toArray();
        Function<int[], int[]> multiply = array ->
                Arrays.stream(array).map(number -> number *= 2).toArray();
        Function<int[], int[]> subtract = array ->
                Arrays.stream(array).map(number -> number -= 1).toArray();
        Consumer<int []> print = array -> Arrays.stream(array).forEach(n -> System.out.print(n + " "));


        while (!command.equals("end")) {
            if (command.equals("add")) {
                numbers = add.apply(numbers);

            } else if (command.equals("multiply")) {
                numbers = multiply.apply(numbers);
            } else if (command.equals("subtract")) {
                numbers = subtract.apply(numbers);

            } else if (command.equals("print")) {
                print.accept(numbers);
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }
}
