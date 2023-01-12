package J03Inheritance.Exercise.zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal animal = new Animal("animal");

        Reptile reptile = new Reptile("Reptile");
        Lizard lizard = new Lizard("Lizard");
        Snake snake = new Snake("Snake");

        Mammal mammal = new Mammal("Mammal");
        Gorilla gorilla = new Gorilla("Gorilla");
        Bear bear = new Bear("Bear Pooh");

        System.out.println();
    }
}
