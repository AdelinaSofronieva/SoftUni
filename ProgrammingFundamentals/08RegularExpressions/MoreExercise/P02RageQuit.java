package F11RegularExpressions.MoreExercise;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rageOfChochko = scanner.nextLine();

        String regex = "(?<symbol>[^\\d]+)(?<repeatTimes>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rageOfChochko);

        StringBuilder uniqueSymbols = new StringBuilder();
        int countUniqueSymbols = 0;
        StringBuilder resultRage = new StringBuilder();

        while (matcher.find()) {
            String currentLetterMatch = matcher.group("symbol");
            int repeatTimes = Integer.parseInt(matcher.group("repeatTimes"));

            for (int i = 0; i < currentLetterMatch.length(); i++) {
                String currentSymbol = String.valueOf(currentLetterMatch.charAt(i)).toLowerCase();
                if (!uniqueSymbols.toString().contains(currentSymbol) && repeatTimes > 0) {
                    //if (!currentSymbol.equals(" ")) {
                        uniqueSymbols.append(currentSymbol);
                        countUniqueSymbols++;
                    //}
                }
            }

            for (int i = 1; i <= repeatTimes; i++) {
                resultRage.append(currentLetterMatch.toUpperCase());
            }
        }

        System.out.printf("Unique symbols used: %d%n", countUniqueSymbols);
        System.out.println(resultRage);
        //System.out.println(uniqueSymbols);
    }
}
