import java.util.Arrays;
import java.util.Scanner;

public class EvenSumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine()
                .split(" ");
        int [] numbers = Arrays.stream(input)
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 0){
                evenSum += currentNum;
            } else {
                continue;
            }

        }
        System.out.println(evenSum);

    }
}
