package J02Encapsulation.Exercise.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaDataArr = scanner.nextLine().split("\\s+");
        String name = pizzaDataArr[1];
        int numberOfToppings = Integer.parseInt(pizzaDataArr[2]);

        try {
            Pizza pizza = new Pizza(name, numberOfToppings);

            String[] doughDataArr = scanner.nextLine().split("\\s+");
            String flourType = doughDataArr[1];
            String bakingTechnique = doughDataArr[2];
            double weightInGrams = Double.parseDouble(doughDataArr[3]);

            Dough dough = new Dough(flourType, bakingTechnique, weightInGrams);
            pizza.setDough(dough);

            String toppingsInput = scanner.nextLine();
            while (!toppingsInput.equals("END")) {
                String[] toppingsDataArr = toppingsInput.split(" ");
                String toppingType = toppingsDataArr[1];
                double toppingWeightInGrams = Double.parseDouble(toppingsDataArr[2]);

                Topping topping = new Topping(toppingType, toppingWeightInGrams);

                pizza.addTopping(topping);
                toppingsInput = scanner.nextLine();
            }

            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
