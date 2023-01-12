package J07WorkShop.Lab.SmartArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartArray smartArray = new SmartArray();

        smartArray.add(5);
        smartArray.add(1);
        smartArray.add(7);
        smartArray.add(-1);
        smartArray.add(3);
        smartArray.add(1, 9);

        //System.out.println(smartArray.get(1));


        smartArray.forEach(System.out::println);

    }
}
