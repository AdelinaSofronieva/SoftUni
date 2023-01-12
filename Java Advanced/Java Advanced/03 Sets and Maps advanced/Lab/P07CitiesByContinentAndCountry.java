package J03SetsAndMapsAdvanced.Lab;

import java.util.*;

public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,Map<String,List<String>>> continentsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            String continent = inputLine[0];
            String country = inputLine[1];
            String city = inputLine[2];

                continentsMap.putIfAbsent(continent, new LinkedHashMap<>());
                continentsMap.get(continent).putIfAbsent(country, new ArrayList<>());
                continentsMap.get(continent).get(country).add(city);

            System.out.println("");
        }

        for (var continent : continentsMap.entrySet()) {
            System.out.printf("%s:%n", continent.getKey());

            Map<String, List<String>> countriesMap = continent.getValue();
            for (var country : countriesMap.entrySet()) {
                System.out.println(country.getKey() + " -> " + String.join(", ", country.getValue()));
            }
        }
    }
}
