import java.util.Locale;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type.substring(0, 1).toUpperCase() + type.substring(1);
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        //Type: Car
        //Model: Ferrari
        //Color: red
        //Horsepower: 550
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", this.type, this.model, this.color, this.horsepower);

    }

    public String getModel() {
        return model;
    }
}
