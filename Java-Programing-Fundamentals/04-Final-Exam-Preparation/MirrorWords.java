import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(?<Separator>[@#]{1})(?<firstWord>[A-Za-z]{3,})\\1{2}(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int countWords = 0;
        boolean isFindPairs = false;
        List<String> mirrorWords = new ArrayList<>();
        while (matcher.find()) {
            isFindPairs = true;
            countWords++;
            StringBuilder firstWord = new StringBuilder(matcher.group("firstWord"));
            String secondWord = matcher.group("secondWord");
            String firstWordReversed = firstWord.reverse().toString();
            if (secondWord.equals(firstWordReversed)) {
                mirrorWords.add(secondWord);
            }

        }
        if (!isFindPairs){
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.println(countWords + " word pairs found!");
            if (mirrorWords.size() > 0) {
                System.out.println("The mirror words are:");
                for (int i = 0; i <= mirrorWords.size() - 1; i++) {
                    StringBuilder currentFirstWord = new StringBuilder();
                    for (int j = mirrorWords.get(i).toCharArray().length - 1; j >= 0; j--) {
                        currentFirstWord.append(mirrorWords.get(i).toCharArray()[j]);
                    }
                    if (i != mirrorWords.size() - 1){
                        System.out.print(currentFirstWord + " <=> " + mirrorWords.get(i) + ", ");
                    } else {
                        System.out.print(currentFirstWord + " <=> " + mirrorWords.get(i));
                    }
                }

            } else {
                System.out.println("No mirror words!");
            }
        }
    }
}
