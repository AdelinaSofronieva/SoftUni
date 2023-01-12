package J06DefiningClasses.Exercise.P01OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> peopleList = new ArrayList<>();

        while (n-- > 0) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String name = inputData[0];
            int age = Integer.parseInt(inputData[1]);

            Person person = new Person(name, age);
            peopleList.add(person);

        }

        peopleList.stream()
                .filter(p -> p.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
