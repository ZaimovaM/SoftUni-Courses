package com.company;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        System.out.printf("%.2f", getDivisionBetweenTwoNum(firstNum,secondNum));


    }

    private static double getDivisionBetweenTwoNum(int firstNum, int secondNum) {
        double factorialFirstNum = 1;
        for (int i = firstNum; i >= 1; i--) {
            factorialFirstNum *= i;
        }
        double factorialSecondNum = 1;
        for (int i = secondNum; i >= 1 ; i--) {
            factorialSecondNum *= i;
        }
        return factorialFirstNum / factorialSecondNum;
    }
}
