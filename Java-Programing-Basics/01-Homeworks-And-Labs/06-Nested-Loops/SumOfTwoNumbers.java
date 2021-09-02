import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int began = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int countCombination = 0;
        boolean flag = false;
        for (int i = began; i <= end; i++) {
            for (int j = began; j <= end; j++) {
                countCombination++;
                if (i + j == magicNumber) {
                    flag = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", countCombination, i,j,magicNumber);
                    break;
                }
            } if (flag){
                break;
            }
        }
if (!flag) {
    System.out.printf("%d combinations - neither equals %d", countCombination, magicNumber);

}
    }
}
