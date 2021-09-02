import java.util.Locale;
import java.util.Scanner;

public class ActivationKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] splitInput = input.split(">>>");
            String command = splitInput[0];
            if (command.equals("Contains")) {
                String substring = splitInput[1];

                boolean isContain = activationKey.contains(substring);
                if (isContain) {
                    System.out.printf("%s contains %s", activationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }
            } else if (command.equals("Flip")) {
                String secondCommand = splitInput[1];
                int startIndex = Integer.parseInt(splitInput[2]);
                int endIndex = Integer.parseInt(splitInput[3]);

                if (secondCommand.equals("Upper")) {
                    String substring = activationKey.substring(startIndex, endIndex);
                    String subs = activationKey.substring(startIndex, endIndex).toUpperCase();

                    activationKey.substring(startIndex, endIndex).replace(substring, subs);
                    System.out.println(activationKey);
                } else if (secondCommand.equals("Lower")) {
                    String substring = activationKey.substring(startIndex, endIndex);
                    String subs = activationKey.substring(startIndex, endIndex).toLowerCase();

                    activationKey.substring(startIndex, endIndex).replace(substring, subs);
                    System.out.println(activationKey);
                }
            } else if (command.equals("Slice")) {
                int startIndex = Integer.parseInt(splitInput[1]);
                int endIndex = Integer.parseInt(splitInput[2]);
                for (int i = startIndex; i < endIndex; i++) {
                 String substring = activationKey.substring(startIndex, endIndex);

                }

            }


            input = scanner.nextLine();
        }
    }
}

