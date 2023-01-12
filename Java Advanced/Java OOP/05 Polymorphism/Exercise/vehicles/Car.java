package J05Polymorphism.Exercise.vehicles;

public class Car extends Vehicle {
    public static final double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, AC_ADDITIONAL_CONSUMPTION);
    }
}
