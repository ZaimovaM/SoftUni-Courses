import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(wordToRemove)){

            text = removeOccurence(text, wordToRemove);

        }
        System.out.println(text);
    }

    private static String removeOccurence(String input, String wordToRemove) {
        int beginIndex = input.indexOf(wordToRemove);
        int endIndex = wordToRemove.length() + beginIndex;

        String firstPart = input.substring(0, beginIndex);
        String secondPart = input.substring(endIndex);

        return firstPart + secondPart;

    }
}
