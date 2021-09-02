package com.company;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> forceBook = new TreeMap<>();


        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String[] commands = input.split(" \\| ");
                String forceSide = commands[0];
                String forceUser = commands[1];

                forceBook.putIfAbsent(forceSide, new ArrayList<>());

                boolean isExist = false;
                for (List<String> list : forceBook.values()) {
                    if (list.contains(forceUser)) {
                        isExist = true;
                    }
                }
                if (!isExist){
                    forceBook.get(forceSide).add(forceUser);
                }

            } else {
                String[] commands = input.split(" -> ");
                String forceSide = commands[1];
                String forceUser = commands[0];

               forceBook.entrySet().forEach(entry -> entry.getValue().remove(forceUser));

               forceBook.putIfAbsent(forceSide, new ArrayList<>());
               forceBook.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }


            input = scanner.nextLine();
        }

        forceBook.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(user -> System.out.println("! " + user));
                });


    }
}
