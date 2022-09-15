package F10TextProcessing.Lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWordsArray = scanner.nextLine().split(", ");
        String inputText = scanner.nextLine();

        for (int i = 0; i < bannedWordsArray.length; i++) {
            String currentBannedWord = bannedWordsArray[i];
            int currentBannedWordLength = currentBannedWord.length();

            StringBuilder currentCensuredWord = new StringBuilder();
            for (int j = 0; j < currentBannedWordLength; j++) {
                currentCensuredWord.append("*");
            }

            if (inputText. contains(currentBannedWord)) {
                inputText = inputText.replace(currentBannedWord, currentCensuredWord);
            }
        }

        System.out.println(inputText);
    }
}
