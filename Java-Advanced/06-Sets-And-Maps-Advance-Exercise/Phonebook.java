import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phonebook = new HashMap<>();

        while (!input.equals("search")) {
            String[] inputParts = input.split("-");
            String name = inputParts[0];
            String number = inputParts[1];
            phonebook.put(name, number);

            input = scanner.nextLine();
        }
        String searchedName = scanner.nextLine();
        while (!searchedName.equals("stop")){
            if (phonebook.containsKey(searchedName)){
               String phoneNumber = phonebook.get(searchedName);
                System.out.println(searchedName + " -> " + phoneNumber);

            } else {
                System.out.printf("Contact %s does not exist.%n", searchedName);
            }


            searchedName = scanner.nextLine();
        }

    }
}
