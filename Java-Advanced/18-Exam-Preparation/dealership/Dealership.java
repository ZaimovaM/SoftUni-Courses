package dealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    public String name;
    public int capacity;
    private List<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car){
        if(capacity > 0){
            data.add(car);
            capacity--;
        }
    }

    public boolean buy(String manufacturer, String model){
        return data.removeIf(car -> car.getManufacturer().equals(manufacturer) && car.getModel().equals(model));
    }

    public Car getLatestCar(){
        if (data.size() > 0){
            data.sort(Comparator.comparingInt(Car::getYear));
            return data.get(data.size() - 1);
        }
        return null;
    }
    public Car getCar(String manufacturer, String model){
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)){
                return car;
            }
        }
        return null;
    }

    public int getCount(){
        return data.size();
    }
    public String getStatistics(){
        StringBuilder statistic = new StringBuilder();
        statistic.append("The cars are in a car dealership ").append(this.name)
                .append(":").append(System.lineSeparator());
        data.forEach(c -> statistic.append(c).append(System.lineSeparator()));

        return statistic.toString();
    }

}
