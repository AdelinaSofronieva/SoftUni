package F10TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06ReplacRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        List<Character> charactersList = new ArrayList<>();
        for (int i = 0; i < inputText.length(); i++) {
            char currentCharacter = inputText.charAt(i);
            charactersList.add(currentCharacter);
        }

        for (int i = 1; i < charactersList.size(); i++) {
            char previousChar = charactersList.get(i - 1);
            char currentChar = charactersList.get(i);

            if (previousChar == currentChar) {
                charactersList.remove(i);
                i--;
            }
        }

        for (Character character : charactersList) {
            System.out.print(character);
        }

    }
}
