package F02DataTypes.Lab;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        char thirdSymbol = scanner.nextLine().charAt(0);

        String reversedChars = String.format("%s %s %s", thirdSymbol, secondSymbol, firstSymbol);
        System.out.println(reversedChars);

    }
}
