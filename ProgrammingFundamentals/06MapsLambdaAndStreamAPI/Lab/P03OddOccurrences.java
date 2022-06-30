package F09MapsLambdaAndStreamAPI.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors.toList());

        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String currentWord: inputList) {
            String currentWordToLowerCase = currentWord.toLowerCase();
            if (!wordsMap.containsKey(currentWordToLowerCase)) {
                wordsMap.put(currentWordToLowerCase, 1);
            } else {
                int currentCount = wordsMap.get(currentWordToLowerCase);
                wordsMap.put(currentWordToLowerCase, currentCount + 1);
            }
        }

        List<String> oddsList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddsList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddsList));

    }
}
