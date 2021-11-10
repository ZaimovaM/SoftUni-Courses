package BirthdayCelebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Birthable> birthables = new ArrayList<>();

        while (!command.equals("End")) {
            String[] commandParts = command.split("\\s+");
            Birthable birthable = null;
            if (commandParts[0].equals("Pet")) {
                birthable = new Pet(commandParts[1], commandParts[2]);
            } else if (commandParts[0].equals("Citizen")) {
                birthable = new Citizen(commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3], commandParts[4]);
            } else {
                command = scanner.nextLine();
                continue;
            }

            birthables.add(birthable);

            command = scanner.nextLine();
        }

        String number = scanner.nextLine();

       birthables = birthables.stream()
                .filter(b -> b.getBirthDate().endsWith(number)).collect(Collectors.toList());

       if(!birthables.isEmpty()){
           birthables.forEach(b -> System.out.println(b.getBirthDate()));
       } else {
           System.out.println("<no output>");
       }
    }
}
