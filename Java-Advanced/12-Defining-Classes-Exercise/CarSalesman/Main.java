package CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfEngines = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new HashMap<>();

        while (numbersOfEngines > 0) {
            numbersOfEngines--;
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int power = Integer.parseInt(input[1]);
            Engine engine = readEngine(input, model, power);
            
            engines.put(model, engine);
        }

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        while (numberOfCars > 0) {
            numberOfCars--;
            String[] input = scanner.nextLine().split("\\s+");
            String carModel = input[0];
            String engineModel = input[1];
            Engine carEngine = engines.get(engineModel);
            Car car = readCar(input, carModel, carEngine);

            cars.add(car);

        }

        cars.forEach(System.out::println);
    }

    private static Car readCar(String[] input, String carModel, Engine carEngine) {
        Car car;
        if (input.length == 4) {
            int weight = Integer.parseInt(input[2]);
            String color = input[3];
            car = new Car(carModel, carEngine, weight, color);
        } else if (input.length == 2) {
            car = new Car(carModel, carEngine);
        } else {
            try {
                int weight = Integer.parseInt(input[2]);
                car = new Car(carModel, carEngine, weight);
            } catch (NumberFormatException e) {
                String color = input[2];
                car = new Car(carModel, carEngine, color);
            }
        }
        return car;
    }

    private static Engine readEngine(String[] input, String model, int power) {
        Engine engine = null;
        if (input.length == 4) {
            int displacement = Integer.parseInt(input[2]);
            String efficiency = input[3];
            engine = new Engine(model, power, displacement, efficiency);
        } else if (input.length == 2) {
            engine = new Engine(model, power);
        } else {
            try {
                int displacement = Integer.parseInt(input[2]);
                engine = new Engine(model, power, displacement);
            } catch (NumberFormatException e) {
                String efficiency = input[2];
                engine = new Engine(model, power, efficiency);
            }
        }
        return engine;
    }
}