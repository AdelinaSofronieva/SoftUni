package J06SOLID.Exercise.solid;

import J06SOLID.Exercise.solid.products.Product;

import java.util.List;

public class Printer {
    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";

//    CalorieCalculator calorieCalculator;
//
//    public void printSum(List<Product> products) {
//        System.out.printf((SUM) + "%n", calorieCalculator.sum(products));
//    }
//
//    public void printAverage(List<Product> products) {
//        System.out.printf((AVERAGE) + "%n", calorieCalculator.average(products));
//    }

    public void printSum(double sum) {
        System.out.printf((SUM) + "%n", sum);
    }

    public void printAverage(double average) {
        System.out.printf((AVERAGE) + "%n", average);
    }
}
