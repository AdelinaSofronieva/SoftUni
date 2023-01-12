package J08Generics.Lab.P01JarOfT;

import java.util.ArrayDeque;

public class Jar<T> {
    private String element;
    private ArrayDeque<T> stack;

    public Jar() {
        this.stack = new ArrayDeque<>();
    }

    public void add (T element) {
        this.stack.push(element);
    }

    public T remove(){
        return stack.pop();
    }


}
