package J04InterfacesAndAbstraction.Lab.sayHello;

public class Chinese extends BasePerson{

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
