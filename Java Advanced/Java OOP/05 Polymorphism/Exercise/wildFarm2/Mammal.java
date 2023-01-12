package J05Polymorphism.Exercise.wildFarm2;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private  String livingRegion;

    public Mammal( String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight);
        this.setLivingRegeon(livingRegion);
    }

    protected final String getLivingRegeon() {
        return livingRegion;
    }

    private void setLivingRegeon(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return this.getClass().getSimpleName() + "[" + this.getAnimalName() +  ", " +  df.format(this.getAnimalWeight())
                + ", " + this.getLivingRegeon() + ", " + (this.getFoodEaten()) + "]";
    }
}