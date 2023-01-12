package J04InterfacesAndAbstraction.Exercise.collectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elementsToAdd = scanner.nextLine().split("\\s+");
        int countOfRemovedOperations = Integer.parseInt(scanner.nextLine());

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        performAddOperations(elementsToAdd, addCollection);
        performAddOperations(elementsToAdd, addRemoveCollection);
        performAddOperations(elementsToAdd, myList);

        performRemoveOperations(countOfRemovedOperations, addRemoveCollection);
        performRemoveOperations(countOfRemovedOperations, myList);
    }

    public static void performAddOperations(String[] elementsToAdd, Addable addable) {
        for (int i = 0; i < elementsToAdd.length; i++) {
            System.out.print(addable.add(elementsToAdd[i]) + " ");
        }
        System.out.println();
    }

    public static void performRemoveOperations(int countOfRemovedOperations, AddRemovable addRemovable) {
        for (int i = 1; i <= countOfRemovedOperations; i++) {
            System.out.print(addRemovable.remove() + " ");
        }
        System.out.println();
    }
}
