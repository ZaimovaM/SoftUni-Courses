import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int size = width * length;

        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            size -= pieces;
            if (size <= 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (size >= 0) {
            System.out.printf("%d pieces are left.", size);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(size));
        }


    }
}
