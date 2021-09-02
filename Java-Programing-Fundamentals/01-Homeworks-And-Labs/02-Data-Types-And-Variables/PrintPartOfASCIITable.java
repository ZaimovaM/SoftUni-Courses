import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstChar = Integer.parseInt(scanner.nextLine());
        int lastChar = Integer.parseInt(scanner.nextLine());

        for (int i = firstChar; i <= lastChar; i++) {

            System.out.print((char)i + " ");

        }
    }
}
