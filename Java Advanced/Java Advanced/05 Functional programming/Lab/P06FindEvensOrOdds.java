package J05FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class P06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bounds = scanner.nextLine().split("\\s+");
        int lowerBound = Integer.parseInt(bounds[0]);
        int upperBound = Integer.parseInt(bounds[1]);
        String evenOrOdd = scanner.nextLine();

        Predicate<Integer> checkIfEvenOrOdd;

        if (evenOrOdd.equals("even")) {
            checkIfEvenOrOdd = num -> num % 2 == 0;
        } else {
            checkIfEvenOrOdd = num -> num % 2 != 0;
        }

        List<Integer> numbers = new ArrayList<>();
        for (int i = lowerBound; i <= upperBound; i++) {
            numbers.add(i);
        }

        numbers.stream()
                .filter(checkIfEvenOrOdd)
                .forEach(num -> System.out.print(num + " "));
    }
}
