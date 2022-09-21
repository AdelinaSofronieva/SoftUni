package F04Methods.Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String innput = scanner.nextLine();

        while (!innput.equals("END")) {

            checkPalindromeIntegers(innput);

            innput = scanner.nextLine();
        }
    }

    public static void checkPalindromeIntegers (String input) {
        char firstSymbol = input.charAt(0);
        char lastSymbol = input.charAt(input.length() - 1);

        if (firstSymbol == lastSymbol) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
