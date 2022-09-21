package F09MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> usersMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            String command = commandLine[0];
            String username = commandLine[1];

            if (command.equals("register")) {
                String licensePlateNumber = commandLine[2];

                if (usersMap.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                } else {
                    usersMap.put(username,licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                }
            } else {
                if (usersMap.containsKey(username)) {
                    System.out.printf("%s unregistered successfully%n", username);
                    usersMap.remove(username);
                } else {
                    System.out.printf("ERROR: user %s not found%n", username);
                }
            }
        }

        for (Map.Entry<String, String> entry : usersMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
