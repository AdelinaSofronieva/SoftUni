package J09IteratorsAndComparators.Exercise.P05ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> peopleList = new ArrayList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            String town = data[2];

            Person person = new Person(name, age, town);
            peopleList.add(person);

            input = scanner.nextLine();
        }

        int indexToMatch = Integer.parseInt(scanner.nextLine());
        int samePeople = 0;
        int differentPeople = 0;

        Person matchPerson = peopleList.get(indexToMatch - 1);
        //peopleList.remove(indexToMatch - 1);

        for (Person person : peopleList) {
            if (person.compareTo(matchPerson) == 0) {
                samePeople++;
            } else {
                differentPeople++;
            }
        }

        if (samePeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", samePeople, differentPeople, peopleList.size());
        }

    }
}
