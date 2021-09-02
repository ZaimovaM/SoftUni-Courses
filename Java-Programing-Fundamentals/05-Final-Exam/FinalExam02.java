import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<name>[A-Za-z]{8,})\\]";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String decryptedMessage = matcher.group("name");
                StringBuilder encryptedMessage = new StringBuilder();
                for (char symbol: decryptedMessage.toCharArray()) {
                    encryptedMessage.append((int) symbol);
                    encryptedMessage.append(" ");
                }
                System.out.println(matcher.group("command") + ": " + encryptedMessage.toString());

            } else {
                System.out.println("The message is invalid");
            }

        }
    }
}
