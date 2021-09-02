import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wantHigh = Integer.parseInt(scanner.nextLine());

        int startHigh = wantHigh - 30;
        int totalJumps = 0;

        for (int height = startHigh; height <= wantHigh; height += 5) {
            int failedJumps = 0;
            for (int jump = 1; jump <= 3; jump++) {
                int jumpHigh = Integer.parseInt(scanner.nextLine());
                totalJumps++;
                if (jumpHigh > startHigh) {
                    startHigh += 5;
                    break;
                } else {
                    failedJumps++;
                }
            }
            if (failedJumps == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", startHigh,totalJumps);
                return;
            }
        }
        System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",wantHigh, totalJumps);
    }
}




