package F02DataTypes.Exercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCode = Integer.parseInt(scanner.nextLine());
        int lastCode = Integer.parseInt(scanner.nextLine());

        for (int i = firstCode; i <= lastCode; i++) {
            System.out.printf("%c ", i);

        }

    }
}
