import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double averageSum = sum / numbers.size();
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (numbers.get(i) <= averageSum) {
                numbers.set(i, 55555);
            }
        }
        numbers.removeAll(Arrays.asList(55555));
        numbers = numbers.stream().sorted().collect(Collectors.toList());
        Collections.reverse(numbers);
        int count = 0;
        if (numbers.size() == 0) {
            System.out.println("No");
        } else {
            for (int number : numbers) {
                count++;
                if (averageSum >= number) {
                    System.out.println("No");
                } else {
                    if (count <= 5) {
                        System.out.print(number + " ");
                    }
                }
            }
        }
    }


}

