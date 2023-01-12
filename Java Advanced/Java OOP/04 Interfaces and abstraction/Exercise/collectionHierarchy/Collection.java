package J04InterfacesAndAbstraction.Exercise.collectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    int maxSize;
    List<String> items;

    public Collection() {
        this.maxSize = 0;
        this.items = new ArrayList<>();
    }
}
