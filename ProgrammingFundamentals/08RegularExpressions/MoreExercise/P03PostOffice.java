package F11RegularExpressions.MoreExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputMessage = scanner.nextLine().split("\\|");
        String capitalLettersPart = inputMessage[0];
        String wordsLengthPart = inputMessage[1];
        String[] wordsPart = inputMessage[2].split("\\s+");

        String capitalLetters = findCapitalLetters(capitalLettersPart);
        List<String> wordsLengthList = findWordLength(wordsLengthPart);
        Map<Character, Integer> capitalLettersLengthMap = new LinkedHashMap<>();

        for (char letter: capitalLetters.toCharArray()) {
            capitalLettersLengthMap.put(letter, 0);
        }

        for (int i = 0; i < wordsLengthList.size(); i++) {
            char charCodeOfCapitalLetter = (char) Integer.parseInt(wordsLengthList.get(i).split(":")[0]);
            int intLengthOfWord = Integer.parseInt(wordsLengthList.get(i).split(":")[1]) + 1;

            if (capitalLettersLengthMap.containsKey(charCodeOfCapitalLetter)) {
                capitalLettersLengthMap.replace(charCodeOfCapitalLetter, intLengthOfWord);
            }
            //capitalLettersLengthMap.put(charCodeOfCapitalLetter, intLengthOfWord);
        }

        for (int i = 0; i < wordsPart.length; i++) {
            String currentWord = wordsPart[i];
            char firstLetter = currentWord.charAt(0);

            if (capitalLettersLengthMap.containsKey(firstLetter) && currentWord.length() == capitalLettersLengthMap.get(firstLetter)) {
                System.out.println(currentWord);
            }

        }

//        System.out.println(capitalLetters);
//        System.out.println(String.join(System.lineSeparator(), wordsLengthList));
//        capitalLettersLengthMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


    }

    private static List<String> findWordLength(String wordsLengthPart) {

        List<String> wordsLengthList = new ArrayList<>();
        String regexWordLength = "[\\d]{2}:[\\d]{2}";
        Pattern patternWordLength = Pattern.compile(regexWordLength);
        Matcher matcherWordLength = patternWordLength.matcher(wordsLengthPart);

        while (matcherWordLength.find()) {
            wordsLengthList.add(matcherWordLength.group());
        }

        return  wordsLengthList;
    }

    private static String findCapitalLetters(String capitalLettersPart) {
        String capitalLetters = "";
        String regexCapitalLetters = "(?<startSymbol>[#$%*&])(?<validCapitalLetters>[A-Z]+)(\\1)";
        Pattern patternCapitalLetters = Pattern.compile(regexCapitalLetters);
        Matcher matcherCapitalLetters = patternCapitalLetters.matcher(capitalLettersPart);

        while (matcherCapitalLetters.find()) {
            capitalLetters = matcherCapitalLetters.group("validCapitalLetters");
        }
        return  capitalLetters;
    }
}
