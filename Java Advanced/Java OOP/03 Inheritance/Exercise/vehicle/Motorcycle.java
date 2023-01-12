package J03Inheritance.Exercise.vehicle;

public class Motorcycle extends Vehicle{
    public Motorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(fuelConsumption);
    }
}
