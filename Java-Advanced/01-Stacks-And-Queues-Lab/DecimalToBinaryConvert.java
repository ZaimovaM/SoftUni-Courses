import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryNumber = new ArrayDeque<>();

        if (decimalNumber == 0){
            System.out.println(0);
            return;
        }
        while (decimalNumber != 0){
            binaryNumber.push(decimalNumber % 2);
            decimalNumber = decimalNumber / 2;

        }
        for (int number : binaryNumber) {
            System.out.print(number);
        }
    }
}
