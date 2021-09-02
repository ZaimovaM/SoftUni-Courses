import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSteps = 10000;
        boolean flag = false;

        while (targetSteps > 0) {
            String input = scanner.nextLine();
            if (!input.equals("Going home")) {
                int steps = Integer.parseInt(input);

                targetSteps -= steps;
            } else  {
                int homeSteps = Integer.parseInt(scanner.nextLine());
                targetSteps -= homeSteps;
                break;
            }

        }
        if (targetSteps <= 0) {
            flag = true;
        }
        if (flag) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", Math.abs(targetSteps));
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(targetSteps));
        }
    }
}
