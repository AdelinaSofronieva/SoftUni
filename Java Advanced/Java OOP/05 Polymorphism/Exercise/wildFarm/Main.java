package J05Polymorphism.Exercise.wildFarm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Animal> mammalMap = new LinkedHashMap<>();
        Map<String, Food> foodMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            //Mammal mammal =  createAnimal(input, mammalMap);
            Animal animal =  createAnimal(input, mammalMap);
            animal.makeSound();
            //mammalMap.values().forEach(Animal::makeSound);
            Food food = createFood(scanner);

            try {
                animal.eatFood(food);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }

            //System.out.println(mammal);
            input = scanner.nextLine();
        }

        mammalMap.values().forEach(System.out::println);

    }

    private static Food createFood(Scanner scanner) {
        String foodData[] = scanner.nextLine().split("\\s+");
        String foodType = foodData[0];
        Integer quantity = Integer.parseInt(foodData[1]);
        Food food;
        switch (foodType) {
            case "Vegetable" :
                food = new Vegetable(quantity);
                //foodMap.put(foodType, food);
                return food;
            case "Meat" :
                food = new Meat(quantity);
                //foodMap.put(foodType, food);
                return food;
            default:
                throw new IllegalArgumentException("No such food");
        }

    }

    private static Animal createAnimal(String input, Map<String, Animal> mammalMap) {
        String[] animalData = input.split("\\s+");
        String animalType = animalData[0];
        String animalName = animalData[1];
        double animalWeight = Double.parseDouble(animalData[2]);
        String livingRegion = animalData[3];

        Mammal mammal;
        Animal animal;
        if (animalData.length == 4) {
            switch (animalType) {
                case "Mouse":
                    animal = new Mouse(animalType, animalName, animalWeight, livingRegion);
                    mammalMap.put(animalType, animal);
                    return animal;
                case "Zebra":
                    animal = new Zebra(animalType, animalName, animalWeight, livingRegion);
                    mammalMap.put(animalType, animal);
                    return animal;
                case "Tiger":
                    animal = new Tiger(animalType, animalName, animalWeight, livingRegion);
                    mammalMap.put(animalType, animal);
                    return animal;
                default:
                    throw new IllegalArgumentException("No such animal");
            }
           // mammalMap.put(animalType, mammal);
        } else {
            String catBreed = animalData[4];
            animal = new Cat(animalType, animalName, animalWeight, livingRegion, catBreed);
            mammalMap.put(animalType, animal);
            return animal;
        }

    }
}
