package F04Methods.Exercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        vowelsCount(inputText);
    }

    public static void vowelsCount (String inputText) {
        int countVowels = 0;
        for (int i = 0; i < inputText.length(); i++) {
            char currentLetter = inputText.charAt(i);
            if (currentLetter=='a' || currentLetter=='e' || currentLetter=='i' || currentLetter=='o' || currentLetter=='u' ||
                    currentLetter=='A' || currentLetter=='E' || currentLetter=='I' || currentLetter=='O' || currentLetter=='U') {
                countVowels++;
            }

        }

        System.out.println(countVowels);
    }
}
