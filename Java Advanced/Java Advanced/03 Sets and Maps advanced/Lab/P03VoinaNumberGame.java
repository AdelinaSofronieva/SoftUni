package J03SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer>firstPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer>secondPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;
        while (rounds-- > 0) {
            int firstPayerCurrentCard = firstPlayerCards.iterator().next();
            int secondPayerCurrentCard = secondPlayerCards.iterator().next();
            firstPlayerCards.remove(firstPayerCurrentCard);
            secondPlayerCards.remove(secondPayerCurrentCard);

            if (firstPayerCurrentCard > secondPayerCurrentCard) {
                firstPlayerCards.add(firstPayerCurrentCard);
                firstPlayerCards.add(secondPayerCurrentCard);
            } else if (secondPayerCurrentCard > firstPayerCurrentCard) {
                secondPlayerCards.add(firstPayerCurrentCard);
                secondPlayerCards.add(secondPayerCurrentCard);
            }

            if (firstPlayerCards.isEmpty() || secondPlayerCards.isEmpty()) {
                break;
            }
        }

        if (firstPlayerCards.size() > secondPlayerCards.size()) {
            System.out.println("First player win!");
        } else if (secondPlayerCards.size() > firstPlayerCards.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }
    }
}
