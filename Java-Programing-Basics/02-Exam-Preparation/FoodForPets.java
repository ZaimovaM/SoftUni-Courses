import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double sumDog = 0;
        double sumCat = 0;
        int countDay = 0;
        double eatenFood = 0;
        double allDaysFood = 0;
        double biscuits = 0;

        for (int day = 1; day <= days; day++) {
            int foodDog = Integer.parseInt(scanner.nextLine());
            int foodCat = Integer.parseInt(scanner.nextLine());
            eatenFood = foodCat + foodDog;
            allDaysFood += eatenFood;

            sumDog += foodDog;
            sumCat += foodCat;
            countDay++;
            if (countDay == 3) {
                biscuits = eatenFood * 0.10;
                countDay = 0;
            }
        }
        biscuits = Math.round(biscuits);
        double percentEatenFood = allDaysFood / food * 100;
        double percentFoodDog = sumDog / allDaysFood * 100;
        double percentFoodCat = sumCat / allDaysFood * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentFoodDog);
        System.out.printf("%.2f%% eaten from the cat.", percentFoodCat);
    }
}
