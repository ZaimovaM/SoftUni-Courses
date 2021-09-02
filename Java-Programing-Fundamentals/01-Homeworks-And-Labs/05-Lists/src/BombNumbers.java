import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] bombAndPower = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int bomb = bombAndPower[0];
        int power = bombAndPower[1];

        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) == bomb) {
                numbers.set(index, -1);
                for (int i = 0; i < power; i++) {
                    if (index + 1 + i < numbers.size()){
                        numbers.set(index + 1 + i, - 1);
                    }
                    if (index - 1 - i >= 0){
                        numbers.set(index - 1 - i, - 1);
                    }
                }

            }

        }
        numbers.removeAll(Arrays.asList(-1));
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

    }
}
