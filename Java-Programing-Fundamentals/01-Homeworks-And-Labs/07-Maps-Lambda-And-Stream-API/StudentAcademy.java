package com.company;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();
        Map<String, Double> averageGrades = new LinkedHashMap<>();

        for (int student = 1; student <= n; student++) {
            String studentName = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());
            if (!studentsGrades.containsKey(studentName)) {
                studentsGrades.put(studentName, new ArrayList<>());
                studentsGrades.get(studentName).add(grade);
                averageGrades.put(studentName, grade);

            } else {
                double average = 0;
                double sumGrades = 0;
                studentsGrades.get(studentName).add(grade);
                for (Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()) {
                    if (entry.getKey().equals(studentName)) {
                        List<Double> currentGrade = entry.getValue();
                        for (double gr : currentGrade) {
                            sumGrades += gr;
                        }
                        average = sumGrades / currentGrade.size();
                    }
                    averageGrades.put(studentName, average);

                }
            }


        }
        averageGrades.entrySet().stream().filter(entry -> entry.getValue() >= 4.50)
                .sorted((d1, d2) -> Double.compare(d2.getValue(), d1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));


    }
}
