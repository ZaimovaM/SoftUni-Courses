import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        boolean isEquals = false;


        for (int index = 0; index < numbers.length; index++) {

            int rightSum = 0;
            int leftSum = 0;
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                int leftNum = numbers[leftIndex];
                leftSum += leftNum;

            }
            for (int rightIndex = index + 1; rightIndex < numbers.length; rightIndex++) {
                int rightNum = numbers[rightIndex];
                rightSum += rightNum;

            }
            if (leftSum == rightSum) {
                isEquals = true;
                System.out.println(index);
                break;
            }
        }
        if (!isEquals) {
            System.out.println("no");
        }

    }
}

