import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumOfNum = 0;
        int currentNum = 0;

        for (int num = 1; num <= number; num++) {
            currentNum = num;
            while (num > 0) {
                sumOfNum += num % 10;
                num = num / 10;
            }
            if ((sumOfNum == 5) || (sumOfNum == 7) || (sumOfNum == 11)) {
                System.out.printf("%d -> True%n", currentNum);
            } else {
                System.out.printf("%d -> False%n", currentNum);
            }

            num = currentNum;
        }

    }
}
