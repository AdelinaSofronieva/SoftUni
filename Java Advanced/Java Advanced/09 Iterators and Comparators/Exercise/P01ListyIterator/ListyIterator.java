package J09IteratorsAndComparators.Exercise.P01ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String>{
    private List<String> valuesList;
    private int currentIndex;

    public ListyIterator(String... valuesList) {
        this.valuesList = List.of(valuesList);
        currentIndex = 0;
    }

    public boolean hasNext() {
        return currentIndex < valuesList.size() - 1;
    }

    public boolean move() {
        if (hasNext()) {
            currentIndex++;
            return true;
        }
        return false;
    }

    public void print() {
        if (valuesList.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(valuesList.get(currentIndex));
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int internalIndex;
            @Override
            public boolean hasNext() {
                return internalIndex < valuesList.size();
            }

            @Override
            public String next() {
                    String element = valuesList.get(internalIndex);
                    internalIndex++;
                return element;
            }
        };
    }

    public void printAll() {
        String result = String.join(" ", valuesList);
        System.out.printf("%s%n", result);
    }

    public List<String> getValuesList() {
        return valuesList;
    }

    public void setValuesList(List<String> valuesList) {
        this.valuesList = valuesList;
    }
}
