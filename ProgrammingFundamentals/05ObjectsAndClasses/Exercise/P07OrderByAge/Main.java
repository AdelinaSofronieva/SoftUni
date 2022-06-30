package F08ObjectsAndClasses.Exercise.P07OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputLine = input.split(" ");
            String name = inputLine[0];
            int id = Integer.parseInt(inputLine[1]);
            int age = Integer.parseInt(inputLine[2]);

            Person currentPerson = new Person(name, id, age);
            personList.add(currentPerson);

            input = scanner.nextLine();
        }

        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person: personList) {
            System.out.printf("%s with ID: %d is %d years old.%n", person.getName(), person.getID(), person.getAge());
        }
    }
}
