import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Map<Character, Integer> characters = new LinkedHashMap<>();
        for (int word = 0; word <= input.length - 1; word++) {
            String currentWord = input[word];
            for (int symbol = 0; symbol <= currentWord.length() -1; symbol++) {
                char currentSymbol = currentWord.charAt(symbol);
                if (!characters.containsKey(currentSymbol)) {
                    characters.put(currentSymbol, 1);
                } else {
                    characters.put(currentSymbol, characters.get(currentSymbol) + 1);
                }

            }
        }
        for (Map.Entry<Character, Integer> entry: characters.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
