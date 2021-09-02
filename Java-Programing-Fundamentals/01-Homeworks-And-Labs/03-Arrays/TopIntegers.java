import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int index = 0; index < numbers.length; index++) {
            int currentNumber = numbers[index];
            boolean isBiggest = true;
            for (int i = index + 1; i < numbers.length; i++) {
                int rightNum = numbers[i];
                if (currentNumber <= rightNum) {
                   isBiggest = false;
                   break;
                }


            }
           if (isBiggest){
               System.out.print(currentNumber + " ");
           }


        }
    }
}
