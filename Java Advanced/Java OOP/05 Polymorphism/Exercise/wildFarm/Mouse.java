package J05Polymorphism.Exercise.wildFarm;

public class Mouse extends Mammal{
    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eatFood(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            setFoodEaten(super.getFoodEaten() + food.getQuantity());
        } else {
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
    }

}
