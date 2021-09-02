package com.company;

import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if (times > 10) {
            System.out.printf("%d X %d = %d", n, times, n * times);
        } else {
            for (int i = n; i <= n; i++) {
                for (int j = times; j <= 10; j++) {
                    int product = n * j;
                    System.out.printf("%d X %d = %d%n", n, j, product);

                }

            }
        }
    }
}
