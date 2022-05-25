package F01BasicSyntax.Exercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double insertedCoins = 0;

        while (!input.equals("Start")) {

            double currentCoin = Double.parseDouble(input);

            if (currentCoin == 0.1) {
                insertedCoins += currentCoin;
            } else if (currentCoin == 0.2) {
                insertedCoins += currentCoin;
            } else if (currentCoin == 0.5) {
                insertedCoins += currentCoin;
            } else if (currentCoin == 1) {
                insertedCoins += currentCoin;
            } else if (currentCoin == 2) {
                insertedCoins += currentCoin;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoin);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {

            if (input.equals("Nuts")) {
                if (insertedCoins >= 2.0) {
                    insertedCoins -= 2.0;
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Water")) {
                if (insertedCoins >= 0.7) {
                    insertedCoins -= 0.7;
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Crisps")) {
                if (insertedCoins >= 1.5) {
                    insertedCoins -= 1.5;
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Soda")) {
                if (insertedCoins >= 0.8) {
                    insertedCoins -= 0.8;
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {
                if (insertedCoins >= 1.0) {
                    insertedCoins -= 1.0;
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            input = scanner.nextLine();

        }

        System.out.printf("Change: %.2f",insertedCoins);
    }
}
