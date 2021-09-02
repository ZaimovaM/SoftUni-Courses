import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShopingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")){
            String [] type = command.split("\\s+");
            if (type[0].equals("Urgent")){
                String item = type [1];
                boolean isFound = containsItem(item, shoppingList);
                if (!isFound){
                    shoppingList.add(0, item);
                }

            } else if (type[0].equals("Unnecessary")) {
                String item = type [1];
                boolean isFound = containsItem(item, shoppingList);
                if (isFound){
                    shoppingList.remove(item);
                }
            } else if (type[0].equals("Correct")){
                String oldItem = type [1];
                String newItem = type [2];
                boolean isFound = containsItem(oldItem, shoppingList);
                if (isFound){
                    for (int index = 0; index < shoppingList.size(); index++) {
                        if (shoppingList.get(index).equals(oldItem)){
                            shoppingList.remove(index);
                            shoppingList.add(index, newItem);
                        }
                    }

                }

            } else if (type[0].equals("Rearrange")){
                String item = type [1];
                boolean isFound = containsItem(item, shoppingList);
                if (isFound){
                    shoppingList.remove(item);
                    shoppingList.add(item);
                }
            }

            command = scanner.nextLine();
        }
        for (int index = 0; index <= shoppingList.size() - 1; index++) {
            if (index == shoppingList.size() - 1){
                System.out.println(shoppingList.get(index));
            } else {
                System.out.print(shoppingList.get(index) + ", ");
            }
        }


    }

    private static boolean containsItem(String item, List<String> shoppingList) {
        return shoppingList.contains(item);
    }
}
