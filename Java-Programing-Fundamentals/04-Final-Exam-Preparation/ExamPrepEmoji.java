import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamPrepEmoji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);
        Matcher matcherDigits = patternDigits.matcher(text);

        String regexEmoji = "(?<Separator>[*|:]{2})(?<name>[A-Z][a-z]{2,})\\1";
        Pattern patternEmoji = Pattern.compile(regexEmoji);
        Matcher matcherEmoji = patternEmoji.matcher(text);
        List<String> emojis = new ArrayList<>();
        BigInteger coolThreshold = new BigInteger(String.valueOf(1));
        while (matcherDigits.find()){
            int currentDigit = Integer.parseInt(matcherDigits.group());
           coolThreshold = coolThreshold.multiply(BigInteger.valueOf(currentDigit));
        }
        int countEmoji = 0;
        while (matcherEmoji.find()){
            countEmoji++;
            int coolnessCurrentEmoji = 0;
            String currentEmoji = matcherEmoji.group();
            String currentEmojiName = matcherEmoji.group("name");
            for (char symbol : currentEmojiName.toCharArray()) {
                coolnessCurrentEmoji += (int) symbol;
            }
            if (coolnessCurrentEmoji >= coolThreshold.intValue()) {
                emojis.add(currentEmoji);
            }
        }
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.printf("%d emojis found in the text. ", countEmoji);
        System.out.println("The cool ones are:");
        if (!emojis.isEmpty()) {
            emojis.forEach(System.out::println);
        }

    }
}
