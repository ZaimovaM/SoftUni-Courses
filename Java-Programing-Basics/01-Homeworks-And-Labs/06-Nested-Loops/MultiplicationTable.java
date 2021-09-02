import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++){
            for (int b = 1; b <= 10; b++){
                int result = a * b;
                System.out.printf("%d * %d = %d%n", a, b, result);
            }
        }
    }
}
