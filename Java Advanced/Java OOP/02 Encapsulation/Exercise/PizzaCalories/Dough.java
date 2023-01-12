package J02Encapsulation.Exercise.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String floorType, String bakingTechnique, double weight) {
        setFlourType(floorType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double typeModifier = 0;
        double bakingTechniqueModifier = 0;

        if (flourType.equals("White")) {
            typeModifier = 1.5;
        } else if (flourType.equals("Wholegrain")) {
            typeModifier = 1.0;
        }

        if (bakingTechnique.equals("Crispy")) {
            bakingTechniqueModifier = 0.9;
        } else if (bakingTechnique.equals("Chewy")) {
            bakingTechniqueModifier = 1.1;
        } else if (bakingTechnique.equals("Homemade")) {
            bakingTechniqueModifier = 1.0;
        }

        return 2 * weight * typeModifier * bakingTechniqueModifier;
    }
}
