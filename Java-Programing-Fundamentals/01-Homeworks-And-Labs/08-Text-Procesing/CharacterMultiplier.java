import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strings = input.split(" ");
        char[] firstString = strings[0].toCharArray();
        char[] secondString = strings[1].toCharArray();
        int sum = 0;
        if (firstString.length == secondString.length) {
            for (int i = 0; i < firstString.length; i++) {
                char first = firstString[i];
                char second = secondString[i];
                int multiply = (int) first * (int) second;
                sum += multiply;
            }
        } else if (firstString.length < secondString.length){
            for (int i = 0; i < firstString.length; i++) {
                char first = firstString[i];
                char second = secondString[i];
                int multiply = (int) first * (int) second;
                sum += multiply;
            }
            for (int i = firstString.length; i < secondString.length; i++) {
                sum += (int)secondString[i];
            }
        } else {
            for (int i = 0; i < secondString.length; i++) {
                char first = firstString[i];
                char second = secondString[i];
                int multiply = (int) first * (int) second;
                sum += multiply;
            }
            for (int i = secondString.length; i < firstString.length; i++) {
                sum += (int)firstString[i];
            }
        }
        System.out.println(sum);

    }
}
