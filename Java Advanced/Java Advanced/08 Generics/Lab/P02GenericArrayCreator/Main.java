package J08Generics.Lab.P02GenericArrayCreator;

public class Main {
    public static void main(String[] args) {

        ArrayCreator arrayCreator = new ArrayCreator();
        ArrayCreator.create(String.class, 5, "Bla bla");
        ArrayCreator.create(5, "Bla bla2");

        System.out.println();
    }
}
