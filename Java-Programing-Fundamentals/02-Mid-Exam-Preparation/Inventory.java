import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> journal = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String[] splitCommand = command.split("\\s+\\-\\s+");
            String firstCommand = splitCommand[0];
            if (firstCommand.equals("Collect")) {
                String item = splitCommand[1];
                boolean isFound = contain(item, journal);
                if (!isFound) {
                    journal.add(item);
                }
            } else if (firstCommand.equals("Drop")) {
                String item = splitCommand[1];
                boolean isFound = contain(item, journal);
                if (isFound) {
                    journal.remove(item);
                }

            } else if (firstCommand.equals("Combine Items")) {
                String item = splitCommand[1];
                String[] splitItems = item.split(":");
                String oldItem = splitItems[0];
                String newItem = splitItems[1];
                boolean isFound = contain(oldItem,journal);
                if (isFound){
                    for (int i = 0; i < journal.size(); i++) {
                        if (journal.get(i).equals(oldItem)){
                            journal.add(i + 1, newItem);
                        }
                    }
                }

            } else if (firstCommand.equals("Renew")) {
                String item = splitCommand[1];
                boolean isFound = contain(item, journal);
                if (isFound){
                    journal.remove(item);
                    journal.add(item);
                }
            }

            command = scanner.nextLine();
        }
        for (int item = 0; item <= journal.size() - 1; item++) {
            if (item == journal.size() - 1){
                System.out.print(journal.get(item));
            } else {
                System.out.print(journal.get(item) + ", ");
            }
        }


    }

    private static boolean contain(String item, List<String> journal) {
        return journal.contains(item);
    }
}
