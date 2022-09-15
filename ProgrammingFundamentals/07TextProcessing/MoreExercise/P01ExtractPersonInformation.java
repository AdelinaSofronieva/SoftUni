package F10TextProcessing.MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> personalInfoMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String inputLine = scanner.nextLine();
            int nameStartIndex = inputLine.indexOf("@");
            int nameEndIndex = inputLine.indexOf("|");
            int ageStartIndex = inputLine.indexOf("#");
            int ageEndIndex = inputLine.indexOf("*");

            String currentName = inputLine.substring(nameStartIndex + 1, nameEndIndex);
            String currentAge = inputLine.substring(ageStartIndex + 1, ageEndIndex);

            personalInfoMap.put(currentName, currentAge);
        }

        for (Map.Entry<String, String> entry : personalInfoMap.entrySet()) {
            System.out.printf("%s is %s years old.%n", entry.getKey(), entry.getValue());
        }

    }
}
