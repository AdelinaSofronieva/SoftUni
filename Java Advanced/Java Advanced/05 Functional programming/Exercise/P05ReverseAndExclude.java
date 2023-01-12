package J05FunctionalProgramming.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int numToDiviseTo = Integer.parseInt(scanner.nextLine());

        Collections.reverse(inputNumbersList);

        inputNumbersList.stream()
                .filter(num -> num % numToDiviseTo != 0)
                .forEach(num -> System.out.print(num + " "));
    }
}
