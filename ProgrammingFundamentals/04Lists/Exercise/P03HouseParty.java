package F05Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guestList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String commands = scanner.nextLine();
            List<String> commandLines = Arrays.stream(commands.split(" "))
                    .collect(Collectors.toList());

            String name = commandLines.get(0);
            String checkIfIsGoing = commandLines.get(2);

            if (checkIfIsGoing.equals("going!")) {
                if (guestList.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestList.add(name);
                }

            } else {
                if (guestList.contains(name)) {
                    guestList.remove(name);

                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }


        }
        for (String currentName: guestList) {
            System.out.println(currentName);
        }
    }
}
