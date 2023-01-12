package J03SetsAndMapsAdvanced.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<Character, Integer> characterOccurrencesMap = new TreeMap<>();

        for (int i = 0; i < inputLine.length(); i++) {
            char currentSymbol = inputLine.charAt(i);

            if (!characterOccurrencesMap.containsKey(currentSymbol)) {
                characterOccurrencesMap.put(currentSymbol, 1);
            } else {
                int countOccurrences = characterOccurrencesMap.get(currentSymbol) + 1;
                characterOccurrencesMap.put(currentSymbol, countOccurrences);
            }
        }

        characterOccurrencesMap.forEach((key, value) -> System.out.printf("%s: %d time/s%n", key, value));
    }
}
