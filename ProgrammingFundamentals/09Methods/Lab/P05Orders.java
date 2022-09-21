package F04Methods.Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String orderProduct = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double coffePrice = 1.5;
        double waterPrice = 1.0;
        double cokePrice = 1.4;
        double snacksPrice = 2.0;

        switch (orderProduct) {
            case "coffee" :
                calculateAndPrintCoffeePrice (coffePrice, quantity);
                break;
            case "water" :
                calculateAndPrintWaterPrice (waterPrice, quantity);
                break;
            case "coke" :
                calculateAndPrintCokePrice (cokePrice, quantity);
                break;
            case "snacks" :
                calculateAndPrintSnacksPrice (snacksPrice, quantity);
                break;
        }

    }

    public static void calculateAndPrintCoffeePrice(double coffeePrice, double quantity) {
        double result = coffeePrice * quantity;
        System.out.printf("%.2f", result);

    }

    public static void calculateAndPrintWaterPrice(double waterPrice, double quantity) {
        double result = waterPrice * quantity;
        System.out.printf("%.2f", result);
    }

    public static void calculateAndPrintCokePrice(double cokePrice, double quantity) {
        double result = cokePrice * quantity;
        System.out.printf("%.2f", result);
    }

    public static void calculateAndPrintSnacksPrice(double snacksPrice, double quantity) {
        double result = snacksPrice * quantity;
        System.out.printf("%.2f", result);
    }
}
