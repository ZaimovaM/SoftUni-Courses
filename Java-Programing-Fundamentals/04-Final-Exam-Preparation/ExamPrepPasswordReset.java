import java.util.Scanner;

public class ExamPrepPasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        StringBuilder newPassword = new StringBuilder();
        String command = scanner.nextLine();


        while (!command.equals("Done")) {
            String[] commandParts = command.split(" ");
            String typeCommand = commandParts[0];

            if (typeCommand.equals("TakeOdd")) {
                for (int i = 0; i < password.length(); i++) {

                    if (i % 2 == 1) {
                        newPassword.append(password.toCharArray()[i]);

                    }
                }
                password = newPassword.toString();
                System.out.println(password);

            } else if (typeCommand.equals("Cut")) {
                int index = Integer.parseInt(commandParts[1]);
                int length = Integer.parseInt(commandParts[2]);

               String substringToRemove = password.substring(index, index + length);
              password = password.replaceFirst(substringToRemove, "");
                System.out.println(password);

            } else if (typeCommand.equals("Substitute")) {
                String substring = commandParts[1];
                String substitute = commandParts[2];
                if (password.contains(substring)) {

                    password = password.replaceAll(substring, substitute);

                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}
