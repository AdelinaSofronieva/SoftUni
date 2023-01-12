package J04InterfacesAndAbstraction.Lab.ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Ferrari ferrari = new Ferrari(name);

        System.out.println(ferrari.toString());
    }
}
