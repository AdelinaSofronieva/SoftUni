package J06DefiningClasses.Exercise.P09CatLady;

public class Cymric {
    private String name;
    private double furLength;

    public Cymric(String name, double furLength) {
        this.name = name;
        this.furLength = furLength;
    }

    public String toString() {
        return String.format("Cymric %s %.2f", name, furLength);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }
}
