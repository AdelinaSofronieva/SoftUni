package J05Polymorphism.Exercise.wildFarm;

public class Tiger extends Felime{
    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eatFood(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            setFoodEaten(super.getFoodEaten() + food.getQuantity());
        } else {
            //setFoodEaten(this.getFoodEaten());
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
    }
}
