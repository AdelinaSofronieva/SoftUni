package J03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class P07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, HashSet<String>> playersMap = new LinkedHashMap<>();

        while (!inputLine.equals("JOKER")) {
            String name = inputLine.split(": ")[0];
            String cards = inputLine.split(": ")[1];
            String[] cardsArr = cards.split(", ");

            playersMap.putIfAbsent(name, new HashSet<>());
            Collections.addAll(playersMap.get(name), cardsArr);

        inputLine = scanner.nextLine();
    }

        for (var entry : playersMap.entrySet()) {
            String name = entry.getKey();
            HashSet<String> playerCards = entry.getValue();
            int sum = 0;

            for (String currentCard:playerCards) {
                String numberOfCard = currentCard.substring(0, currentCard.length() - 1);
                String colorOfCard = currentCard.substring(currentCard.length() - 1);
                int powerOfCards = (getNumberOfCard(numberOfCard) * getColorOfCard(colorOfCard));
                sum += powerOfCards;
            }
            System.out.printf("%s: %d%n", name, sum);
        }
}

    private static int getColorOfCard(String colorOfCard) {
        switch (colorOfCard) {
            case "S" :
                return 4;
            case "H" :
                return 3;
            case "D" :
                return 2;
            case "C" :
                return 1;
        }
        return 0;
    }

    private static int getNumberOfCard(String numberOfCard) {
        switch (numberOfCard) {
            case "2":
                return  2;
            case "3":
                return  3;
            case "4":
                return  4;
            case "5":
                return  5;
            case "6":
                return  6;
            case "7":
                return  7;
            case "8":
                return  8;
            case "9":
                return  9;
            case "10":
                return  10;
            case "J":
                return  11;
            case "Q":
                return  12;
            case "K":
                return  13;
            case "A":
                return  14;
        }
        return 0;
    }
}
