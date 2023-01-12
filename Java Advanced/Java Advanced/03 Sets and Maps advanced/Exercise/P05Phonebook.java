package J03SetsAndMapsAdvanced.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phoneBookInput = scanner.nextLine();

        Map<String, String> phoneBookMap = new HashMap<>();

        while(!phoneBookInput.equals("search")) {
            String name = phoneBookInput.split("-")[0];
            String number = phoneBookInput.split("-")[1];
            phoneBookMap.put(name, number);


            phoneBookInput = scanner.nextLine();
        }

        String searchName = scanner.nextLine();

        while (!searchName.equals("stop")) {

            if (phoneBookMap.containsKey(searchName)) {
                System.out.println(searchName + " -> " + phoneBookMap.get(searchName));
            } else
                System.out.printf("Contact %s does not exist.%n", searchName);


            searchName = scanner.nextLine();
        }
    }
}
