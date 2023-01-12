package J05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestNames = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Party!")) {
            String[] commands = command.split("\\s+");
            String currentCommand = commands[0];
            String predicateType = commands[1];
            String predicateArgument = commands[2];

            if (currentCommand.equals("Remove")) {
                guestNames.removeIf(getPredicate(predicateType,predicateArgument));
            } else {
                for (int i = 0; i < guestNames.size(); i++) {
                    String guest = guestNames.get(i);
                    if (getPredicate(predicateType,predicateArgument).test(guest)) {
                        guestNames.add(i++, guest);
                    }
                }
            }

            command = scanner.nextLine();
        }

        if (guestNames.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guestNames);
            System.out.println(String.join(", ", guestNames) + " are going to the party!");
        }
    }

    private static Predicate<String> getPredicate(String type, String parameter) {
        switch (type) {
            case "StartsWith":
                return text -> text.startsWith(parameter);
            case "EndsWith" :
                return text -> text.endsWith(parameter);
            case "Length" :
                return text -> text.length() == Integer.parseInt(parameter);
            default:
                return text -> false;

        }
    }
}
