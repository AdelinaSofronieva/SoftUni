package J06DefiningClasses.Exercise.P09CatLady;

public class StreetExtraordinaire {
    private String name;
    private double decibelsOfMeows;

    public StreetExtraordinaire(String name, double decibelsOfMeows) {
        this.name = name;
        this.decibelsOfMeows = decibelsOfMeows;
    }

    public String toString() {
        return String.format("StreetExtraordinaire %s %.2f", name, decibelsOfMeows);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDecibelsOfMeows() {
        return decibelsOfMeows;
    }

    public void setDecibelsOfMeows(int decibelsOfMeows) {
        this.decibelsOfMeows = decibelsOfMeows;
    }
}
