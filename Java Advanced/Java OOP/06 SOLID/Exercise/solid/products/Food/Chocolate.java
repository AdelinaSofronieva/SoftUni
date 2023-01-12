package J06SOLID.Exercise.solid.products.Food;

public class Chocolate extends Food{

    public static final double CALORIES_PER_100_GRAMS = 575.0;

    public Chocolate(double grams) {
        super(grams, CALORIES_PER_100_GRAMS);
    }



}
