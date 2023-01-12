package J06SOLID.Exercise.solid.products.Food;

public class Chips extends Food{

    public static final double CALORIES_PER_100_GRAMS = 529.0;

    public Chips(double grams) {
        super(grams, CALORIES_PER_100_GRAMS);
    }

}
