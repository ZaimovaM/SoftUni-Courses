import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startLetter = scanner.nextLine().charAt(0);
        char finishLetter = scanner.nextLine().charAt(0);
        char withoutLetter = scanner.nextLine().charAt(0);
        int countCombinations = 0;
        for (int letter = startLetter; letter <= finishLetter; letter++) {
            for (int i = startLetter; i <= finishLetter; i++) {
                for (int j = startLetter; j <= finishLetter; j++) {

                    char first = (char)letter;
                    char second = (char)i;
                    char third = (char)j;
                    if (letter == withoutLetter || i == withoutLetter || j == withoutLetter){
                        continue;
                    }
                    countCombinations++;
                    System.out.printf("%c%c%c ", first,second,third);

                }

            }



        }
        System.out.print(countCombinations);

    }
}
