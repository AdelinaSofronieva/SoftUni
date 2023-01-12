package J06DefiningClasses.Exercise.P09CatLady;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Siamese> siameseCatsList = new HashMap<>();
        Map<String, Cymric> cymricCatsList = new HashMap<>();
        Map<String, StreetExtraordinaire> streetCatsList =new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputData = input.split("\\s+");
            String breed = inputData[0];
            String name = null;

            switch (breed) {
                case "Siamese" :
                    name = inputData[1];
                    double earSize = Double.parseDouble(inputData[2]);
                    Siamese siamese = new Siamese(name, earSize);
                    siameseCatsList.put(name, siamese);
                    break;
                case "Cymric" :
                    name = inputData[1];
                    double furLength = Double.parseDouble(inputData[2]);
                    Cymric cymric = new Cymric(name, furLength);
                    cymricCatsList.put(name, cymric);
                    break;
                case "StreetExtraordinaire" :
                    name = inputData[1];
                    double decibelsOfMeows = Double.parseDouble(inputData[2]);
                    StreetExtraordinaire streetExtraordinaire = new StreetExtraordinaire(name, decibelsOfMeows);
                    streetCatsList.put(name, streetExtraordinaire);
                    break;
            }



            input = scanner.nextLine();
        }

        String searchCat = scanner.nextLine();

        if (siameseCatsList.containsKey(searchCat)) {
            System.out.println(siameseCatsList.get(searchCat));
            //siameseCatsList.values().forEach(System.out::println);
        }

        if (cymricCatsList.containsKey(searchCat)) {
            System.out.println(cymricCatsList.get(searchCat));
            //cymricCatsList.values().forEach(System.out::println);
        }

        if (streetCatsList.containsKey(searchCat)) {
            System.out.println(streetCatsList.get(searchCat));
            //streetCatsList.values().forEach(System.out::println);
        }
    }
}
