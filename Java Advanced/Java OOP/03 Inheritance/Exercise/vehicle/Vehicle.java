package J03Inheritance.Exercise.vehicle;

public class Vehicle {
    protected final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    protected double fuelConsumption;
    protected double fuel;
    protected int horsePower;

    public Vehicle(double fuel, int horsePower) {
        setFuel(fuel);
        setHorsePower(horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);

    }

//    public double drive(Double kilometers) {
//        double reducedFuel = fuel - (fuelConsumption * kilometers);
//
//        if (reducedFuel >= 0) {
//            fuel = reducedFuel;
//        }
//
//            return fuel;
//    }

    public void drive(double kilometers) {
        double requiredFuel = kilometers * fuelConsumption;
        if(fuel >= requiredFuel){
            fuel -= requiredFuel;
        }
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
