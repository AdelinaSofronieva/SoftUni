package J09IteratorsAndComparators.Exercise.P06StrategyPattern;

import java.util.Comparator;

public class ComparatorByName implements Comparator <Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        if (firstPerson.getName().length() == secondPerson.getName().length()) {
            char firstLetterOfFirstPerson = firstPerson.getName().toLowerCase().charAt(0);
            char firstLetterOfSecondPerson = secondPerson.getName().toLowerCase().charAt(0);
            return Character.compare(firstLetterOfFirstPerson, firstLetterOfSecondPerson);
        }
        return Integer.compare(firstPerson.getName().length(), secondPerson.getName().length());
    }
}
