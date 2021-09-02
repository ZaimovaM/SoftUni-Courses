package com.company;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTopNumber(n);
    }

    private static void printTopNumber(int n) {

        for (int number = 1; number <= n; number++) {
            int currentNum = number;
            int sumOfDigits = 0;
            boolean isFoundOddDigit = false;
            while (currentNum > 0){
                int lastDigit = currentNum % 10;
                sumOfDigits += lastDigit;
                if (lastDigit % 2 == 1){
                    isFoundOddDigit = true;
                }

                currentNum = currentNum / 10;

            }
            if (sumOfDigits % 8 == 0 && isFoundOddDigit){
                System.out.println(number);
            }
        }
    }
}
