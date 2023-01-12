package J03Inheritance.Exercise.vehicle;

public class SportCar extends Car{
    protected final static double DEFAULT_FUEL_CONSUMPTION = 10;
    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
