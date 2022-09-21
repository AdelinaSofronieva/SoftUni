package F09MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> countResoursesMap = new LinkedHashMap<>();

        while (true) {
            Integer currentWordCount = countResoursesMap.get(resource);
            if (currentWordCount == null) {
                currentWordCount = 0;
            }

            countResoursesMap.put(resource, quantity + currentWordCount);

            resource = scanner.nextLine();
            if (resource.equals("stop")) {
                break;
            }
            quantity = Integer.parseInt(scanner.nextLine());
        }

        for (Map.Entry<String, Integer> entry : countResoursesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
