package com.company;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);
        printCountVowels(input);
    }

    private static void printCountVowels(String input) {
        int countVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u'){
                countVowels++;
            }

        }
        System.out.println(countVowels);
    }

}
