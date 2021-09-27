import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> characters = new TreeMap<>();
        for (int index = 0; index < text.length(); index++) {
            char currentChar = text.charAt(index);
            if (!characters.containsKey(currentChar)) {
                characters.put(currentChar, 1);
            } else {
                int count = characters.get(currentChar);
                characters.put(currentChar, count + 1);
            }
        }
        characters.entrySet().forEach(
                entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s")
        );

    }
}
