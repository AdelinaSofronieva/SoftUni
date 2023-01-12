package J08Generics.Exercise.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> valuesList;

    public CustomList() {
        this.valuesList = new ArrayList<>();
    }

    public void add (T element) {
        valuesList.add(element);
    }

    public T remove (int index) {
        return valuesList.remove(index);
    }

    public boolean contains (T element) {
        return valuesList.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(valuesList, firstIndex, secondIndex);
    }

    public int countGreaterThan (T element) {
        return (int) valuesList.stream()
                .filter(currentElement -> currentElement.compareTo(element) > 0)
                .count();
    }

    public T getMax() {
        return valuesList.stream()
                .max(Comparable::compareTo)
                .get();
    }

    public T getMin() {
        return valuesList.stream()
                .min((f, s) -> f.compareTo(s))
                .get();
    }

    public int size() {
        return valuesList.size();
    }

    public T get (int index) {
        return valuesList.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T currentElement : valuesList) {
            sb.append(currentElement.toString()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

    public List<T> getValuesList() {
        return valuesList;
    }

    public void setValuesList(List<T> valuesList) {
        this.valuesList = valuesList;
    }
}
