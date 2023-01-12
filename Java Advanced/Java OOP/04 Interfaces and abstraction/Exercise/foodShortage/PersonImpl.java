package J04InterfacesAndAbstraction.Exercise.foodShortage;

public abstract class PersonImpl implements Person, Buyer{
    private String name;
    private int age;
    public static int food = 0;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int getFood() {
        return food;
    }
}
