package J05Polymorphism.Exercise.wildFarm2;

public abstract class Animal {
    private String animalName;
    private Double animalWeight;
    private int foodEaten;

    public Animal( String animalName, Double animalWeight) {
        this.setAnimalName(animalName);
        this.setAnimalWeight(animalWeight);
        this.setFoodEaten(foodEaten);
    }

    protected final String getAnimalName() {
        return animalName;
    }

    private void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    protected final Double getAnimalWeight() {
        return animalWeight;
    }

    private void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    protected final Integer getFoodEaten() {
        return foodEaten;
    }

    void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();
    public abstract void eat(Food food);
}