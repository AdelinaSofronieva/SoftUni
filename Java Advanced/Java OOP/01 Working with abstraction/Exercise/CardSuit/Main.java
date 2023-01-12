package J01WorkingWithAbstraction.Exercise.CardSuit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");
        for (CardSuit cardSuit : CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name());
        }
    }
}
