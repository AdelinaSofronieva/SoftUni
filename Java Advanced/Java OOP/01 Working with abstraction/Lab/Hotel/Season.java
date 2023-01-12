package J01WorkingWithAbstraction.Lab.Hotel;

public enum Season {
    AUTUMN("Autumn", 1),
    SPRING("Spring", 2),
    WINTER("Winter", 3),
    SUMMER("Summer", 4)
    ;
    private String name;
    private int power;

    Season(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
