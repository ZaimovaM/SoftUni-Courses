import java.util.Scanner;

public class ExamPrepSecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder massage = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {
            String[] commandParts = command.split(":\\|:");
            String typeCommand = commandParts[0];
            if (typeCommand.equals("InsertSpace")) {

                int index = Integer.parseInt(commandParts[1]);
                massage.insert(index, " ");
                System.out.println(massage);
            } else if (typeCommand.equals("Reverse")) {
                String substring = commandParts[1];
                StringBuilder subs = new StringBuilder(substring);
                String reverseSubstring = subs.reverse().toString();

                if (massage.toString().contains(substring)) {
                    int indexSubs = massage.indexOf(substring.toString());
                    massage.delete(indexSubs, indexSubs + substring.length());
                    massage.append(reverseSubstring);
                    System.out.println(massage);

                } else {
                    System.out.println("error");
                }
            } else if (typeCommand.equals("ChangeAll")) {
                String substringToChange = commandParts[1];
                String replacement = commandParts[2];
                massage = new StringBuilder(massage.toString().replaceAll(substringToChange, replacement));
                System.out.println(massage);
            }

            command = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", massage.toString());

    }

}

