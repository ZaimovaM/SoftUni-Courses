import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] type = command.split(" ");
            if (type[0].equals("Add")) {
                int number = Integer.parseInt(type[1]);
                numbers.add(number);
            } else if (type[0].equals("Insert")) {
                int number = Integer.parseInt(type[1]);
                int index = Integer.parseInt(type[2]);
                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (type[0].equals("Remove")) {
                int index = Integer.parseInt(type[1]);
                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (type[0].equals("Shift")) {
                int count = Integer.parseInt(type[2]);

                if (type[1].equals("left")) {
                    while (count >= 1) {
                        int firstNum = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(firstNum);
                        count--;
                    }
                } else if (type[1].equals("right")) {
                    while (count >= 1) {
                        int lastNum = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.get(numbers.size() - 1));
                        numbers.add(0, lastNum);
                        count--;
                    }

                }
            }


            command = scanner.nextLine();
        }
        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }
}
