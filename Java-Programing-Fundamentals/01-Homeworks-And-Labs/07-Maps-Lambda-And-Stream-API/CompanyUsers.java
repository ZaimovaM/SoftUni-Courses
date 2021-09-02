package com.company;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> companyEmployees = new TreeMap<>();
        while (!input.equals("End")) {
            String[] splitCommand = input.split(" -> ");
            String companyName = splitCommand[0];
            String id = splitCommand[1];

            if (!companyEmployees.containsKey(companyName)) {
                companyEmployees.put(companyName, new ArrayList<>());
            }
            if (!companyEmployees.get(companyName).contains(id)) {
                companyEmployees.get(companyName).add(id);
            }


            input = scanner.nextLine();
        }

        companyEmployees.entrySet().forEach(entry -> {
            System.out.printf("%s%n", entry.getKey());
            entry.getValue().stream().forEach(employeeId -> System.out.println("-- " + employeeId));


        });



    }
}
