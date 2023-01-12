package J05Polymorphism.Exercise.wildFarm2;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalWeight, livingRegion);
        this.setBreed(breed);
    }

    protected final String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return this.getClass().getSimpleName() + "[" + this.getAnimalName() + ", " + this.getBreed() + ", " +  df.format(this.getAnimalWeight())
                + ", " + this.getLivingRegeon() + ", " + (this.getFoodEaten()) + "]";
    }
}