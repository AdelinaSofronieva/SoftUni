package F05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerList = Arrays.stream(scanner.nextLine()
        .split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        List<Integer> secondPlayerList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumFirstPlayer = 0;
        int sumSecondPlayer = 0;
        int sum = 0;
        String winner = "";

        for (int i = 0; i < firstPlayerList.size(); i++) {
            if (secondPlayerList.isEmpty()) {
                break;
            }

            int firstPlayerCurrentCard = firstPlayerList.get(i);
            int secondPlayerCurrentCard = secondPlayerList.get(i);

            if (firstPlayerCurrentCard > secondPlayerCurrentCard) {
                firstPlayerList.remove(i);
                secondPlayerList.remove(i);

                firstPlayerList.add(firstPlayerCurrentCard);
                firstPlayerList.add(secondPlayerCurrentCard);


            } else if (firstPlayerCurrentCard == secondPlayerCurrentCard) {
                firstPlayerList.remove(i);
                secondPlayerList.remove(i);

            } else if (firstPlayerCurrentCard < secondPlayerCurrentCard) {
                firstPlayerList.remove(i);
                secondPlayerList.remove(i);

                secondPlayerList.add(secondPlayerCurrentCard);
                secondPlayerList.add(firstPlayerCurrentCard);

            }
            i -=1;
        }

        for (int i = 0; i < firstPlayerList.size(); i++) {
            sumFirstPlayer += firstPlayerList.get(i);
        }

        for (int i = 0; i < secondPlayerList.size(); i++) {
            sumSecondPlayer += secondPlayerList.get(i);
        }

        if (sumFirstPlayer > sumSecondPlayer) {
            winner = "First";
            sum = sumFirstPlayer;
        } else if (sumSecondPlayer > sumFirstPlayer) {
            winner = "Second";
            sum = sumSecondPlayer;
        }
        System.out.printf("%s player wins! Sum: %d", winner, sum);
    }
}
