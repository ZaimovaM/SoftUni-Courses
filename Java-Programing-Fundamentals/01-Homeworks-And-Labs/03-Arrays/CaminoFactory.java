import java.util.Scanner;

public class CaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNames = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countNames; i++) {
            String name = scanner.nextLine();
            char [] array = new char[name.length()];
            int sum = 0;
            for (int symbol = 0; symbol < name.length(); symbol++) {
                int letter = symbol;
                
            }
            System.out.println(sum);
        }
    }
}
