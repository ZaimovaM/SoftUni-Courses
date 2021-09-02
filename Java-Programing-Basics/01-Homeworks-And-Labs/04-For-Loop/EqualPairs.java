import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int diff = 0;
        boolean sumEquals = false;

        for (int i = 1; i <= n; i++) {
            int value1 = Integer.parseInt(scanner.nextLine());
            int value2 = Integer.parseInt(scanner.nextLine());

            if (value1 + value2 == sum1) {
                sumEquals = true;
            } else {
                sumEquals = false;
                diff = sum1 - (value1 + value2);
            }
            sum1 = value1 + value2;
        }
        if (sumEquals || n == 1){
            System.out.printf("Yes, value=%d", sum1);
        } else
        System.out.printf("No, maxdiff=%d", Math.abs(diff));
    }
}
