import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double widthShip = Double.parseDouble(scanner.nextLine());
        double lengthShip = Double.parseDouble(scanner.nextLine());
        double highShip = Double.parseDouble(scanner.nextLine());
        double avHighAstronauts = Double.parseDouble(scanner.nextLine());

        double volumeShip = widthShip * lengthShip * highShip;
        double volumeBox = (avHighAstronauts+ 0.40) * 2 * 2;
        double countBox = Math.floor(volumeShip / volumeBox);

        if (countBox >= 3 && countBox <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", countBox);
        } else if (countBox < 3){
            System.out.println("The spacecraft is too small.");
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
