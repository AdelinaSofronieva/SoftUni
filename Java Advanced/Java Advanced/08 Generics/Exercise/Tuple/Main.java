package J08Generics.Exercise.Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        String fullName = firstLine[0] + " " + firstLine[1];
        String city = firstLine[2];
        Tuple<String, String> firstTuple = new Tuple<>(fullName, city);

        String[] secondLine = scanner.nextLine().split("\\s+");
        String name = secondLine[0];
        Integer litersOfBeer = Integer.parseInt(secondLine[1]);
        Tuple<String, Integer> secondTuple = new Tuple<>(name, litersOfBeer);

        String[] thirdLine = scanner.nextLine().split("\\s+");
        Integer number = Integer.parseInt(thirdLine[0]);
        Double decimal = Double.parseDouble(thirdLine[1]);
        Tuple<Integer, Double> thirdTuple = new Tuple<>(number, decimal);

        System.out.println(firstTuple);
        System.out.println(secondTuple);
        System.out.println(thirdTuple);
    }
}
