import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int openBrackets = 0;
        int closedBrackets = 0;
        for (int row = 1; row <= n; row++) {
            String input = scanner.nextLine();
            char symbol = input.charAt(row);

            if (symbol == 40) {
                openBrackets++;
            } else if (symbol == 41) {
                closedBrackets++;
            }

        }
        if (openBrackets == closedBrackets) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}