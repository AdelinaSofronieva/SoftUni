package F01BasicSyntax.Exercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double totalSum = 0;
        int countBrokenHeadsets = gamesLost / 2;
        int countBrokenMouses = gamesLost / 3;
        int countBrokenKeyboards = gamesLost / 6;
        int countBrokenDisplays = gamesLost / 12;

        totalSum = (countBrokenHeadsets * headsetPrice) + (countBrokenMouses * mousePrice) + (countBrokenKeyboards * keyboardPrice) + (countBrokenDisplays * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalSum);

    }
}
