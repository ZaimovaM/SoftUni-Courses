package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            String typeCommand = command[0];
            switch (typeCommand) {
                case "exchange":
                    int exchangeIndex = Integer.parseInt(command[1]);
                    if (isValidIndex(exchangeIndex, numbers.length)) {
                      numbers = exchange(numbers, exchangeIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String evenOrOdd = command[1];
                    if (evenOrOdd.equals("even")) {
                        printIndexMaxEvenNumber(numbers);

                    } else if (evenOrOdd.equals("odd")) {
                        printIndexMaxOddNumber(numbers);
                    }
                    break;
                case "min":
                    String minEvenOrOdd = command[1];
                    if (minEvenOrOdd.equals("even")) {
                        printIndexMinEvenNumber(numbers);

                    } else if (minEvenOrOdd.equals("odd")) {
                        printIndexMinOddNumber(numbers);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(command[1]);
                    if (!isValidCount(count, numbers.length)){
                        System.out.println("Invalid count");
                        input = scanner.nextLine();
                        continue;
                    }
                    String firstEvenOrOdd = command[2];
                    if (firstEvenOrOdd.equals("even")){
                        printFirstEvenElements(numbers, count);

                    } else if (firstEvenOrOdd.equals("odd")){
                        printFirstOddElements(numbers, count);
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(command[1]);
                    if (!isValidCount(countLast, numbers.length)){
                        System.out.println("Invalid count");
                        input = scanner.nextLine();
                        continue;
                    }
                    String lastEvenOrOdd = command[2];
                    if (lastEvenOrOdd.equals("even")){
                        printLastEvenElements(numbers, countLast);

                    } else if (lastEvenOrOdd.equals("odd")){
                        printLastOddElements(numbers, countLast);
                    }
                    break;

            }


            input = scanner.nextLine();
        }
        System.out.print("[");
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i == numbers.length - 1){
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.print("]");

    }


    private static boolean isValidCount(int count, int length) {
        return count <= length;
    }

    private static void printLastOddElements(int[] numbers, int countLast) {
        String lastOdd = "";
        for (int i = numbers.length - 1; i >= 0; i--) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 1){
                lastOdd += currentNumber;
                countLast--;
            }
            if (countLast == 0){

                break;
            }
        }
        System.out.print("[");
        for (int index = lastOdd.length() - 1; index >= 0; index--) {
            if (index == 0){
                System.out.print(lastOdd.charAt(index));
            } else {
                System.out.print(lastOdd.charAt(index) + ", ");
            }

        }
        System.out.println("]");
    }

    private static void printLastEvenElements(int[] numbers, int countLast) {
        String lastEven = "";
        for (int i = numbers.length - 1; i >= 0; i--) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0){
                lastEven += currentNumber;
                countLast--;
            }
            if (countLast == 0){
                break;
            }
        }
        System.out.print("[");
        for (int index = lastEven.length() - 1; index >= 0; index--) {
            if (index == 0){
                System.out.print(lastEven.charAt(index));
            } else {
                System.out.print(lastEven.charAt(index) + ", ");
            }

        }
        System.out.println("]");


    }

    private static void printFirstOddElements(int[] numbers, int count) {

        String output = "";

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 1){
                output += currentNumber;

                count--;
            }
            if (count == 0){

                break;
            }



        }

        System.out.print("[");
        for (int i = 0; i <= output.length() - 1; i++) {
            if (i == output.length() - 1){
                System.out.print(output.charAt(i));
            } else {
                System.out.print(output.charAt(i) + ", ");
            }
        }
        System.out.print("]");
        System.out.println();

    }


    private static void printFirstEvenElements(int[] numbers, int count) {

        String output = "";

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0){
               output += currentNumber;
              count--;
                }
            if (count == 0){
                break;
            }


        }
        System.out.print("[");
        for (int i = 0; i <= output.length() - 1; i++) {
            if (i == output.length() - 1){
                System.out.print(output.charAt(i));
            } else {
                System.out.print(output.charAt(i) + ", ");
            }
        }
        System.out.print("]");
        System.out.println();


    }

    private static void printIndexMinOddNumber(int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int indexMinOdd = -1;

        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 1 && currentNum <= minOdd) {
                minOdd = currentNum;
                indexMinOdd = i;
            }

        }
        if (indexMinOdd == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinOdd);
        }

    }

    private static void printIndexMinEvenNumber(int[] numbers) {
        int minEven = Integer.MAX_VALUE;
        int indexMinEven = -1;

        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 0 && currentNum <= minEven) {
                minEven = currentNum;
                indexMinEven = i;
            }

        }
        if (indexMinEven == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinEven);
        }
    }

    private static void printIndexMaxOddNumber(int[] numbers) {
        int maxOddNumber = Integer.MIN_VALUE;
        int indexMaxOdd = -1;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 1 && currentNumber >= maxOddNumber) {
                maxOddNumber = currentNumber;
                indexMaxOdd = index;
            }
        }
        if (indexMaxOdd == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxOdd);
        }

    }

    private static void printIndexMaxEvenNumber(int[] numbers) {
        int maxEvenNumber = Integer.MIN_VALUE;
        int indexMaxEven = -1;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0 && currentNumber >= maxEvenNumber) {
                maxEvenNumber = currentNumber;
                indexMaxEven = index;
            }
        }
        if (indexMaxEven == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxEven);
        }
    }

    private static int[] exchange(int[] numbers, int exchangeIndex) {
        int[] numbersToExchangeIndex = new int[exchangeIndex + 1];
        int[] numbersAfterExchangeIndex = new int[numbers.length - exchangeIndex - 1];

        for (int index = 0; index <= exchangeIndex; index++) {
            int currentElement = numbers[index];
            numbersToExchangeIndex[index] = currentElement;
        }
        for (int index = exchangeIndex + 1; index <= numbers.length - 1; index++) {
            int currentElement = numbers[index];
            numbersAfterExchangeIndex[index - exchangeIndex - 1] = currentElement;
        }

        int[] exchangedArray = new int[numbers.length];
        for (int index = 0; index <= numbersAfterExchangeIndex.length - 1; index++) {
            exchangedArray[index] = numbersAfterExchangeIndex[index];
        }
        for (int index = numbersAfterExchangeIndex.length; index <= exchangedArray.length - 1; index++) {
            exchangedArray[index] = numbersToExchangeIndex[index - numbersAfterExchangeIndex.length];

        }
        return numbers = exchangedArray;

    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index <= length - 1;
    }
}
