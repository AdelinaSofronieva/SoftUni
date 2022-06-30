package F08ObjectsAndClasses.Exercise.P06VehicleCatalogue;

public class VehicleCatalogue {
    //{typeOfVehicle} {model} {color} {horsepower}
    String typeOfVehicle;
    String model;
    String color;
    int horsepower;

    public VehicleCatalogue(String typeOfVehicle, String model, String color, int horsepower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }


    public String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
