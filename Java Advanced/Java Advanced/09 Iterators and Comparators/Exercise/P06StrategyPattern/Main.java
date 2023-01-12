package J09IteratorsAndComparators.Exercise.P06StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Person> compareByNameSet = new TreeSet<>(new ComparatorByName());
        Set<Person> compareByAgeSet = new TreeSet<>(new ComparatorByAge());

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String name = inputData[0];
            int age = Integer.parseInt(inputData[1]);

            Person person = new Person(name, age);

            compareByNameSet.add(person);
            compareByAgeSet.add(person);
        }

        for (Person person : compareByNameSet) {
            System.out.println(person);
        }

        for (Person person : compareByAgeSet) {
            System.out.println(person);
        }
    }
}
