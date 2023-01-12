package J03Inheritance.Exercise.restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish{
    private static double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);
    }


}
