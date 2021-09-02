import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        int number = (int) letter;
        if (number >= 65 && number <= 90){
            System.out.println("upper-case");
        } else if (number >= 97 && number <= 122){
            System.out.println("lower-case");
        }
    }
}
