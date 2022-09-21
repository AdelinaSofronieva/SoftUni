package F09MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        Map<Character,Integer> countCharsInStringMap = new LinkedHashMap<>();

        for (int i = 0; i < inputText.length(); i++) {
            char currentCharacter = inputText.charAt(i);
            if (currentCharacter != ' '){
                if (!countCharsInStringMap.containsKey(currentCharacter)) {
                    countCharsInStringMap.put(currentCharacter, 1);
                } else {
                    countCharsInStringMap.put(currentCharacter, countCharsInStringMap.get(currentCharacter) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> item : countCharsInStringMap.entrySet()) {
            System.out.printf("%c -> %d%n", item.getKey(), item.getValue());
        }

    }
}
