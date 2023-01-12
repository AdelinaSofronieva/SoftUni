package J04InterfacesAndAbstraction.Lab.carShop;

public class Audi extends CarImpl implements Rentable{
    private Integer minRentDay;
    private double pricePerDay;

    public Audi(String model, String color, Integer horsepower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsepower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("%s%nMinimum rental period of %d days. Price per day %f",
                super.toString(), minRentDay, pricePerDay);
    }
}
