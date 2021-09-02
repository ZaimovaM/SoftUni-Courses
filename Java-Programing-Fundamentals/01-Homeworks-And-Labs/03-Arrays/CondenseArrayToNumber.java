import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - 1; j++) {
                    numbers [j] = numbers[j] + numbers [j + 1];
            }

        }
        System.out.println(numbers[0]);

    }
}
