package GenericBoOfIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box<>();

        for (int i = 1; i <= n; i++) {
           int value = Integer.parseInt(scanner.nextLine());
            box.add(value);
        }

        System.out.println(box);
    }
}
