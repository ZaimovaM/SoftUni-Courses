import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] typeCommand = command.split(" ");
            if (typeCommand[0].equals("Add")) {
                int countPassengers = Integer.parseInt(typeCommand[1]);
                wagons.add(countPassengers);

            } else {
                int countPassengers = Integer.parseInt(typeCommand[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if ((capacity - wagons.get(i)) >= countPassengers) {
                        wagons.set(i, wagons.get(i) + countPassengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }

        for(int passengers :wagons) {
            System.out.print(passengers + " ");

        }


    }

}

