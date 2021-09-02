import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String reverseName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            char currentSymbol = name.charAt(i);
            reverseName += currentSymbol;
        }
        System.out.println(reverseName);
    }
}
