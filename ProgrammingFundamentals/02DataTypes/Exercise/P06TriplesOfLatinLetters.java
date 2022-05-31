package F02DataTypes.Exercise;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int letter1 = 1; letter1 <= n; letter1++) {
            for (int letter2 = 1; letter2 <= n; letter2++) {
                for (int letter3 = 1; letter3 <= n; letter3++) {
                    System.out.printf("%c%c%c%n", letter1 + 96, letter2 + 96, letter3 + 96);
                }
            }
        }
    }
}
