import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        if (operator.equals("+")) {
            result = N1 + N2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", N1, operator, N2, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", N1, operator, N2, result);
            }
        } else if (operator.equals("-")) {
            result = N1 - N2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", N1, operator, N2, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", N1, operator, N2, result);
            }
        } else if (operator.equals("*")) {
            result = N1 * N2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", N1, operator, N2, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", N1, operator, N2, result);
            }
        } else if (operator.equals("/")) {
            if (!(N2 == 0)) {
                result = (double) N1 / N2;
                System.out.printf("%d %s %d = %.2f", N1, operator, N2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", N1);
            }
        } else if (operator.equals("%")) {
            if (!(N2 == 0)) {
                result = N1 % N2;
                System.out.printf("%d %s %d = %.0f", N1, operator, N2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", N1);
            }
        }
    }
}
