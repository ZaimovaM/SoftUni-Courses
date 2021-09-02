import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countProblem = Integer.parseInt(scanner.nextLine());
        int filedTimes = 0;
        int countSucExercise = 0;
        double gradeSum = 0;
        String exercise = "";
        boolean isFailed = true;


        while (filedTimes < countProblem){
            String problemName = scanner.nextLine();

            if ("Enough".equals(problemName)) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4){
                filedTimes++;
            }
            gradeSum += grade;
            countSucExercise++;
            exercise = problemName;
        }
        if (isFailed){
            System.out.printf("You need a break, %d poor grades.", filedTimes);
        }
        else {
            System.out.printf("Average score: %.2f%n", gradeSum / countSucExercise);
            System.out.printf("Number of problems: %d%n", countSucExercise);
            System.out.printf("Last problem: %s", exercise);

        }
    }
}
