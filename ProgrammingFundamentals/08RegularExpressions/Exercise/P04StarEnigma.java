package F11RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<planetPopulation>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldierCount>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> attackedPlanetsList = new ArrayList<>();
        List<String> destroyedPlanetsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String inputLine = scanner.nextLine();

            StringBuilder decryptMessage = new StringBuilder();
            int decriptionKey = 0;

            for (char currentSymbol: inputLine.toCharArray()) {
                if (currentSymbol == 's' || currentSymbol == 't' || currentSymbol == 'a' || currentSymbol == 'r'
                        || currentSymbol == 'S' || currentSymbol == 'T' || currentSymbol == 'A' || currentSymbol == 'R') {
                    decriptionKey++;
                }
            }

            for (int j = 0; j < inputLine.length(); j++) {
                char currentSymbol = inputLine.charAt(j);
                char decryptSymbol = (char) (currentSymbol - decriptionKey);
                decryptMessage.append(decryptSymbol);
            }
            //System.out.println(decryptMessage);
            Matcher matcher = pattern.matcher(decryptMessage);

            while (matcher.find()) {
                String planetName = matcher.group("planetName");
                int planetPopulation = Integer.parseInt(matcher.group("planetPopulation"));
                String attackType = matcher.group("attackType");
                int soldierCount = Integer.parseInt(matcher.group("planetPopulation"));

                if (attackType.equals("A")){
                    attackedPlanetsList.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyedPlanetsList.add(planetName);
                }
            }
        }
        Collections.sort(attackedPlanetsList);
        Collections.sort(destroyedPlanetsList);

        System.out.printf("Attacked planets: %d%n", attackedPlanetsList.size());
        attackedPlanetsList.forEach(planet -> System.out.printf("-> %s%n", planet));
        System.out.printf("Destroyed planets: %d%n", destroyedPlanetsList.size());
        destroyedPlanetsList.forEach(planet -> System.out.printf("-> %s%n", planet));

    }
}
