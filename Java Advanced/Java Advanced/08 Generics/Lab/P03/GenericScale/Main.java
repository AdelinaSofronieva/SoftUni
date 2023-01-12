package J08Generics.Lab.P03.GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<String> stringScale = new Scale<>("a", "z");
        System.out.println(stringScale.getHeavier());

        Scale<Integer> intScale = new Scale<>(3, 60);
        System.out.println(intScale.getHeavier());

        Scale<Integer> intScale2 = new Scale<>(20, 20);
        System.out.println(intScale2.getHeavier());
    }
}
