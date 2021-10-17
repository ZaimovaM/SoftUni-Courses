package GenericCountMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();

        for (int i = 1; i <= n; i++) {
            String value = scanner.nextLine();
            box.add(value);
        }
        String element = scanner.nextLine();
        int greaterElementsCount = box.countOfGreaterItems(element);
        System.out.println(greaterElementsCount);


    }
}
