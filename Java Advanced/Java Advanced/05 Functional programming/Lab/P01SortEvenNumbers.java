package J05FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNumbers = scanner.nextLine().split(", ");

        List<String> evenNumbers = Arrays.stream(inputNumbers)
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .map(Object::toString)
                .collect(Collectors.toList());

        System.out.println(String.join(", ", evenNumbers));

        List<String> sortedEvenNumbers = evenNumbers.stream()
                .map(Integer::parseInt)
                .sorted()
                .map(n -> n.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ", sortedEvenNumbers));
    }
}
