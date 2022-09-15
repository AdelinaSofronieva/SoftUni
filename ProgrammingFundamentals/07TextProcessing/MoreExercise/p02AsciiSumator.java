package F10TextProcessing.MoreExercise;

import java.util.Scanner;

public class p02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startCharacter = scanner.nextLine().charAt(0);
        char endCharacter = scanner.nextLine().charAt(0);
        String inputLine = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < inputLine.length(); i++) {
            char currentChar = inputLine.charAt(i);
            if (currentChar > startCharacter && currentChar < endCharacter) {
                sum += currentChar;
            }
        }

        System.out.println(sum);
    }
}
