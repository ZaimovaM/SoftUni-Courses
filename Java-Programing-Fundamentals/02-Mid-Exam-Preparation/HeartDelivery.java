


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int lastIndex = 0;
        String command = scanner.nextLine();
        while (!command.equals("Love!")) {
            String[] splitCommand = command.split("\\s+");
            int jumpLength = Integer.parseInt(splitCommand[1]);
            lastIndex += jumpLength;
            if (lastIndex > list.size() - 1) {
                lastIndex = 0;
            }
            int hearts = list.get(lastIndex);
            if (hearts == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", lastIndex);
            } else {
                hearts -= 2;
                list.set(lastIndex, hearts);
                if (hearts == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", lastIndex);
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", lastIndex);
        boolean isFailed = false;
        int counter = 0;
        for (int hearts : list) {
            if (hearts != 0) {
                isFailed = true;
                counter++;
            }
        }
        if (isFailed) {
            System.out.printf("Cupid has failed %d places.", counter);
        } else {
            System.out.println("Mission was successful.");
        }

    }
}
