package J05Polymorphism.Exercise.wildFarm2;

public class Zebra extends Mammal {

    public Zebra(String animalName, Double animalWeight, String livingRegion) {
        super(animalName,animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");

    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")){
            throw new IllegalArgumentException((this.getClass().getSimpleName() + "s are not eating that type of food!"));
        }else {
            super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
        }
    }
}