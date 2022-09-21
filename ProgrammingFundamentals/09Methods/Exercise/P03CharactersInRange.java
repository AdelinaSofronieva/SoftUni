package F04Methods.Exercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startCharcter = scanner.nextLine().charAt(0);
        char ednCharacter = scanner.nextLine().charAt(0);

        printCharactersInGivenRange(startCharcter, ednCharacter);
    }

    public static void printCharactersInGivenRange (char startCharacter, char endCharacter) {
        char temp = startCharacter;
        if (endCharacter < startCharacter) {
            startCharacter = endCharacter;
            endCharacter = temp;
        }
        for (char i = startCharacter; i < endCharacter; i++) {
            if (i != startCharacter) {
                System.out.print(i + " ");
            }
        }

    }
}
