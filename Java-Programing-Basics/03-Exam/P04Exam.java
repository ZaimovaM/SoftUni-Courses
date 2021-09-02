import java.util.Scanner;

public class P04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        int countFail = 0;
        int countBetween3 = 0;
        int countBetween4 = 0;
        int countTop = 0;
        double sumGrades = 0;

        for (int students = 1; students <= countStudents ; students++) {
            double grade = Double.parseDouble(scanner.nextLine());
            sumGrades += grade;
            if (grade >= 5) {
                countTop++;
            } else if (grade <= 4.99 & grade >= 4.00){
                countBetween4++;
            } else if (grade <= 3.99 & grade >= 3.00){
                countBetween3++;
            } else if (grade <= 2.99 & grade >= 2.00){
                countFail++;
            }

        }
        double percentTop = 1.0 * countTop / countStudents * 100;
        double percentbtw4 = 1.0 * countBetween4 / countStudents * 100;
        double percentbtw3 = 1.0 * countBetween3 / countStudents * 100;
        double percentFail = 1.0 * countFail / countStudents * 100;
        double average = sumGrades / countStudents;

        System.out.printf("Top students: %.2f%%%n", percentTop);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentbtw4);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentbtw3);
        System.out.printf("Fail: %.2f%%%n", percentFail);
        System.out.printf("Average: %.2f%n", average);
    }
}
