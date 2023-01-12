package J06SOLID.Exercise.solid.products.Drink;

import J06SOLID.Exercise.solid.products.Product;

public class Coke extends Drink implements Product {

    public static final double CALORIES_PER_100_GRAMS = 44.0;
    public static final double DENSITY = 0.6;


    public Coke(double milliliters) {
        super(milliliters, CALORIES_PER_100_GRAMS, DENSITY);
    }

    @Override
    public double getAmountOfCalories() {
        double grams = getMilliliters() * DENSITY;
        return (CALORIES_PER_100_GRAMS / 100) * grams;
    }


}
