import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        int countRows = Integer.parseInt(scanner.nextLine());
        int seatsOdd = Integer.parseInt(scanner.nextLine());
        int seatsEven = 0;

        for (int let = 0; let <= letter ; let++) {
            for (int i = 1; i <= countRows; i++) {
                for (int j = 1; j <= seatsOdd; j++) {
                    if (j % 2 == 0){
                        seatsEven = seatsOdd + 2;

                        System.out.printf("%c%d%c");
                    }

                }
                
            }
            
        }


    }
}
