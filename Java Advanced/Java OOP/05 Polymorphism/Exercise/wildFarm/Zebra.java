package J05Polymorphism.Exercise.wildFarm;

public class Zebra extends Mammal{
    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eatFood(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            setFoodEaten(super.getFoodEaten() + food.getQuantity());
        } else {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
    }
}
