package J05Polymorphism.Exercise.wildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eatFood(Food food) {
        setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]", getClass().getSimpleName(), getAnimalName(), getBreed(), df.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
