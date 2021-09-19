import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> indexes = new ArrayDeque<>();
        String expression = scanner.nextLine();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);
            if (current == '('){
                indexes.push(i);
            } else if (current == ')'){
                int beginIndex = indexes.pop();
                System.out.println(expression.substring(beginIndex, i + 1));
            }
        }
    }
}
