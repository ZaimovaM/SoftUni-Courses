import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double coins = Double.parseDouble(scanner.nextLine());
        double change = coins * 100;
        int countCoins = 0;

        while (change > 0){
            if (change >= 200){
                countCoins++;
                change -= 200;
            } else if (change >= 100) {
                countCoins++;
                change -= 100;
            } else if (change >= 50) {
                countCoins++;
                change -= 50;
            } else if (change >= 20) {
                countCoins++;
                change -= 20;
            } else if (change >= 10) {
                countCoins++;
                change -= 10;
            } else if (change >= 5) {
                countCoins++;
                change -= 5;
            } else if (change >= 2) {
                countCoins++;
                change -= 2;
            } else if (change >= 1) {
                countCoins++;
                change -= 1;
            } else {
                change = 0;
            }
        }
        System.out.printf("%d", countCoins);
    }
}
