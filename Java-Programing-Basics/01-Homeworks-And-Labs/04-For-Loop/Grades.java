import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudent = Integer.parseInt(scanner.nextLine());
        int countTopStudents = 0;
        int countUnder5 = 0;
        int countUnder4 = 0;
        int countUnder3 = 0;
        double sumGrade = 0;
        for (int student = 1; student <= countStudent; student++) {
            double grade = Double.parseDouble(scanner.nextLine());
            sumGrade += grade;
            if (grade < 3.00) {
                countUnder3++;
            } else if (grade >= 3.00 && grade <= 3.99) {
                countUnder4++;
            } else if (grade >= 4.00 && grade <= 4.99) {
                countUnder5++;
            } else if (grade >= 5.00) {
                countTopStudents++;
            }
        }
        double percentTopStudents = 1.0 * countTopStudents / countStudent * 100;
        double percentUnder5 = 1.0 * countUnder5 / countStudent * 100;
        double percentUnder4 = 1.0 * countUnder4 / countStudent * 100;
        double percentUnder3  = 1.0 * countUnder3 / countStudent * 100;
        double average = sumGrade/countStudent;
        System.out.printf("Top students: %.2f%%%n", percentTopStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentUnder5);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentUnder4);
        System.out.printf("Fail: %.2f%%%n", percentUnder3);
        System.out.printf("Average: %.2f", average);
    }
}
