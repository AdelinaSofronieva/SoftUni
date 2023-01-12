package J04InterfacesAndAbstraction.Lab.sayHello;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Bulgarian bulgarian = new Bulgarian("Peter");
        persons.add(bulgarian);
        persons.add(new European("Peter"));
        persons.add(new Chinese("Peter"));

        for (Person person : persons) {
            print(person);
        }
    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }

}
