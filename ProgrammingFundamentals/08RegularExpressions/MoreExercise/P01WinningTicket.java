package F11RegularExpressions.MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputTickets = scanner.nextLine().split("\\s*,\\s*");

        //String regex = "[^@#$\\^]*([@#$\\^]{6,10})[^@#$\\^]*(\\1)[^@#$\\^]*";
        String regex = "([@#$\\^]{6,})[\\x00-\\x7F]*?(\\1)";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < inputTickets.length; i++) {
            String currentTicket = inputTickets[i];
            Matcher matcher = pattern.matcher(currentTicket);
            if (currentTicket.length() != 20) {
                System.out.println("invalid ticket");
            } else {
                if (matcher.find()) {
                    char currentSymbol = matcher.group(1).charAt(0);
                    if (matcher.group(1).length() < 10 && matcher.group(2).length() < 10) {
                        System.out.printf("ticket \"%s\" - %d%c%n", currentTicket, Math.min(matcher.group(1).length(), matcher.group(2).length()), currentSymbol);
                    } else {
                        System.out.printf("ticket \"%s\" - 10%c Jackpot!%n", currentTicket, currentSymbol);
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", currentTicket);
                }
            }
        }
    }
}
