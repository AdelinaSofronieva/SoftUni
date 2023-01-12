package J07WorkShop.Lab.Stack;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private final int initialCapacity = 4;
    private int[] items;
    private int size;
    private int capacity;

    public CustomStack() {
        this.capacity = initialCapacity;
        this.items = new int[this.capacity];
    }

    public int getSize() {
        return this.size;
    }

    public void push(int element) {
        if (this.size == this.capacity) {
            this.resize();
        }

        this.items[this.size++] = element;

    }

    public int pop(){
        checkEmpty();

        int element = this.items[this.size - 1];
        this.size--;
        return element;
    }

    public int peek() {
        checkEmpty();

        return this.items[this.size - 1];
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i <this.size ; i++) {
            consumer.accept(this.items[i]);
        }
    }

    private void checkEmpty() {
        if (this.size == 0) {
            throw new NoSuchElementException("CustomStack is empty");
        }
    }

    private void resize() {
        this.capacity *=2;

        int[] copyArray = new int[this.capacity];

        for (int i = 0; i < this.items.length; i++) {
            copyArray[i] = this.items[i];
        }

        this.items = copyArray;
    }
}
