package J08Generics.Lab.P04ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ListUtils listUtils = new ListUtils();
        List<Integer> intList = new ArrayList<>();
        Collections.addAll(intList, 3, -5, 60, 30, 120, -60, 0);

        System.out.println(ListUtils.getMax(intList));
        System.out.println(ListUtils.getMin(intList));
    }
}
