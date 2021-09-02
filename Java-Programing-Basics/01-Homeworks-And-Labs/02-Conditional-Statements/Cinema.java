import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int places = rows * cols;
        double price = 0;
        if (type.equals("Premiere")){
            price = places * 12.00;
        } else if (type.equals("Normal")){
            price = places * 7.50;
        }
        else if (type.equals("Discount")){
            price = places * 5.00;
        }
        System.out.printf("%.2f leva", price);
    }
}
