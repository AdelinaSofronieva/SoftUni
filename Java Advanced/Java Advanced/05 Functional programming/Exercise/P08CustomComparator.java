package J05FunctionalProgramming.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Comparator<Integer> comparator = (f, s) -> {
            if (f % 2 == 0 && s % 2 != 0) {
                return -1;
            } else if (f % 2 != 0 && s % 2 == 0) {
                return 1;
            }
            return (f.compareTo(s));
        };

        inputNumbersList.sort(comparator);

        inputNumbersList.stream()
                .forEach(num -> System.out.print(num + " "));
    }
}
