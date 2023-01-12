package J05FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNumbers = scanner.nextLine().split(", ");

        int sum = Arrays.stream(inputNumbers)
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("Count = " + inputNumbers.length);
        System.out.println("Sum = " + sum);
    }
}
