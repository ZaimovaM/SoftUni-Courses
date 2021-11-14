package vehiclesExtension;

public class Bus extends VehicleImpl {
    private static final double AC_ADDITIONAL_CONSUMPTION = 1.4;
    private boolean isEmpty;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        isEmpty = true;
    }


    public void setEmpty(boolean empty) {
        if(isEmpty == empty){
            return;
        }

        if(isEmpty && !empty){
            super.setFuelConsumption(super.getFuelConsumption() + AC_ADDITIONAL_CONSUMPTION);
        }

        if(!isEmpty && empty){
            super.setFuelConsumption(super.getFuelConsumption() - AC_ADDITIONAL_CONSUMPTION);
        }

        this.isEmpty = empty;
    }
}
