import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            System.out.println(isPalindrome(command));
            command = scanner.nextLine();
        }

    }

    private static boolean isPalindrome (String number){
        String reverseNumber = getReversedNumber(number) ;
        if (number.equals(reverseNumber)){
            return true;
        } else {
            return false;
        }
    }

    private static String getReversedNumber(String number) {
        String reversed = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            char currentElement = number.charAt(i);
            reversed += currentElement;
        }
       return reversed;
    }
}
