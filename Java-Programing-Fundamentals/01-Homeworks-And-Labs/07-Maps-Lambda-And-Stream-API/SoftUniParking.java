package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();

        for (int car = 1; car <= n; car++) {
            String input = scanner.nextLine();
            String[] inputParts = input.split("\\s+");
            String command = inputParts[0];


            if (command.equals("register")) {
                String userName = inputParts[1];
                String licensePlateNumber = inputParts[2];
                if (!parking.containsKey(userName)) {
                    parking.put(userName, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", userName, licensePlateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                }
            } else if (command.equals("unregister")) {
                String userName = inputParts[1];
                if (parking.containsKey(userName)) {
                    parking.remove(userName);
                    System.out.printf("%s unregistered successfully%n", userName);
                } else {
                    System.out.printf("ERROR: user %s not found%n", userName);
                }
            }

        }
        parking.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
