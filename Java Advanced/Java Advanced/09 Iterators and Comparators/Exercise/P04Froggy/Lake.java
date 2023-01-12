package J09IteratorsAndComparators.Exercise.P04Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer>{
    private List<Integer> lake;

    public Lake(Integer... elements) {
        this.lake = List.of(elements);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Froggy();
    }

    public class Froggy implements Iterator<Integer> {
        private int index = 0;
        boolean checkFirstRound = false;
        @Override
        public boolean hasNext() {
            return index < lake.size();
        }

        @Override
        public Integer next() {
            Integer currentElement = lake.get(index);
            index += 2;

            if (index >= lake.size() && !checkFirstRound) {
                index = 1;
                checkFirstRound = true;
            }

            return currentElement;
        }
    }
}
