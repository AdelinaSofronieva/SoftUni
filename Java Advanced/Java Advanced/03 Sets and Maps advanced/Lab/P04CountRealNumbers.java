package J03SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> countDoubleOccurrences = new LinkedHashMap<>();

        for (int i = 0; i < inputLine.length; i++) {
            double currentNum = inputLine[i];

            if (!countDoubleOccurrences.containsKey(currentNum)) {
                countDoubleOccurrences.put(currentNum, 1);
            } else {
                countDoubleOccurrences.put(currentNum, countDoubleOccurrences.get(currentNum) + 1);
            }
        }

        for (Map.Entry<Double, Integer> currentEntry : countDoubleOccurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n", currentEntry.getKey(), currentEntry.getValue());
        }
    }
}
