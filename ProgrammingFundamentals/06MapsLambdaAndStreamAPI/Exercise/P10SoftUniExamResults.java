package F09MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, Integer> usersAndPointsMap = new LinkedHashMap<>();
        Map<String, Integer> countUsersSubmissionsMap = new LinkedHashMap<>();

        while (!inputLine.equals("exam finished")) {
//{username}-{language}-{points}"
            String username = inputLine.split("-")[0];
            String language = inputLine.split("-")[1];

            if (language.equals("banned")) {
                usersAndPointsMap.remove(username);
                inputLine = scanner.nextLine();
                continue;
            }

            if (!countUsersSubmissionsMap.containsKey(language)) {
                countUsersSubmissionsMap.put(language, 1);
            } else {
                countUsersSubmissionsMap.put(language,countUsersSubmissionsMap.get(language) + 1);
            }


            int points = Integer.parseInt(inputLine.split("-")[2]);

            if (usersAndPointsMap.containsKey(username)) {
                int previousPoints = usersAndPointsMap.get(username);
                if (points > previousPoints) {
                    usersAndPointsMap.put(username, points);
                }
            } else {
                usersAndPointsMap.put(username, points);
            }

            inputLine = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : usersAndPointsMap.entrySet()) {
            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : countUsersSubmissionsMap.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }
    }
}
