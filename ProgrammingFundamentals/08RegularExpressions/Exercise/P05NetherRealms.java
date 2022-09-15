package F11RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s*,\\s*");

        String regex = "(?<deamonsHealth>[^0-9.+\\-*\\/])?(?<numbers>[\\-]?[0-9]+[\\.]?[0-9]*)?";
                //"(?<deamonsHealth>[^0-9.+\\-*\\/])?(?<numbers>[\\-]?[0-9]+\\.?[0-9]*)?(?<divideOrMultiply>[*\\/]*?)?";
        Pattern pattern = Pattern.compile(regex);


        for (int i = 0; i < inputLine.length; i++) {
            int totalDemonHealth = 0;
            double totalDemonsDamage = 0;
            String currentDeamonsName = inputLine[i];

            Matcher matcher = pattern.matcher(currentDeamonsName);
            String currentDemonsHealth = "";
            String currentDemonsNumbers ="";
            while (matcher.find()) {
                currentDemonsHealth = matcher.group("deamonsHealth");
                currentDemonsNumbers = matcher.group("numbers");

                if (currentDemonsHealth != null) {
                    int currentSymbol = currentDemonsHealth.charAt(0);
                    totalDemonHealth += currentSymbol;
                }

                if (currentDemonsNumbers != null) {
                    double currentNum = Double.parseDouble(currentDemonsNumbers);
                    totalDemonsDamage += currentNum;
                }

            }

            for (int j = 0; j < currentDeamonsName.length(); j++) {
                String currentSymbol = String.valueOf(currentDeamonsName.charAt(j));
                if (currentSymbol.equals("*")) {
                    totalDemonsDamage *= 2;
                } else if (currentSymbol.equals("/")) {
                    totalDemonsDamage /= 2;
                }

            }

                System.out.printf("%s - %d health, %.2f damage%n", currentDeamonsName, totalDemonHealth, totalDemonsDamage);
        }

    }
}
