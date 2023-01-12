package J08Generics.Lab.P01JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar jar = new Jar();

        jar.add("a");
        jar.add("b");
        jar.add("c");
        jar.add("bla1");
        jar.add("bla7");

        System.out.println(jar.remove());
        System.out.println(jar.remove());

    }
}
