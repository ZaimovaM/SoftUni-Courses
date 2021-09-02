package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> collection = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!collection.containsKey(resource)) {
                collection.put(resource, quantity);
            } else {
                collection.put(resource, collection.get(resource) + quantity);
            }



            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : collection.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
