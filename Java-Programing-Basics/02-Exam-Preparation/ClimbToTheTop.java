import java.util.Scanner;

public class ClimbToTheTop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int metersOver = 3484;
        int sumMeters = 0;
        boolean flag = false;
        int countDay = 0;
        int countYes = 0;

        while (!command.equals("END")) {
            String yesOrNo = command;
            int meters = Integer.parseInt(scanner.nextLine());
            countDay++;
            sumMeters += meters;
            if (sumMeters >= metersOver) {
                flag = true;
                break;
            }
            if (yesOrNo.equals("Yes")) {
                countYes++;
            }
            if (countYes >= 5) {
                sumMeters -= meters;
                break;
            }


            command = scanner.nextLine();
        }
        if (flag) {
            System.out.printf("Goal reached for %d days!", countDay);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", sumMeters + 5364);

        }
    }
}
