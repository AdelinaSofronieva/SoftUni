package J02Encapsulation.Lab.Person;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();
        Team team = new Team("Black Eagles");

        for (int i = 0; i < numberOfPeople; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            Person personToAdd = new Person(firstName, lastName, age, salary);
            //people.add(personToAdd);

            team.addPlayer(personToAdd);
        }

        //Collections.sort(people, Comparator.comparing(J02Encapsulation.Lab.Person::getFirstName).thenComparingInt(J02Encapsulation.Lab.Person::getAge));

        //double bonus = Double.parseDouble(scanner.nextLine());

//        for (J02Encapsulation.Lab.Person J03Inheritance.Exercise.J04InterfacesAndAbstraction.Exercise.person : people) {
//            J03Inheritance.Exercise.J04InterfacesAndAbstraction.Exercise.person.increaseSalary(bonus);
//            System.out.println(J03Inheritance.Exercise.J04InterfacesAndAbstraction.Exercise.person.toString());
//        }

//        System.out.println(team.toString());
        System.out.printf("First team have %d players%n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players", team.getReserveTeam().size());
    }
}
