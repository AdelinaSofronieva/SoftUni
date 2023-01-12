package J05FunctionalProgramming.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class P05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> peopleMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] nameAndAge = scanner.nextLine().split(", ");
            String name = nameAndAge[0];
            int age = Integer.parseInt(nameAndAge[1]);
            peopleMap.put(name, age);
        }

        String commandOlderOrYounger = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String printCommand = scanner.nextLine();

        BiPredicate<Integer, Integer> youngerOrOlderPredicate;
        if (commandOlderOrYounger.equals("younger")) {
            youngerOrOlderPredicate = (personAge, age) -> personAge <= age;
        } else {
            youngerOrOlderPredicate = (personAge, age) -> personAge >= age;
        }

        Consumer<Map.Entry<String, Integer>> printConsumer;
        if (printCommand.equals("name")) {
            printConsumer = person -> System.out.println(person.getKey());
        } else if (printCommand.equals("age")) {
            printConsumer = person -> System.out.println(person.getValue());
        } else {
            printConsumer = person -> System.out.println(person.getKey() + " - " + person.getValue());
        }

        peopleMap.entrySet().stream()
                .filter(person -> youngerOrOlderPredicate.test(person.getValue(), ageLimit))
                .forEach(printConsumer);
    }
}
