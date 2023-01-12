package J05Polymorphism.Lab.animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal cat = new Cat("Kotio", "Gourmet gold");
        Animal dog = new Dog("Kira", "Bones");

        System.out.println(cat.explainSelf());
        System.out.println(dog.explainSelf());
    }
}
