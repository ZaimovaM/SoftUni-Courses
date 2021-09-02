import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleInQueue = Integer.parseInt(scanner.nextLine());
        String[] userInput = scanner.nextLine().split(" ");

        int[] liftCabins = Arrays.stream(userInput).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < liftCabins.length; i++) {
            int peopleInCabin = liftCabins[i];
            int freeSpace = 4 - peopleInCabin;

            if (peopleInCabin == 4){
                continue;
            }
            if (freeSpace >= peopleInQueue) {
                liftCabins[i] = liftCabins[i] + peopleInQueue;
                peopleInQueue = 0;
                break;
            }
            liftCabins[i] = 4;
            peopleInQueue = peopleInQueue - freeSpace;
        }
        boolean hasEmptyseats = false;
        for (int peopleInCabin : liftCabins) {
           if (peopleInCabin < 4){
               hasEmptyseats = true;
               break;
           }
        }
        if (hasEmptyseats){
            System.out.println("The lift has empty spots!");
        }
        else if (!hasEmptyseats && peopleInQueue != 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleInQueue);
        }

        Arrays.stream(liftCabins).forEach(e -> System.out.print(e + " "));
    }
}
