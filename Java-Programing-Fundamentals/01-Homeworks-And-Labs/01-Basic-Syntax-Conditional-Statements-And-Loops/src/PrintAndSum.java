import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int sumOfAllNumbers = 0;
        for (int number = firstNumber; number <= secondNumber; number++) {
            System.out.print(number + " ");
            sumOfAllNumbers += number;
        }
        System.out.println();
        System.out.printf("Sum: %d", sumOfAllNumbers);
    }
}
