import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int letter = 96 + n;

        for (int i = 97; i <= letter; i++) {
            for (int j = 97; j <= letter; j++) {
                for (int k = 97; k <= letter; k++) {
                    System.out.printf("%c%c%c", (char)i, (char)j, (char)k);
                    System.out.println();

                }
            }
        }

    }
}
