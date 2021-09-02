import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(?<Separator>[#|\\|]{1})(?<itemName>[A-Za-z ]+)\\1(?<expirationDay>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+[0-9]*[0-9]*)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalCalories = 0;

        while (matcher.find()) {
            String calories = matcher.group("calories");
            totalCalories += Integer.parseInt(calories);
        }
        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        Matcher matcher1 = pattern.matcher(text);
        while (matcher1.find()) {
            String item = matcher1.group("itemName");
            String expirationDay = matcher1.group("expirationDay");
            String calories = matcher1.group("calories");

            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", item, expirationDay, calories);
        }

    }
}
