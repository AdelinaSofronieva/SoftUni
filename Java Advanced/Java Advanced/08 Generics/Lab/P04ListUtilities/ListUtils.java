package J08Generics.Lab.P04ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException();
        }

        return Collections.max(list);
    }

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException();
        }

        return Collections.min(list);
    }


}
