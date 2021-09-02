import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word: bannedWords) {

           String wordInAsterisks = replaceLetterWithAsterisks(word);
           text = text.replace(word, wordInAsterisks);

        }
        System.out.println(text);


    }

    private static String replaceLetterWithAsterisks(String word) {
        String replaceLetter = "";
        for (int i = 0; i < word.length(); i++) {
             replaceLetter += "*";
        }
        return replaceLetter;
    }
}
