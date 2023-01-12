package J05FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNumbers = scanner.nextLine().split(", ");

        System.out.println("Prices with VAT:");
         Arrays.stream(inputNumbers)
                .map(Double::parseDouble)
                .map(num -> num * 1.2)
                .forEach(num -> System.out.printf("%.2f%n", num));
    }
}
