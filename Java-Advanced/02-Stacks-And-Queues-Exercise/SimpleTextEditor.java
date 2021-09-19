import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> wordState = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();
        for (int count = 1; count <= n; count++) {
            String command = scanner.nextLine();
            String commandNumber = command.split("\\s+")[0];
            if (commandNumber.equals("1")) {
                String textToAdd = command.split("\\s+")[1];
                currentText.append(textToAdd);
                wordState.push(currentText.toString());

            } else if (commandNumber.equals("2")) {
                int countElements = Integer.parseInt(command.split("\\s+")[1]);

                currentText.delete(currentText.length() - countElements, currentText.length());
                wordState.push(currentText.toString());
            } else if (commandNumber.equals("3")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                System.out.println(currentText.charAt(index - 1));

            } else if (commandNumber.equals("4")) {
                if (wordState.size() > 1) {
                    wordState.pop();
                    currentText = new StringBuilder(wordState.peek());
                } else {
                    currentText = new StringBuilder();
                }
            }
        }
    }
}
