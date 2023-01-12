package J06DefiningClasses.Exercise.P04RawData;

import java.util.List;

public class Car {
    private String model;
//    private int engineSpeed;
    private int enginePower;
//    private int cargoWeight;
    private String cargoType;
//    List<Double> tirePressureList;
    private double tirePressure1;
//    private int tire1Age;
    private double tirePressure2;
//    private int tire2Age;
    private double tirePressure3;
//    private int tire3Age;
    private double tirePressure4;
//    private int tire4Age;


    public Car(String model, int enginePower, String cargoType,
               double tirePressure1, double tirePressure2 , double tirePressure3 , double tirePressure4) {
        this.model = model;
        this.enginePower = enginePower;
        this.cargoType = cargoType;
        this.tirePressure1 = tirePressure1;
        this.tirePressure2 = tirePressure2;
        this.tirePressure3 = tirePressure3;
        this.tirePressure4 = tirePressure4;

    }

    public static void carIsFlamable(List<Car> carsList){
        carsList.stream()
                .filter(car -> car.getCargoType().equals("flamable"))
                .filter(car -> car.getEnginePower() > 250)
                .forEach(car -> System.out.printf("%s%n", car.getModel()));
    }

    public static void carIsFragile(List<Car> carsList){
        carsList.stream()
                .filter(car -> car.getCargoType().equals("fragile"))
                .filter(car -> (car.getTirePressure1() < 1) || (car.getTirePressure2() < 1) ||
                        (car.getTirePressure3() < 1) || (car.getTirePressure4() < 1))
                .forEach(car -> System.out.printf("%s%n", car.getModel()));
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public double getTirePressure1() {
        return tirePressure1;
    }

    public void setTirePressure1(double tirePressure1) {
        this.tirePressure1 = tirePressure1;
    }

    public double getTirePressure2() {
        return tirePressure2;
    }

    public void setTirePressure2(double tirePressure2) {
        this.tirePressure2 = tirePressure2;
    }

    public double getTirePressure3() {
        return tirePressure3;
    }

    public void setTirePressure3(double tirePressure3) {
        this.tirePressure3 = tirePressure3;
    }

    public double getTirePressure4() {
        return tirePressure4;
    }

    public void setTirePressure4(double tirePressure4) {
        this.tirePressure4 = tirePressure4;
    }
}
