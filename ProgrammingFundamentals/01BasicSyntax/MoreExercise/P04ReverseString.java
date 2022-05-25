package F01BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            char currentSymbol = text.charAt(i);
            result += currentSymbol;
        }

        System.out.println(result);
    }
}
