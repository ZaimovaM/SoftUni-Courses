package CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCars = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        while (countCars-- > 0) {

	    String [] input = scanner.nextLine().split("\\s+");
	    String brand = input [0];
	    String model = input[1];
	    int horsePower = Integer.parseInt(input[2]);

	    Car car = new Car();
	    car.setBrand(brand);
	    car.setModel(model);
	    car.setHorsePower(horsePower);

	    cars.add(car);
        }

        cars.forEach(System.out::println);
    }
}
