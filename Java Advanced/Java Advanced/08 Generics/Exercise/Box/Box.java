package J08Generics.Exercise.Box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box <T extends Comparable<T>> {
    private List<T> boxList;

    public Box() {
        this.boxList = new ArrayList<>();
    }

    public List<T> getBoxList() {
        return boxList;
    }

    public void setBoxList(List<T> boxList) {
        this.boxList = boxList;
    }

    public void add(T element) {
        boxList.add(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(boxList, firstIndex, secondIndex);
    }

    public int count(T valueToCompare) {
        return (int) boxList.stream()
                .filter(currentElement -> currentElement.compareTo(valueToCompare) > 0)
                .count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T currentElement : boxList) {
            sb.append(String.format("%s: %s%n", currentElement.getClass().getName(), currentElement));
        }
        return sb.toString().trim();
    }
}
