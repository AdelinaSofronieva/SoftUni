package J03SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, Map<String, Double>> shopsAndProductsMap = new TreeMap<>();

        while (!inputLine.equals("Revision")) {
            String shop = inputLine.split(", ")[0];
            String product = inputLine.split(", ")[1];
            Double price = Double.parseDouble(inputLine.split(", ")[2]);

            shopsAndProductsMap.putIfAbsent(shop, new LinkedHashMap<>());
            shopsAndProductsMap.get(shop).put(product, price);

            inputLine = scanner.nextLine();
        }

        for (var shops : shopsAndProductsMap.entrySet()) {
            System.out.printf("%s->%n", shops.getKey());

            Map<String,Double> productsMap = shops.getValue();
            for (var products : productsMap.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", products.getKey(), products.getValue());
            }
        }
    }
}