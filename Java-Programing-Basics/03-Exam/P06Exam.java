import java.util.Scanner;

public class P06Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int digit1 = num % 10;
        int ost = num / 10;
        int digit2 = ost % 10;
        int ost2 = num / 100;
        int digit3 = ost2 % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);

        for (int i = 1; i <= digit1; i++) {
            for (int j = 1; j <= digit2; j++) {
                for (int k = 1; k <= digit3; k++) {
                    int product = i * j * k;
                    System.out.printf("%d * %d * %d = %d%n", i, j, k, product);

                }

            }

        }
    }
}
