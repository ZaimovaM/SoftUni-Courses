import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<String> furniture = new ArrayList<>();
        double totalPrice = 0;
        while (!command.equals("Purchase")){
            String regex = ">>(?<furniture>\\w+ ?\\w*)<<(?<price>\\d+.*)!(?<quantity>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);


            while (matcher.find()){
                String furnitureName = matcher.group("furniture");
                furniture.add(furnitureName);
                double price = Double.parseDouble(matcher.group("price"));

                int quantity = Integer.parseInt(matcher.group("quantity"));
                double sum = price * quantity;
                totalPrice += sum;
            }


            command = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String boughtFurniture: furniture) {
            System.out.println(boughtFurniture);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
