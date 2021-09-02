import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int numbers = 2; numbers <= n; numbers++) {
            boolean isPrime = true;
            for (int divider = 2; divider < numbers; divider++) {
                if (numbers % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", numbers, isPrime);
        }

    }
}
