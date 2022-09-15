package F10TextProcessing.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s+");

        double totalSum = 0.0;
        //A12b s17G
        for (int i = 0; i < inputLine.length; i++) {
            String currentWord = inputLine[i];
            double currentSum = 0.0;

            Character firstLetter = currentWord.charAt(0);
            double number = Double.parseDouble(currentWord.substring(1, currentWord.length() - 1));
            Character lastLetter = currentWord.charAt(currentWord.length() - 1);
           int positionOfFirstLetter = 0;
           int positionOfLastLetter = 0;

           if (number == 0) {
               continue;
           }
            if (Character.isUpperCase(firstLetter)) {
                positionOfFirstLetter = firstLetter - 64;
                currentSum = (number / positionOfFirstLetter );
            } else {
                positionOfFirstLetter = firstLetter - 96;
                currentSum = (number * positionOfFirstLetter);
            }

            if (Character.isUpperCase(lastLetter)) {
                positionOfLastLetter = lastLetter - 64;
                currentSum -= positionOfLastLetter;
            } else {
                positionOfLastLetter = lastLetter - 96;
                currentSum += positionOfLastLetter;
            }

            totalSum += currentSum;
            //System.out.println();
        }

        System.out.printf("%.2f", totalSum);
    }
}
