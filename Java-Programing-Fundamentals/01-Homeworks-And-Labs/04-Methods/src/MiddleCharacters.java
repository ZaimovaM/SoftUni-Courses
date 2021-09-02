package com.company;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMiddleCharacter(text);
    }

    private static void printMiddleCharacter(String text) {
        if (text.length() % 2 == 1) {
            String middleChar = "";
            for (int i = 0; i < text.length(); i++) {
                char middle = text.charAt(text.length() / 2);
                middleChar = "" + middle;
            }
            System.out.println(middleChar);

        } else {
            int index1 = text.length() / 2 - 1;
            int index2 = text.length() / 2;
            System.out.printf("%c%c", text.charAt(index1), text.charAt(index2));
        }
    }
}
