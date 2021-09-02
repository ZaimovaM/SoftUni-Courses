import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filedSize = Integer.parseInt(scanner.nextLine());
        int[] filed = new int[filedSize];

        int[] ladyBugsIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int index : ladyBugsIndexes) {
            if (index >= 0 && index <= filed. length - 1) {
                filed[index] = 1;
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            if (index >= 0 && index <= filed.length - 1 && filed[index] == 1) {
                filed[index] = 0;
                if (direction.equals("right")) {
                    index += flyLength;


                    while (index <= filed.length - 1 && filed[index] == 1) {
                        index += flyLength;
                    }
                    if (index <= filed.length - 1) {
                        filed[index] = 1;
                    }
                } else if (direction.equals("left")) {
                    index -= flyLength;
                    while (index >= 0 && filed[index] == 1) {
                        index -= flyLength;
                    }
                    if (index >= 0) {
                        filed[index] = 1;
                    }
                }
            }


            command = scanner.nextLine();
        }
        for (int number : filed) {
            System.out.print(number + " ");
        }


    }
}

