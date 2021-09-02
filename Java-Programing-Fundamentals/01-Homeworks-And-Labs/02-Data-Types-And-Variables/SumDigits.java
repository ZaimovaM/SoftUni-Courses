import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            int waste = number / 10;
            sumDigits += lastDigit;
            number = waste;

        }
        System.out.println(sumDigits);

    }
}
