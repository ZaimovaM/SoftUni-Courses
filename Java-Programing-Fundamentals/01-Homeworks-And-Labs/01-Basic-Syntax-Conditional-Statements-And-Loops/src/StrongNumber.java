import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumOfFactorials = 0;
        int startNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            int factorial = 1;
            for (int n = 1; n <= lastDigit; n++) {
                factorial = factorial * n;
            }
            sumOfFactorials += factorial;
            number = number / 10;
        }
        if (startNumber == sumOfFactorials){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
