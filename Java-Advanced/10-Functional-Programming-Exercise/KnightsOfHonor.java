

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String[]> printNames =  array -> {
            for (String name : names) {
                System.out.println("Sir " + name);
            }
        };
        printNames.accept(names);

    }
}
