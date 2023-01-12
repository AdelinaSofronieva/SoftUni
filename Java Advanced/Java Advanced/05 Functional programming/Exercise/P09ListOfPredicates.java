package J05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum = Integer.parseInt(scanner.nextLine());

        List<Integer> inputNumbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Predicate<Integer> isDivisible = number -> {
            for (Integer numberToDivideTo : inputNumbersList) {
                if (number % numberToDivideTo != 0) {
                    return false;
                }
            }
            return true;
        };

        IntStream.rangeClosed(1, maxNum).boxed().filter(isDivisible).forEach(number -> System.out.print(number + " "));
    }
}

