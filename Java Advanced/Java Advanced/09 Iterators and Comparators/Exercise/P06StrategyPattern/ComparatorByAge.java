package J09IteratorsAndComparators.Exercise.P06StrategyPattern;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return Integer.compare(firstPerson.getAge(),secondPerson.getAge());
    }
}
