package F11RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] participants = scanner.nextLine().split(", ");

        Map<String, Integer> participantsMap = new LinkedHashMap<>();
        for (int i = 0; i < participants.length; i++) {
            String currentParticipant = participants[i];
            participantsMap.put(currentParticipant, 0);
        }
        String inputInfo = scanner.nextLine();

        while (!inputInfo.equals("end of race")) {
            Pattern namePattern = Pattern.compile("[A-Za-z]+");
            Pattern distancePattern = Pattern.compile("[0-9]");
            Matcher matcherName = namePattern.matcher(inputInfo);
            Matcher matcherDistance = distancePattern.matcher(inputInfo);

            StringBuilder currentName = new StringBuilder();
            while (matcherName.find()) {
                String currentLetter = matcherName.group();
                currentName.append(currentLetter);

            }

            int sum = 0;
            //boolean check = participantsMap.containsKey(currentName.toString());
            while (matcherDistance.find()) {
                int currentDistance = Integer.parseInt(matcherDistance.group());
                sum += currentDistance;
            }

            if (participantsMap.containsKey(currentName.toString())) {

                int previousDistance = participantsMap.get(currentName.toString());
                participantsMap.put(currentName.toString(), previousDistance + sum);
            }


            inputInfo = scanner.nextLine();
        }

        List<String> raceList = participantsMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n", raceList.get(0));
        System.out.printf("2nd place: %s%n", raceList.get(1));
        System.out.printf("3rd place: %s%n", raceList.get(2));
    }
}
