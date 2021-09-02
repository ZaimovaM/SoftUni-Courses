import java.util.Locale;
import java.util.Scanner;

public class FinalExam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Sign up")) {
            String[] commandParts = command.split(" ");
            String typeCommand = commandParts[0];
            if (typeCommand.equals("Case")) {
                String typeCase = commandParts[1];
                if (typeCase.equals("lower")) {
                    username = username.toLowerCase(Locale.ROOT);
                    System.out.println(username);
                } else if (typeCase.equals("upper")) {
                    username = username.toUpperCase();
                    System.out.println(username);
                }

            } else if (typeCommand.equals("Reverse")) {
                int startIndex = Integer.parseInt(commandParts[1]);
                int endIndex = Integer.parseInt(commandParts[2]);
                if (startIndex >= 0 && startIndex <= username.length() - 1 && endIndex >= 0 && endIndex <= username.length() - 1) {
                    String newText = username.substring(startIndex, endIndex + 1);
                    StringBuilder reversedText = new StringBuilder(newText);
                    reversedText = reversedText.reverse();
                    System.out.println(reversedText);
                }

            } else if (typeCommand.equals("Cut")) {
                String substring = commandParts[1];
                if (username.contains(substring)) {
                    StringBuilder newUsername = new StringBuilder(username);
                    int startIndex = username.indexOf(substring);
                    newUsername.delete(startIndex, startIndex + substring.length());
                    System.out.println(newUsername);
                } else {
                    System.out.printf("The word %s doesn't contain %s.%n", username, substring);
                }

            } else if (typeCommand.equals("Replace")) {
                String symbol = commandParts[1];
                username = username.replaceAll(symbol,"*");
                System.out.println(username);

            } else if (typeCommand.equals("Check")) {
                String symbol = commandParts[1];
                if (username.contains(symbol)){
                    System.out.println("Valid");
                } else {
                    System.out.printf("Your username must contain %s.%n", symbol);
                }

            }

            command = scanner.nextLine();
        }
    }
}
