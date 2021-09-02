import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfVagons = Integer.parseInt(scanner.nextLine());
        int sumOfPeople = 0;
        for (int i = 1; i <= countOfVagons; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            System.out.print(countPeople + " ");
            sumOfPeople += countPeople;
        }
        System.out.println();
        System.out.println(sumOfPeople);
    }
}
