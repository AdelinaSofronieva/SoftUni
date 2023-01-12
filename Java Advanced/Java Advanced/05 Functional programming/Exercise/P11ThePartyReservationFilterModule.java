package J05FunctionalProgramming.Exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P11ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestNamesList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Set<String> commandsSet = new LinkedHashSet<>();

        String command = scanner.nextLine();
        while (!command.equals("Print")) {
            String[] commands = command.split(";");
            String addOrRemove = commands[0];
            String filterType = commands[1];
            String filterParameter = commands[2];

            if (addOrRemove.equals("Add filter")) {
                commandsSet.add(filterType + ";" + filterParameter);
            } else {
                commandsSet.remove(filterType + ";" + filterParameter);
            }

            command = scanner.nextLine();
        }

        commandsSet.forEach(filter ->{
                Predicate<String> filterToApply = getPredicate(filter);
                guestNamesList.removeIf(filterToApply);
                });

                guestNamesList.forEach(name -> System.out.print(name + " "));
    }

    private static Predicate<String> getPredicate(String filter) {
        String[] filterParts = filter.split(";");
        String filterType = filterParts[0];
        String parameter = filterParts[1];
        switch (filterType) {
            case "Starts with":
                return s -> s.startsWith(parameter);
            case "Ends with":
                return s -> s.endsWith(parameter);
            case "Length":
                return s -> s.length() == Integer.parseInt(parameter);
            case "Contains":
                return s -> s.contains(parameter);
        }
        return null;
    }
}
