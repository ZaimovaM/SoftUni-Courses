import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            if (currentNum < 0){
                numbers.remove(i);
                i--;
            }
        }
        if (numbers.size() > 0) {
            for (int i = numbers.size() - 1; i >= 0; i--) {
                System.out.print(numbers.get(i) + " ");
            }
        } else {
            System.out.println("empty");
        }
    }




}
