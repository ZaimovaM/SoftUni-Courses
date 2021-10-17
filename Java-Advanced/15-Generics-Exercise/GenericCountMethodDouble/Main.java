package GenericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();

        for (int i = 1; i <= n; i++) {
            double value = Double.parseDouble(scanner.nextLine());
            box.add(value);
        }
        double element = Double.parseDouble(scanner.nextLine());
        int greaterElementsCount = box.countOfGreaterItems(element);
        System.out.println(greaterElementsCount);


    }
}
