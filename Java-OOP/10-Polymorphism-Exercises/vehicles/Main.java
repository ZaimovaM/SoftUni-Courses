package vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInformation = scanner.nextLine().split("\\s+");
        double carFuelAmount = Double.parseDouble(carInformation[1]);
        double carConsumption = Double.parseDouble(carInformation[2]);
        Vehicle car = new Car(carFuelAmount, carConsumption);

        String[] truckInformation = scanner.nextLine().split("\\s+");
        double truckFuelAmount = Double.parseDouble(truckInformation[1]);
        double truckConsumption = Double.parseDouble(truckInformation[2]);
        Vehicle truck = new Truck(truckFuelAmount, truckConsumption);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int commandCount = Integer.parseInt(scanner.nextLine());

        while (commandCount-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String commandName = tokens[0];
            String vehicleType = tokens[1];

            switch (commandName) {
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);
                    System.out.println(vehicles.get(vehicleType).drive(distance));
                    break;
                case "Refuel":
                    double liters = Double.parseDouble(tokens[2]);
                    vehicles.get(vehicleType).refuel(liters);
                    break;
            }


        }
        vehicles.values().forEach(System.out::println);

    }
}

