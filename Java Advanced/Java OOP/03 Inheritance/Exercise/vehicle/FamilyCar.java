package J03Inheritance.Exercise.vehicle;

public class FamilyCar extends Car{
    public FamilyCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(fuelConsumption);
    }
}
