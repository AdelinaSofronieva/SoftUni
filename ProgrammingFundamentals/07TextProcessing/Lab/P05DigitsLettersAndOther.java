package F10TextProcessing.Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder allOthers = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (Character.isDigit(currentSymbol)) {
                digits.append(currentSymbol);
            } else if (Character.isLetter(currentSymbol)) {
                letters.append(currentSymbol);
            } else {
                allOthers.append(currentSymbol);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(allOthers);
    }
}
