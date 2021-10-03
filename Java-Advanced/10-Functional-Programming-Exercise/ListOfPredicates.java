import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endOfRange = Integer.parseInt(scanner.nextLine());
        List<Integer> numbersForDivision = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        BiFunction<List<Integer>, Integer, Boolean> isDivisible = (list, number) -> {
            for (int numberInList : list) {
                if (number % numberInList != 0) {
                    return false;
                }
            }
            return true;
        };

        for (int number = 1; number <= endOfRange; number++) {
            if (isDivisible.apply(numbersForDivision, number)){
                System.out.print(number + " ");
            }
        }
    }
}
