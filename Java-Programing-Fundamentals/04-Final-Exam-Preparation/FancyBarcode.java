import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBarcodes = Integer.parseInt(scanner.nextLine());
        String regex = "(?<Separator>[@][#]+)(?<name>[A-Z][A-Za-z0-9]{4,}[A-Z])(?<Separator2>[@][#]+)";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 1; i <= countBarcodes; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                char[] name = matcher.group("name").toCharArray();
                StringBuilder productGroup = new StringBuilder();
                boolean containsDigit = false;
                for (char symbol : name) {
                    if (Character.isDigit(symbol)) {
                        productGroup.append(symbol);
                        containsDigit = true;
                    }
                }
                if (!containsDigit){
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + productGroup);
                }



            } else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
