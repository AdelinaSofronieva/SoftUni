package F08ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] wordsArr = input.split(" ");
        Random randomWords = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int x = randomWords.nextInt(wordsArr.length);
            int y = randomWords.nextInt(wordsArr.length);

            String oldWord = wordsArr[x];
            wordsArr[x] = wordsArr[y];
            wordsArr[y] = oldWord;

        }

        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
