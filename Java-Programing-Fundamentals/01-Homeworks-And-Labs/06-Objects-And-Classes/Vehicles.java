import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Vehicle> cars = new ArrayList<>();

        double hpCars = 0;
        double hpTrucks = 0;
        double countCars = 0;
        double countTrucks = 0;
        while (!command.equals("End")) {
            String[] splitCommand = command.split("\\s+");
            String type = splitCommand[0];
            String model = splitCommand[1];
            String color = splitCommand[2];
            int horsepower = Integer.parseInt(splitCommand[3]);


            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            cars.add(vehicle);
            if (type.equals("car")) {

                hpCars += horsepower;
                countCars++;
            } else {

                hpTrucks += horsepower;
                countTrucks++;
            }


            command = scanner.nextLine();
        }

        double averageHpCars = hpCars / countCars;
        double averageHpTrucks = hpTrucks / countTrucks;

        String input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            String type = input;


            for (Vehicle vehicle : cars) {
                if (vehicle.getModel().equals(input)) {
                    System.out.println(vehicle);
                }
            }


            input = scanner.nextLine();
        }
        if (countCars > 0 && countTrucks > 0) {
            System.out.printf("Cars have average horsepower of: %.2f.\n", averageHpCars);
            System.out.printf("Trucks have average horsepower of: %.2f.", averageHpTrucks);
        } else if (countCars <= 0 && countTrucks > 0) {
            System.out.print("Cars have average horsepower of: 0.00.\n");
            System.out.printf("Trucks have average horsepower of: %.2f.", averageHpTrucks);
        } else if (countCars > 0 && countTrucks <= 0) {
            System.out.printf("Cars have average horsepower of: %.2f.\n", averageHpCars);
            System.out.print("Trucks have average horsepower of: 0.00.");
        }
    }
}
