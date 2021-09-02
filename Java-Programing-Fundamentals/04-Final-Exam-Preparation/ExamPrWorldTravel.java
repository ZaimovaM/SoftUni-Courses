import java.util.Scanner;

public class ExamPrWorldTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] splitCommand = command.split(":");
            String typeCommand = splitCommand[0];
            if (typeCommand.equals("Add Stop")) {
                int index = Integer.parseInt(splitCommand[1]);
                String stringToAdd = splitCommand[2];
                if (isValidIndex(index, input.length())) {
                    input.insert(index, stringToAdd);

                }
            } else if (typeCommand.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(splitCommand[1]);
                int endIndex = Integer.parseInt(splitCommand[2]);
                if (isValidIndex(startIndex, input.length()) && isValidIndex(endIndex, input.length())) {
                    input.delete(startIndex, endIndex + 1);

                }

            } else if (typeCommand.equals("Switch")) {
                String oldString = splitCommand[1];
                String newString = splitCommand[2];

               String destination = input.toString();
               destination = destination.replace(oldString, newString);
               input = new StringBuilder(destination);




            }
            System.out.println(input);


            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + input);
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index <= length - 1;
    }
}
