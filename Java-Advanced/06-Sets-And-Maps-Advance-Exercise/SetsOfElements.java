import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int firstLength = Integer.parseInt(input.split(" ")[0]);
        int secondLength = Integer.parseInt(input.split(" ")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        while (firstLength > 0) {
            firstLength--;
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);

        }
        while (secondLength > 0) {
            secondLength--;
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }

        firstSet.retainAll(secondSet);
        firstSet.forEach(n -> System.out.print(n + " "));


    }

}
