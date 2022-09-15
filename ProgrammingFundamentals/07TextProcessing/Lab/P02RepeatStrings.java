package F10TextProcessing.Lab;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int currentWordLength = currentWord.length();
            result.append(repeatString(currentWord, currentWordLength));
        }
        System.out.println(result);
    }

    public static StringBuilder repeatString (String currentWord, int currentWordLength) {
        StringBuilder repeatCurrentWord = new StringBuilder();
        for (int i = 0; i < currentWord.length(); i++) {
            repeatCurrentWord.append(currentWord);
        }

        return repeatCurrentWord;
    }
}
