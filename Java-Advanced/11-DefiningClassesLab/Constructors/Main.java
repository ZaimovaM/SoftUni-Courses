package Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCars = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        while (countCars > 0) {
            countCars--;
            String[] input = scanner.nextLine().split("\\s+");
            Car car;
            if (input.length == 3) {
                String brand = input[0];
                String model = input[1];
                int horsePower = Integer.parseInt(input[2]);
                car = new Car(brand, model, horsePower);
            } else {
                car = new Car(input[0]);
            }
            cars.add(car);
        }

        cars.forEach(System.out::println);
    }
}
