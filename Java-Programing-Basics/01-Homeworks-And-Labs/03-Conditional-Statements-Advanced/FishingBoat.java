import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFisherman = Integer.parseInt(scanner.nextLine());
        double rent = 0.0;
        if (season.equals("Spring")) {
            rent = 3000;
            if (countFisherman <= 6){
                rent = rent * 0.90;
            }
            else if (countFisherman > 7 && countFisherman <= 11){
                rent = rent * 0.85;
            }
            else if (countFisherman > 12){
                rent = rent * 0.75;
            }
            if (countFisherman % 2 ==0){
                rent = rent * 0.95;
            }
        } else if (season.equals("Summer")) {
            rent = 4200;
            if (countFisherman <= 6){
                rent = rent * 0.90;
            }
            else if (countFisherman > 7 && countFisherman <= 11){
                rent = rent * 0.85;
            }
            else if (countFisherman > 12){
                rent = rent * 0.75;
            }
            if (countFisherman % 2 ==0){
                rent = rent * 0.95;
            }
        } else if (season.equals("Autumn")) {
            rent = 4200;
            if (countFisherman <= 6){
                rent = rent * 0.90;
            }
            else if (countFisherman > 7 && countFisherman <= 11){
                rent = rent * 0.85;
            }
            else if (countFisherman > 12){
                rent = rent * 0.75;
            }
        } else if (season.equals("Winter")) {
            rent = 2600;
            if (countFisherman <= 6){
                rent = rent * 0.90;
            }
            else if (countFisherman > 7 && countFisherman <= 11){
                rent = rent * 0.85;
            }
            else if (countFisherman > 12){
                rent = rent * 0.75;
            }
            if (countFisherman % 2 ==0){
                rent = rent * 0.95;
            }
        } if (budget >= rent){
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }
    }
}
