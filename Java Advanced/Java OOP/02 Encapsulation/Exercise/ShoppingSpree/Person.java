package J02Encapsulation.Exercise.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct (Product product) {
        if (money - product.getCost() >= 0) {
            money -= product.getCost();
            products.add(product);
            System.out.printf("%s bought %s%n", this.getName(), product.getName());
        } else {
            System.out.printf("%s can't afford %s%n", this.getName(), product.getName());
        }
    }

    public String getName() {
        return name;
    }

        @Override
    public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(name).append(" - ");
                if (products.isEmpty()) {
                    sb.append("Nothing bought");
                } else {
                    sb.append(products.stream().map(Product::getName).collect(Collectors.joining(", ")));
                }
                return sb.toString();
        //return String.format("%s - ", name + String.join(", ", (CharSequence) boughtProducts));
    }
}
