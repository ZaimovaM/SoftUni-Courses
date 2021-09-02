import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExamPrepNeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCars = Integer.parseInt(scanner.nextLine());
        Map<String, CarData> cars = new TreeMap<>();
        for (int i = 1; i <= countCars; i++) {
            String input = scanner.nextLine();
            String[] inputParts = input.split("\\|");
            String carName = inputParts[0];
            int mileage = Integer.parseInt(inputParts[1]);
            int fuel = Integer.parseInt(inputParts[2]);

            CarData currentCar = new CarData(mileage, fuel);
            cars.put(carName, currentCar);
        }
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commandParts = command.split(" : ");
            String typeCommand = commandParts[0];
            String car = commandParts[1];
            if (typeCommand.equals("Drive")) {
                int distance = Integer.parseInt(commandParts[2]);
                int fuel = Integer.parseInt(commandParts[3]);
                int currentFuel = cars.get(car).getFuel();
                if (currentFuel >= fuel) {
                    int currentMileage = cars.get(car).getMileage();
                    int newMileage = currentMileage + distance;
                    int newFuel = currentFuel - fuel;
                    cars.get(car).setMileage(newMileage);
                    cars.get(car).setFuel(newFuel);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    if (newMileage > 100000){
                        cars.remove(car);
                        System.out.printf("Time to sell the %s!%n",car);
                    }

                } else {
                    System.out.println("Not enough fuel to make that ride");
                }

            } else if (typeCommand.equals("Refuel")) {
                int fuel = Integer.parseInt(commandParts[2]);
                int currentFuel = cars.get(car).getFuel();
                int newFuel = currentFuel + fuel;

                int diff = 75 - currentFuel;
                if (newFuel > 75){
                    cars.get(car).setFuel(75);
                    System.out.printf("%s refueled with %d liters%n", car, diff);
                } else {
                    cars.get(car).setFuel(newFuel);
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                }


            } else if (typeCommand.equals("Revert")) {
                int kilometers = Integer.parseInt(commandParts[2]);
                int currentMileage = cars.get(car).getMileage();
                int newMileage = currentMileage - kilometers;
                if (newMileage > 10000){
                    cars.get(car).setMileage(newMileage);
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                } else {
                    cars.get(car).setMileage(10000);
                }


            }


            command = scanner.nextLine();
        }
        cars.entrySet().stream().sorted((c1,c2) -> Integer.compare(c2.getValue().getMileage(), c1.getValue().getMileage()))
                .forEach(car -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                        car.getKey(), car.getValue().getMileage(), car.getValue().getFuel()));
    }
}


class CarData {
    int mileage;
    int fuel;

    public CarData(int mileage, int fuel) {
        this.mileage = mileage;
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public int getMileage() {
        return mileage;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}