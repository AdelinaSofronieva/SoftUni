package J05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        Function<List<Integer>, Integer> findMinIndex = integerList -> {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < inputNumbersList.size(); i++) {
                if (integerList.get(i) <= min) {
                    min = integerList.get(i) ;
                    index = i;
                }
            }
            return index;
        };

//        int min = inputNumbersList.stream()
//                .min(Integer::compare).get();

        System.out.println(findMinIndex.apply(inputNumbersList));
    }
}
