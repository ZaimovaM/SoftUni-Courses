import java.util.Scanner;

public class P01Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int count1 = Integer.parseInt(scanner.nextLine());
        int count2 = Integer.parseInt(scanner.nextLine());
        int count3 = Integer.parseInt(scanner.nextLine());
        int count4 = Integer.parseInt(scanner.nextLine());
        int count5 = Integer.parseInt(scanner.nextLine());

        int totalCount = count1 + count2 + count3 + count4 + count5;
        double sum = (count1 * 0.60) + (count2 * 7.20) + (count3 * 3.60) + (count4 * 18.20) + (count5 * 22);
        if (totalCount > 25) {
            sum = sum - (sum * 0.35);
        }
        sum = sum - (sum * 0.10);

        if (sum >= price) {
            System.out.printf("Yes! %.2f lv left.", sum - price);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", price - sum);
        }

    }
}
