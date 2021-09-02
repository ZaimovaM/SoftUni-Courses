package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Double> order = new LinkedHashMap<>();
        Map<String, Integer> containsOrder = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] splitCommand = input.split(" ");
            String currentProduct = splitCommand[0];
            double price = Double.parseDouble(splitCommand[1]);
            int quantity = Integer.parseInt(splitCommand[2]);

            if (!order.containsKey(currentProduct)) {
                order.put(currentProduct, quantity * price);
                containsOrder.put(currentProduct, quantity);
            } else {
                int currentQuantity = containsOrder.get(currentProduct);
                int allQuantity = currentQuantity + quantity;
                order.put(currentProduct, allQuantity * price);
                containsOrder.put(currentProduct, allQuantity);
            }


            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : order.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
