package J06DefiningClasses.Exercise.P03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private  double fuelCostFor1km;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostFor1km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1km = fuelCostFor1km;
        this.distanceTraveled = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelCostFor1km(double fuelCostFor1km) {
        this.fuelCostFor1km = fuelCostFor1km;
    }

    public double getFuelCostFor1km() {
        return fuelCostFor1km;
    }

    private boolean hasEnoughFuel(int amountOfkm) {
        //return this.fuelAmount >= (this.fuelCostFor1km * amountOfkm) ;
        return this.fuelAmount - (this.fuelCostFor1km * amountOfkm) >= 0;
    }

    public void calculateDistance(String currentModel, int amountOfkm) {
            if (hasEnoughFuel(amountOfkm)) {
                this.fuelAmount -= (this.fuelCostFor1km * amountOfkm);
                this.distanceTraveled += amountOfkm;
            } else {
                System.out.println("Insufficient fuel for the drive");
            }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);
    }
}
