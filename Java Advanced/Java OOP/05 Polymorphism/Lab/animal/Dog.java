package J05Polymorphism.Lab.animal;

public class Dog extends Animal{


    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nDJAAF", super.getName(), super.getFavouriteFood());
    }
}
