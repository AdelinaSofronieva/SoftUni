package J01WorkingWithAbstraction.Exercise.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RankPower rankPower = RankPower.valueOf(scanner.nextLine());
        SuitPower suitPower = SuitPower.valueOf(scanner.nextLine());

        int cardPower = rankPower.getRankPower() + suitPower.getSuitPower();

        System.out.printf("Card name: %s of %s; Card power: %d", rankPower, suitPower, cardPower);
    }
}
