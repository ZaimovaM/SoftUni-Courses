import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userNames = scanner.nextLine().split(", ");

        for (String userName: userNames) {
            boolean isValidUserName = isValidName(userName);
            if (isValidUserName){
                System.out.println(userName);
            }

        }
    }

    private static boolean isValidName(String userName) {
        boolean isValid = false;

        if ((userName.length() >= 3 && userName.length() <= 16)) {

            for (int i = 0; i < userName.length(); i++) {
                char currentSymbol = userName.charAt(i);
                if ((Character.isLetterOrDigit(currentSymbol) || currentSymbol == '-' || currentSymbol == '_')) {
                    isValid = true;
                } else {
                    return false;
                }
            }
        }
        return isValid;

    }
}
