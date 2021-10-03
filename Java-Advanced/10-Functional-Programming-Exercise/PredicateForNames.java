import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int namesLength = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> filterNames = name -> name.length() <= namesLength;
        Arrays.stream(names).filter(filterNames).forEach(System.out::println);

    }
}
