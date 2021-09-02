import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (char symbol: input.toCharArray()) {
            if (Character.isDigit(symbol)){
                digits.append(symbol);
            } else if (Character.isLetter(symbol)){
                letters.append(symbol);
            } else {
                symbols.append(symbol);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(symbols.toString());

    }
}
