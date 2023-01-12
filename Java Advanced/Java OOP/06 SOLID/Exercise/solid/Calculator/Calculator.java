package J06SOLID.Exercise.solid.Calculator;

import J06SOLID.Exercise.solid.products.Product;

import java.util.List;

public interface Calculator {

    double total(List<Product> products);
    double average(List<Product> products);
}
