package F04Methods.Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        printMiddleCharacter(inputText);
    }

    public static void printMiddleCharacter (String inputText) {
        if (inputText.length() % 2 != 0) {
            char middleCharacter = inputText.charAt(inputText.length() / 2);
            System.out.print(middleCharacter);
        } else  {
            char firstMidleChar = inputText.charAt((inputText.length() / 2) - 1);
            char secondtMidleChar = inputText.charAt(inputText.length() / 2);
            System.out.print("" + firstMidleChar + secondtMidleChar);
        }
    }
}
