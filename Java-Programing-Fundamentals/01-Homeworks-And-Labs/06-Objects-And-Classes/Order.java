import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<OrderByAge> peoples = new ArrayList<>();

        while (!command.equals("End")){
            String[] splitCommand = command.split("\\s+");
            String name = splitCommand[0];
            String id = splitCommand[1];
            int age = Integer.parseInt(splitCommand[2]);

            OrderByAge people = new OrderByAge(name, id, age);
            peoples.add(people);


            command = scanner.nextLine();
        }

       peoples = peoples.stream().sorted(Comparator.comparingInt(OrderByAge::getAge)).collect(Collectors.toList());

        peoples.forEach(OrderByAge -> System.out.println(OrderByAge));
    }
}
