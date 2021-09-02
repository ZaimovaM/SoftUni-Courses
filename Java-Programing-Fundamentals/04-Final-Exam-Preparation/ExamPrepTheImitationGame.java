import java.util.Scanner;

public class ExamPrepTheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");
            String typeCommand = commandParts[0];

            if (typeCommand.equals("Move")) {
                int numberOfLetters = Integer.parseInt(commandParts[1]);
                String firstLetters = message.substring(0, numberOfLetters);
                message.delete(0, numberOfLetters);
               message.append(firstLetters);


            } else if (typeCommand.equals("Insert")) {

                int index = Integer.parseInt(commandParts[1]);

                    String value = commandParts[2];
                    message.insert(index, value);


            } else if (typeCommand.equals("ChangeAll")) {
                String substring = commandParts[1];
                String replacement = commandParts[2];
               message = new StringBuilder(message.toString().replaceAll(substring, replacement));
            }


            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message.toString());
    }
}
