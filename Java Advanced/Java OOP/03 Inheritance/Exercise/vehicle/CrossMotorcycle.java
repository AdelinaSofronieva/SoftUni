package J03Inheritance.Exercise.vehicle;

public class CrossMotorcycle extends Motorcycle{
    public CrossMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(fuelConsumption);
    }
}
