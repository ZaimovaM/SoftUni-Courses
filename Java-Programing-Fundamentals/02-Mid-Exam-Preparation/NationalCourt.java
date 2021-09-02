import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int countPeople = Integer.parseInt(scanner.nextLine());
        int countHour = 0;
        int hourBreak = 0;

        int allEmployeePerHour = firstEmployee + secondEmployee + thirdEmployee;
        while (countPeople > 0){
            countHour++;
            hourBreak++;
            if (hourBreak == 4){
               hourBreak = 0;

            } else {
                countPeople -= allEmployeePerHour;
            }

        }
        System.out.printf("Time needed: %dh.", countHour);
    }
}
