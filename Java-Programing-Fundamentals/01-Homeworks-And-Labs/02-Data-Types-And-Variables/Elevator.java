import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(1.0 * numberOfPeople / capacity);
        System.out.printf("%.0f", courses);

//        int courses = numberOfPeople / capacity;
//        int waste = numberOfPeople % capacity;
//        if (numberOfPeople <= capacity) {
//            System.out.println("All the persons fit inside in the elevator.");
//            System.out.println("Only one course is needed.");
//        } else if (waste != 0 && waste <= capacity) {
//            courses++;
//            System.out.printf("%d courses * %d people + 1 course * %d persons", courses, capacity, waste);
//
//        } else {
//            System.out.printf("%d courses * %d people", courses, capacity);
//        }


    }
}
