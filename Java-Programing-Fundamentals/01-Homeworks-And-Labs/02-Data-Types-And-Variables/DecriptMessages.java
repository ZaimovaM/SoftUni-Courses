import java.util.Scanner;

public class DecriptMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numberOfRow = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int row = 1; row <= numberOfRow; row++) {
            char letter = scanner.nextLine().charAt(0);

            int newLetter = letter + n;
            message += (char) newLetter;
        }
        System.out.println(message);
    }
}
