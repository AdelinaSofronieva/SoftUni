package J05Polymorphism.Exercise.vehicles;

public class Truck extends Vehicle{
    public final static double AC_ADDITIONAL_CONSUMPTION = 1.6;
    public final static double FUEL_AFTER_DRIVER_DEDUCTION = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * FUEL_AFTER_DRIVER_DEDUCTION);
    }
}
