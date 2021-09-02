package com.company;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> legendaryItems = new TreeMap<>();
        Map<String, Integer> junk = new TreeMap<>();
        legendaryItems.put("motes", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("shards", 0);
        boolean isBreak = false;

        while (legendaryItems.get("motes") < 250 || legendaryItems.get("fragments") < 250 || legendaryItems.get("shards") < 250) {
            String input = scanner.nextLine();
            String[] splitInput = input.split(" ");
            for (int i = 0; i < splitInput.length - 1; i++) {
                int quantity = Integer.parseInt(splitInput[i]);
                String item = splitInput[i + 1].toLowerCase();
                if (item.equals("motes")) {
                    int currentQuantity = legendaryItems.get(item);
                    legendaryItems.put(item, currentQuantity + quantity);
                    if (currentQuantity + quantity >= 250) {
                        isBreak = true;
                        break;

                    }
                } else if (item.equals("shards")) {
                    int currentQuantity = legendaryItems.get(item);
                    legendaryItems.put(item, currentQuantity + quantity);
                    if (currentQuantity + quantity >= 250) {
                        isBreak = true;
                        break;
                    }
                } else if (item.equals("fragments")) {
                    int currentQuantity = legendaryItems.get(item);
                    legendaryItems.put(item, currentQuantity + quantity);
                    if (currentQuantity + quantity >= 250) {
                        isBreak = true;
                        break;
                    }
                } else {
                    if (!junk.containsKey(item)) {
                        junk.put(item, quantity);
                    } else {
                        int currentQuantity = junk.get(item);
                        junk.put(item, currentQuantity + quantity);
                    }
                }

                i++;
            }
            if (isBreak){
                break;
            }
        }
        for (Map.Entry<String, Integer> entry : legendaryItems.entrySet()) {
            int value = entry.getValue();
            String item = entry.getKey();
            if (value >= 250){
                if (item.equals("shards")){
                    System.out.println("Shadowmourne obtained!");

                } else if (item.equals("motes")){
                    System.out.println("Dragonwrath obtained!");
                } else if (item.equals("fragments")){
                    System.out.println("Valanyr obtained!");
                }
                legendaryItems.put(item, legendaryItems.get(item) - 250);
            }
        }
        legendaryItems.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));



        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
