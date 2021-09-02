import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int num1 = 0; num1 <= n; num1++){
            for (int num2 = 0; num2 <= n; num2++) {
                for (int num3 = 0; num3 <= n; num3++) {
                   if (num1 + num2 + num3 == n){

                    counter++;
                }
                }
            }
        }
        System.out.printf("%d", counter);
    }

}
