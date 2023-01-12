package J07WorkShop.Lab.Stack;

public class Main {
    public static void main(String[] args) {

        CustomStack customStack = new CustomStack();

        System.out.println(customStack.getSize());

        customStack.push(5);
        customStack.push(-1);
        customStack.push(11);

        System.out.println(customStack.getSize());
        customStack.pop();
        System.out.println(customStack.peek());
        customStack.pop();
       // customStack.pop();

        customStack.forEach(System.out::println);
    }
}
