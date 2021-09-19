import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split("\\s+");
        ArrayDeque<String> numbers = new ArrayDeque<>();

        for (String number: inputNumbers) {
            numbers.push(number);
        }
        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }


    }
}
