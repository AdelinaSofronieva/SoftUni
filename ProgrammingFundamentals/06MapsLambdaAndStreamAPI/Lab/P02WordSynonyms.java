package F09MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordSynonymsMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String currentWord = scanner.nextLine();
            String currentSynonym = scanner.nextLine();

            if (!wordSynonymsMap.containsKey(currentWord)) {
                wordSynonymsMap.put(currentWord,new ArrayList<>());
                wordSynonymsMap.get(currentWord).add(currentSynonym);
            } else {
                wordSynonymsMap.get(currentWord).add(currentSynonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : wordSynonymsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

    }
}
