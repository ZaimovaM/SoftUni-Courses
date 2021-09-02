import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("end")){
            StringBuilder reversWord = new StringBuilder();
            for (int i = command.length() - 1; i >= 0 ; i--) {
                reversWord.append(command.toCharArray()[i]);
            }
            System.out.println(command + " = " + reversWord.toString());

            command = scanner.nextLine();
        }


    }
}
