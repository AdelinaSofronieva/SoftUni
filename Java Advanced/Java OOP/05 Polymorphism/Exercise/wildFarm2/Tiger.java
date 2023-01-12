package J05Polymorphism.Exercise.wildFarm2;

public class Tiger extends Felime {

    public Tiger(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");

    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")){
            throw new IllegalArgumentException((this.getClass().getSimpleName() + "s are not eating that type of food!"));
        }else {
            super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
        }
    }
}