import java.util.Scanner;

public class ReplaceRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        StringBuilder newTex = new StringBuilder();

        char firstLetter = inputText.charAt(0);
        newTex.append(firstLetter);

        for (int i = 1; i <= inputText.length() - 1; i++) {
            char currentSymbol = inputText.charAt(i);
            if (currentSymbol != newTex.charAt(newTex.length() - 1)){
                newTex.append(currentSymbol);
            }
        }
        System.out.println(newTex);
    }
}
