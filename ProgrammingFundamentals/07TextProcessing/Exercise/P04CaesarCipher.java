package F10TextProcessing.Exercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        StringBuilder result = new StringBuilder();

            for (char symbol : inputText.toCharArray()) {
                char changedSymbol = (char) (symbol + 3);
                result.append(changedSymbol);
            }

        System.out.println(result);
    }
}
