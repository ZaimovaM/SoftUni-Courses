package com.company;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        if (grade >= 3.00) {
            System.out.println("com.company.BackIn30Minutes.Passed!");
        } else {
            System.out.printf("Failed!");
        }
    }
}
