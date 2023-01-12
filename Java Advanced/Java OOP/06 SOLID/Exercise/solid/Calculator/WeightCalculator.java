package J06SOLID.Exercise.solid.Calculator;

import J06SOLID.Exercise.solid.products.Product;

import java.util.List;

public class WeightCalculator implements Calculator{
    @Override
    public double total(List<Product> products) {
        return products.stream().mapToDouble(Product::getKilograms).sum();
    }

    @Override
    public double average(List<Product> products) {
        return total(products) / products.size();
    }
}
