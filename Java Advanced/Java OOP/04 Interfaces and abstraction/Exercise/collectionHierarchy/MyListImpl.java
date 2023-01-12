package J04InterfacesAndAbstraction.Exercise.collectionHierarchy;

public class MyListImpl extends Collection implements MyList{
    @Override
    public String remove() {
        return items.remove(0);
    }

    @Override
    public int add(String element) {
        items.add(element);
        return 0;
    }

    @Override
    public int getUsed() {
        return items.size();
    }
}
