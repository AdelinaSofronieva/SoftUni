package J08Generics.Exercise.Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        String fullName = firstLine[0] + " " + firstLine[1];
        String address = firstLine[2];
        String town = firstLine[3];
        Threeuple<String, String, String> firstThreeuple = new Threeuple<>(fullName, address, town);

        String[] secondLine = scanner.nextLine().split("\\s+");
        String name = secondLine[0];
        int litersOfBeer = Integer.parseInt(secondLine[1]);
        String drunkOrNot = secondLine[2];

        Threeuple<String, Integer, String> secondThreeuple = new Threeuple<>(name, litersOfBeer, Threeuple.drunkOrNot(drunkOrNot));

        String[] thirdLine = scanner.nextLine().split("\\s+");
        String personName = thirdLine[0];
        double accountBalance = Double.parseDouble(thirdLine[1]);
        String bankName = thirdLine[2];
        Threeuple<String, Double, String> thirdThreeuple = new Threeuple<>(personName, accountBalance, bankName);

        System.out.println(firstThreeuple);
        System.out.println(secondThreeuple);
        System.out.println(thirdThreeuple);

    }
}
