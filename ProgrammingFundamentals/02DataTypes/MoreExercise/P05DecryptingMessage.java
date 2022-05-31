package F02DataTypes.MoreEcercise;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short key = Short.parseShort(scanner.nextLine());
        short num = Short.parseShort(scanner.nextLine());

        String result = "";

        for (int i = 1; i <= num; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int currentSymbol = symbol + key;
            result += (char)currentSymbol;
        }

        System.out.println(result);
    }
}
