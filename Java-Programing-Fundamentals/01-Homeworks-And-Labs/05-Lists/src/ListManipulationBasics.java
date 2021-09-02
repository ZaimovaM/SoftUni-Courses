import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] typeCommand = command.split(" ");
            if (typeCommand[0].equals("Add")) {
                int number = Integer.parseInt(typeCommand[1]);
                numbers.add(number);
            } else if (typeCommand[0].equals("Remove")) {
                int number = Integer.parseInt(typeCommand[1]);
                numbers.remove(Integer.valueOf(number));
            } else if (typeCommand[0].equals("RemoveAt")) {
                int index = Integer.parseInt(typeCommand[1]);
                numbers.remove(index);
            } else if (typeCommand[0].equals("Insert")) {
                int number = Integer.parseInt(typeCommand[1]);
                int index = Integer.parseInt(typeCommand[2]);
                numbers.add(index, number);
            }


            command = scanner.nextLine();
        }
        for (int number: numbers) {
            System.out.print(number + " ");

        }


    }

}

