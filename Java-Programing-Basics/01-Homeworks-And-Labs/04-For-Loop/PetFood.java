import java.util.Scanner;

public class PetFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());

        double allFoodEaten = 0.0;
        double sumFoodDog = 0.0;
        double sumFoodCat = 0.0;
        double biscuits = 0.0;
        int counter = 0;
        for (int day = 1; day <= days; day++) {
            int foodDog = Integer.parseInt(scanner.nextLine());
            int foodCat = Integer.parseInt(scanner.nextLine());

            sumFoodDog += foodDog;
            sumFoodCat += foodCat;
            allFoodEaten = sumFoodCat + sumFoodDog;
            counter ++;
            if (counter == 3){
                biscuits = (foodCat + foodDog) * 0.1;
                counter = 0;
            }
        }

            double allFoodPercent = allFoodEaten / allFood * 100;
            double foodDogPercent = sumFoodDog / allFoodEaten * 100;
            double foodCatPercent = sumFoodCat / allFoodEaten * 100;

            System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
            System.out.printf("%.2f%% of the food has been eaten.%n", allFoodPercent);
            System.out.printf("%.2f%% eaten from the dog.%n", foodDogPercent);
            System.out.printf("%.2f%% eaten from the cat.%n", foodCatPercent);


//

    }
}
