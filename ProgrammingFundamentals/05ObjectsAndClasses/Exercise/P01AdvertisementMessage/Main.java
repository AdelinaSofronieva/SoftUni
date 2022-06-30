package F08ObjectsAndClasses.Exercise.P01AdvertisementMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int n = Integer.parseInt(scanner.nextLine());

        //{phrase} {event} {author} – {city}.
        String[] phrasesList = new String[]{"Excellent product.",
                "Such a great product.", "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};

        String[] eventsList = new String[]{"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};

        String[] authorsList = new String[]{"Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"};


        String[] citiesList = new String[]{"Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"};


        //System.out.println(String.join(", ", citiesList));

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            randomziedArray(phrasesList);
            randomziedArray(eventsList);
            randomziedArray(authorsList);
            randomziedArray(citiesList);

            System.out.printf("%s %s %s - %s.%n", phrasesList[0], eventsList[0], authorsList[0], citiesList[0]);
        }
    }

    public static String[] randomziedArray(String[] wordsArr) {
        Random randomWords = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int x = randomWords.nextInt(wordsArr.length);
            int y = randomWords.nextInt(wordsArr.length);

            String oldWord = wordsArr[x];
            wordsArr[x] = wordsArr[y];
            wordsArr[y] = oldWord;

        }

        return wordsArr;
    }
}
