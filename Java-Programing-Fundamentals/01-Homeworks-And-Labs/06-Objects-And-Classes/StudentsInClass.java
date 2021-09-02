
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentsInClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Students> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String hometown = tokens[3];
            if (!isAlreadyExist(firstName, lastName, age, hometown, students)) {
                Students student = new Students(firstName, lastName, age, hometown);
                students.add(student);
            }

            input = scanner.nextLine();
        }

        String hometown = scanner.nextLine();
        for (Students student : students) {
            if (student.getHometown().equals(hometown)) {
                System.out.println(student);
            }

        }
    }

    private static boolean isAlreadyExist(String firstName, String lastName, int age, String hometown, List<Students> students) {

        for (Students student : students) {

            if (student.getFirstName().equals(firstName) &&
                    student.getLastName().equals(lastName)) {
                student.setAge(age);
                student.setHometown(hometown);
                return true;
            }

        }
        return false;
    }


    public static class Students {
        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        public Students(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {

            return this.firstName + " " + this.lastName + " is " + this.age + " years old";
        }
    }
}
