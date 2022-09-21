package F09MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, List<String>> forceBookMap = new LinkedHashMap<>();

        while (!inputLine.equals("Lumpawaroo")) {

            if (inputLine.contains(" | ")) {
                String forceSide = inputLine.split(" \\| ")[0];
                String forceUser = inputLine.split(" \\| ")[1];

                if (!forceBookMap.containsKey(forceSide) && !forceBookMap.containsValue(forceUser)) {
                    forceBookMap.put(forceSide, new ArrayList<>());
                    forceBookMap.get(forceSide).add(forceUser);
                } else if (!forceBookMap.get(forceSide).contains(forceUser)) {
                    forceBookMap.get(forceSide).add(forceUser);
                }
            } else {
                String forceUser = inputLine.split(" -> ")[0];
                String forceSide = inputLine.split(" -> ")[1];
                String getKeyToRemove = "";
                boolean ifContainsUser = false;
                //if (forceBookMap.containsValue(forceUser)) {
                for (Map.Entry<String, List<String>> entry : forceBookMap.entrySet()) {
                    if (entry.getValue().contains(forceUser)) {
                        ifContainsUser = true;
                        getKeyToRemove = entry.getKey();
                    }
                }
                if (ifContainsUser) {
                    forceBookMap.get(getKeyToRemove).remove(forceUser);

                    if (!forceBookMap.containsKey(forceSide) && !forceBookMap.containsValue(forceUser)) {
                        forceBookMap.put(forceSide, new ArrayList<>());
                        forceBookMap.get(forceSide).add(forceUser);
                    } else if (!forceBookMap.get(forceSide).contains(forceUser)) {
                        forceBookMap.get(forceSide).add(forceUser);
                    }
                } else {

                    if (!forceBookMap.containsKey(forceSide) && !forceBookMap.containsValue(forceUser)) {
                        forceBookMap.put(forceSide, new ArrayList<>());
                        forceBookMap.get(forceSide).add(forceUser);
                    } else if (!forceBookMap.get(forceSide).contains(forceUser)) {
                        forceBookMap.get(forceSide).add(forceUser);
                    }
                }
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
            inputLine = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : forceBookMap.entrySet()) {
            if (forceBookMap.get(entry.getKey()).size() > 0) {
                System.out.printf("Side: %s, Members: %d%n! %s%n", entry.getKey(), forceBookMap.get(entry.getKey()).size(), String.join(System.lineSeparator() + "! ", entry.getValue()));
            }
        }

    }
}
