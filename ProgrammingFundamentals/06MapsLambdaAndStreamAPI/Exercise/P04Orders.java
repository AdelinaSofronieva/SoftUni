package F09MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();

        Map<String, Integer> productsQuantityMap = new LinkedHashMap();
        Map<String, Double> productsPriceMap = new LinkedHashMap();

        while (!productInput.equals("buy")) {
            String productName = productInput.split(" ")[0];
            double price = Double.parseDouble(productInput.split(" ")[1]);
            int quantity = Integer.parseInt(productInput.split(" ")[2]);

            Integer currentQuantityCount = productsQuantityMap.get(productName);
            if (currentQuantityCount == null) {
                currentQuantityCount = 0;
            }

            productsQuantityMap.put(productName, quantity + currentQuantityCount);

            int currentQuantity = productsQuantityMap.get(productName);

            productsPriceMap.put(productName, currentQuantity * price);


            productInput = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productsPriceMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());

        }

    }
}
