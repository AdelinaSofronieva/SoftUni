package J06SOLID.Exercise.solid.products.Drink;

import J06SOLID.Exercise.solid.products.Product;

public abstract class Drink implements Product {
    private double milliliters;
    private double caloriesPer100Grams;
    private double density;

    public Drink(double milliliters, double caloriesPer100Grams, double density) {
        this.milliliters = milliliters;
        this.caloriesPer100Grams = caloriesPer100Grams;
        this.density = density;
    }

    @Override
    public double getAmountOfCalories() {
        double grams = milliliters * density;
        return (caloriesPer100Grams / 100) * grams;
    }

    public double getLiters(){
        return milliliters / 1000;
    }

    @Override
    public double getKilograms() {
        return getLiters() * density;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
