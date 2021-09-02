import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int waterInTank = 0;

        for (int i = 1; i <= n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            
            if (liters > capacity - waterInTank){
                System.out.println("Insufficient capacity!");
            } else {
                waterInTank += liters;
            }
        }
        System.out.println(waterInTank);
    }
}
