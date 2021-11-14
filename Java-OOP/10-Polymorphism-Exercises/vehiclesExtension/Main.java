package vehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInformation = scanner.nextLine().split("\\s+");
        Vehicle car = getVehicle(carInformation);

        String[] truckInformation = scanner.nextLine().split("\\s+");
        Vehicle truck = getVehicle(truckInformation);

        String[] busInformation = scanner.nextLine().split("\\s+");
        Vehicle bus = getVehicle(busInformation);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int commandCount = Integer.parseInt(scanner.nextLine());

        while (commandCount-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String commandName = tokens[0];
            String vehicleType = tokens[1];
            Vehicle vehicle = vehicles.get(vehicleType);
            try {
                switch (commandName) {
                    case "Drive":
                        double distance = Double.parseDouble(tokens[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(false);
                        }
                        System.out.println(vehicles.get(vehicleType).drive(distance));
                        break;
                    case "Refuel":
                        double liters = Double.parseDouble(tokens[2]);
                        vehicles.get(vehicleType).refuel(liters);
                        break;
                    case "DriveEmpty":
                        double emptyBusDistance = Double.parseDouble(tokens[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(true);
                        }
                        System.out.println(vehicles.get(vehicleType).drive(emptyBusDistance));
                        break;
                }


            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        vehicles.values().forEach(System.out::println);

    }

    private static Vehicle getVehicle(String[] information) {
        String vehicleType = information[0];
        double fuelQuantityAmount = Double.parseDouble(information[1]);
        double consumption = Double.parseDouble(information[2]);
        double tankCapacity = Double.parseDouble(information[3]);

        Vehicle vehicle = null;
        switch (vehicleType) {
            case "Car":
                vehicle = new Car(fuelQuantityAmount, consumption, tankCapacity);
                break;
            case "Truck":
                vehicle = new Truck(fuelQuantityAmount, consumption, tankCapacity);
                break;
            case "Bus":
                vehicle = new Bus(fuelQuantityAmount, consumption, tankCapacity);
                break;
        }

        return vehicle;
    }
}

