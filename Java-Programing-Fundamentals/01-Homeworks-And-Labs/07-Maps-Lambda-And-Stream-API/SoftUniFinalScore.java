package com.company;

import java.util.*;

public class SoftUniFinalScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> students = new TreeMap<>();
        Map<String, Integer> submissions = new TreeMap<>();


        while (!input.equals("exam finished")) {
            String[] splitInput = input.split("-");
            String studentName = splitInput[0];
            String language = splitInput[1];
            if (splitInput.length > 2) {
                int points = Integer.parseInt(splitInput[2]);
                students.put(studentName, points);
                if (!submissions.containsKey(language)) {
                    submissions.put(language, 1);
                } else {
                    int currentSubmission = submissions.get(language);
                    submissions.put(language, currentSubmission + 1);
                }
            } else {
                students.remove(studentName);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        students.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey()+ " | " + entry.getValue()));
        System.out.println("Submissions:");
        submissions.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey()+ " - " + entry.getValue()));
    }
}
