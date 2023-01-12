package J08Generics.Exercise.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();

        while (n-- > 0) {
            //String inputLine = scanner.nextLine();
            //Integer inputLine = Integer.parseInt(scanner.nextLine());
            Double inputLine = Double.parseDouble(scanner.nextLine());
            box.add(inputLine);
        }

//        String[] indexes = scanner.nextLine().split("\\s+");
//        int firstIndex = Integer.parseInt(indexes[0]);
//        int secondIndex = Integer.parseInt(indexes[1]);
//
//        box.swap(firstIndex,secondIndex);

       // String valueToCompare = scanner.nextLine();

        Double valueToCompare = Double.parseDouble(scanner.nextLine());
        System.out.println(box.count(valueToCompare));
    }
}
