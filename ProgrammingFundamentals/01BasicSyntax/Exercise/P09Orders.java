package F01BasicSyntax.Exercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOrders = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        for (int i = 1; i <= numOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            double days = Double.parseDouble(scanner.nextLine());
            double capsulesCount = Double.parseDouble(scanner.nextLine());

            double currentPrice = ((days * capsulesCount) * pricePerCapsule);
            totalPrice += currentPrice;

            System.out.printf("The price for the coffee is: $%.2f%n", currentPrice);
        }


        System.out.printf("Total: $%.2f", totalPrice);
    }
}
