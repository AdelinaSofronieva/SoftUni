package J06DefiningClasses.Exercise.P05CarSalesman;

public class Car {
    private String model;
    private String engine;
    private String weight;
    private String color;

    public Car(String model, String engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, String engine, String weight) {
        this(model, engine, weight, "n/a");
    }

    public Car(String model, String engine) {
        this(model, engine, "n/a", "n/a");
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
