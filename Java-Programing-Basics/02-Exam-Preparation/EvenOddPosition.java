import java.util.Scanner;

public class EvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double evenMin = Integer.MAX_VALUE;
        double oddMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double oddSum = 0;
        double evenSum = 0;

        for (int number = 1; number <= n; number++) {
            double value = Double.parseDouble(scanner.nextLine());
            if (number % 2 == 1) {
                oddSum += value;
                if (value > oddMax) {
                    oddMax = value;
                }
                if (value < oddMin) {
                    oddMin = value;
                }
            } else {
                evenSum += value;
                if (value > evenMax) {
                    evenMax = value;
                }
                if (value < evenMin) {
                    evenMin = value;
                }
            }
        }

            System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddSum == 0) {
            System.out.printf("OddMin=No,%n");
            System.out.printf("OddMax=No,%n");
        }else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
            System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenSum == 0){
            System.out.printf("EvenMin=No,%n");
            System.out.println("EvenMax=No");
        } else  {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }

    }
}