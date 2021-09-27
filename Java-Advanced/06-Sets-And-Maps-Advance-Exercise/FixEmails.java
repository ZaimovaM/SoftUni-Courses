import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Map<String, String> fixEmails = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")){
                fixEmails.put(name, email);
            }

            name = scanner.nextLine();
        }
        fixEmails.entrySet().forEach(e -> System.out.println(
                e.getKey() + " -> " + e.getValue()
        ));

    }
}
