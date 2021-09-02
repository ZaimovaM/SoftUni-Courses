import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int nonPrimeSum = 0;
        int primeSum = 0;

        while (!input.equals("stop")){
            int currentNum = Integer.parseInt(input);//3
            boolean isPrime = true;

            if (currentNum < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
// proverqvame dali chisloto e neprosto
            for (int i = 2; i <= currentNum - 1; i++) {
                if (currentNum % i == 0){
                    nonPrimeSum += currentNum;
                    isPrime = false;
                    break;
                }

            }
            if (isPrime){
                primeSum += currentNum;
            }



            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}
