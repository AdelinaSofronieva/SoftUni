package J04InterfacesAndAbstraction.Lab.carShop;
public class Seat extends CarImpl implements Sellable{
    private Double price;

    public Seat(String model, String color, Integer horsepower, String countryProduced, Double price) {
        super(model, color, horsepower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s sells for %f", super.toString(), getModel(), price);
    }
}
