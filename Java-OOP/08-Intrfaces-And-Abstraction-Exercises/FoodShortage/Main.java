package FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buyersCount = Integer.parseInt(scanner.nextLine());

        List<Buyer> buyers = new ArrayList<>();

        while (buyersCount-- > 0) {
            String[] inputData = scanner.nextLine().split("\\s+");

            Buyer buyer = inputData.length == 3
                    ? new Rebel(inputData[0], Integer.parseInt(inputData[1]), inputData[2])
                    : new Citizen(inputData[0], Integer.parseInt(inputData[1]), inputData[2], inputData[3]);

            buyers.add(buyer);
        }
        String name = scanner.nextLine();

        while (!name.equals("End")) {
//            boolean isBuy = false;
//            for (Buyer buyer : buyers) {
//                if (buyer.getName().equals(name)) {
//                    buyer.buyFood();
//                    isBuy = true;
//
//                }
//                if (isBuy) {
//                    break;
//                }
//            }

            name = scanner.nextLine();
        }

        int totalFood = buyers.stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFood);
    }
}
