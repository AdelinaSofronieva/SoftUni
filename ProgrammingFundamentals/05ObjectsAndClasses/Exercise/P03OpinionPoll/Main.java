package F08ObjectsAndClasses.Exercise.P03OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> peoplesList = new ArrayList<>();

        for (int i = 1; i <= numOfPeople; i++) {
            String[] currentInputLine = scanner.nextLine().split(" ");
            String name = currentInputLine[0];
            int age = Integer.parseInt(currentInputLine[1]);

            Person currentPerson = new Person(name, age);

            if (age > 30) {
                peoplesList.add(currentPerson);
            }
        }
        //peoplesList.sort(Comparator.comparing(Person::getName));
        for (Person person: peoplesList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
