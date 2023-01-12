package J06DefiningClasses.Exercise.P05CarSalesman;

public class FullCar {
    private String model;
    private String engine;
    private int power;
    private String displacement;
    private String efficiency;
    private String weight;
    private String color;

    public FullCar(String model, String engine, int power, String displacement, String efficiency, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n" +
                        "%s:%n" +
                        "Power: %d%n" +
                        "Displacement: %s%n" +
                        "Efficiency: %s%n" +
                        "Weight: %s%n" +
                        "Color: %s",
                model, engine, power, displacement, efficiency, weight, color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}