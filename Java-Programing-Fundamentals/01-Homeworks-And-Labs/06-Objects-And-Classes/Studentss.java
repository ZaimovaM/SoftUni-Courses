import java.util.*;
import java.util.stream.Collectors;

public class Studentss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        List<Students> students = new ArrayList<>();

        for (int student = 1; student <= studentsCount; student++) {
            String studentData = scanner.nextLine();
            String [] splitStudentData = studentData.split("\\s+");
            String firstName =  splitStudentData[0];
            String lastName =  splitStudentData[1];
            double grade =  Double.parseDouble(splitStudentData[2]);

            Students st = new Students(firstName, lastName, grade);
            students.add(st);

        }
        students = students.stream().sorted(Comparator.comparingDouble(Students::getGrade)).collect(Collectors.toList());
        Collections.reverse(students);

        for (Students s: students) {
            System.out.println(s.toString());
        }
    }
}
