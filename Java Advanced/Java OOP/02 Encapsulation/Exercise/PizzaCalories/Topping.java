package J02Encapsulation.Exercise.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;


    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!toppingType.equals("Meat") && !toppingType.equals("Veggies") && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }

        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories () {
        double modifier = 0;

        if (toppingType.equals("Meat")) {
            modifier = 1.2;
        } else if (toppingType.equals("Veggies")) {
            modifier = 0.8;
        } else if (toppingType.equals("Cheese")) {
            modifier = 1.1;
        } else if (toppingType.equals("Sauce")) {
            modifier = 0.9;
        }

        return 2 * weight * modifier;
    }
}
