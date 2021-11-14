package vehiclesExtension;

import java.text.DecimalFormat;

public class VehicleImpl implements Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected VehicleImpl(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.tankCapacity = tankCapacity;
        this.setFuelConsumption(fuelConsumption);
    }

    @Override
    public String drive(double distance) {
        double fuelNeeded = distance * getFuelConsumption();
        if(fuelNeeded > this.fuelQuantity){
            return this.getClass().getSimpleName() + " needs refueling";
        }

        setFuelQuantity(getFuelQuantity() - fuelNeeded);
        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), formatter.format(distance));
    }

    @Override
    public void refuel(double liters) {
        if(liters <= 0){
           throw new IllegalArgumentException("Fuel must be a positive number");
        }

        double newFuelQuantity = liters + this.fuelQuantity;
        if(newFuelQuantity > this.tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), this.fuelQuantity);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
