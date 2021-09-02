import java.util.Scanner;

public class FromLeftToTheRide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int numbers = 1; numbers <= n; numbers++) {
            long leftNum = Long.parseLong(scanner.next());
            long rightNum = Long.parseLong(scanner.next());
            int sumOfDigits = 0;
            if (leftNum > rightNum) {
                while (leftNum != 0) {
                    long lastDigitLeft = leftNum % 10;
                    sumOfDigits += lastDigitLeft;
                    leftNum = leftNum / 10;

                }

            } else {
                while (rightNum != 0) {
                    long lastDigitRight = rightNum % 10;
                    sumOfDigits += lastDigitRight;
                    rightNum = rightNum / 10;

                }

            }
            System.out.println(Math.abs(sumOfDigits));

        }
    }
}
