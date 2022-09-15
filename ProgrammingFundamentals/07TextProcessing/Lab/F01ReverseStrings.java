package F10TextProcessing.Lab;

import java.util.Scanner;

public class F01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentWord = scanner.nextLine();

        while (!currentWord.equals("end")) {
            StringBuilder currentReversedWord = new StringBuilder();
            for (int i = currentWord.length() - 1; i >= 0 ; i--) {
                char currentSymbol = currentWord.charAt(i);
                currentReversedWord.append(currentSymbol);
            }
            System.out.printf("%s = %s%n", currentWord, currentReversedWord);

            currentWord = scanner.nextLine();

        }
    }
}
