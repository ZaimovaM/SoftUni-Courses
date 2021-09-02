import java.util.Scanner;

public class P05Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int startMeters = 5364;
        int allMeters = 8848;
        int metersOver = allMeters - startMeters;
        int countYes = 0;
        boolean flag = false;
        int countDays = 0;

        while (!command.equals("END")){
            String night = command;
            int meters = Integer.parseInt(scanner.nextLine());
            countDays++;


            if (night.equals("Yes")) {
                countYes++;
            }
            if (countYes >= 5) {
                break;
            }
            metersOver -= meters;
            if (metersOver <= 0) {
                flag = true;
                break;
            }



            command = scanner.nextLine();
        }
        if (flag) {
            System.out.printf("Goal reached for %d days!", countDays);

        }
        else {
            System.out.println("Failed!");
            System.out.printf("%d", 8848 - metersOver);
        }
    }
}
