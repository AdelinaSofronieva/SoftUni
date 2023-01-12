package J03SetsAndMapsAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P09Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays.
                stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        Set<Integer> largest3NumsSet = new LinkedHashSet<>();

        if (sorted.size() < 3) {
            largest3NumsSet.addAll(sorted);
        } else {
            for (int i = 0; i < 3; i++) {
                int currentNum = sorted.get(i);
                largest3NumsSet.add(currentNum);
            }
        }

        largest3NumsSet.forEach(num ->
                System.out.printf("%d ", num));
    }
}
