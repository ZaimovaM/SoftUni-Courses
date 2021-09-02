import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> loots = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {
            String[] splitInput = input.split("\\s+");
            String command = splitInput[0];
            if (command.equals("Loot")) {
                for (int i = 1; i <= splitInput.length - 1; i++) {
                    String item = splitInput[i];
                    if (loots.contains(item)) {
                        continue;
                    } else {
                        loots.add(0, item);
                    }
                }

            } else if (command.equals("Drop")) {
                int index = Integer.parseInt(splitInput[1]);
                if (index >= 0 && index <= loots.size() - 1) {
                    String element = loots.get(index);
                    loots.remove(index);
                    loots.add(loots.size(), element);
                }

            } else if (command.equals("Steal")) {
                int num = Integer.parseInt(splitInput[1]);
                if (num <= loots.size()) {
                    for (int i = loots.size() - num; i <= loots.size() - 1; i++) {
                        if (i == loots.size() - 1) {
                            System.out.print(loots.get(i));
                            System.out.println();
                        } else {
                            System.out.print(loots.get(i) + ", ");
                        }

                    }
                    for (int i = 1; i <= num; i++) {
                        loots.remove(loots.size() - 1);
                    }
                } else {
                    for (int i = 0; i <= loots.size() - 1; i++) {
                        if (i == loots.size() - 1) {
                            System.out.print(loots.get(i));
                            System.out.println();
                        } else {
                            System.out.print(loots.get(i) + ", ");
                        }

                    }
                    for (int i = 0; i <= loots.size() - 1; i++) {
                        loots.set(i, "Hello");
                    }
                    loots.removeAll(Arrays.asList("Hello"));
                }



            }


            input = scanner.nextLine();
        }
        double sum = 0;
        if (loots.size() > 0) {
            for (int i = 0; i <= loots.size() - 1; i++) {
                String item = loots.get(i);
                int length = item.length();
                sum += length;
            }
            double average = sum / loots.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);

        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
