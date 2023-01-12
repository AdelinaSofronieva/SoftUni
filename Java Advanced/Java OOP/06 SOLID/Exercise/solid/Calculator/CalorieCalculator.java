package J06SOLID.Exercise.solid.Calculator;

import J06SOLID.Exercise.solid.products.Product;

import java.util.List;

public class CalorieCalculator implements Calculator{

    public double total(List<Product> products) {
//        double sum = 0;
//
//        for (Product product : products) {
//            sum += product.amountOfCalories();
//        }
//
//        return sum;

        return products.stream().mapToDouble(Product::getAmountOfCalories).sum();
    }

    public double average(List<Product> products) {
        return total(products) / products.size();
    }


}
