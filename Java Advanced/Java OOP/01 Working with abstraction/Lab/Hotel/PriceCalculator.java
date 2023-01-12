package J01WorkingWithAbstraction.Lab.Hotel;

public class PriceCalculator {
    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {

        double totalPrice = pricePerDay * numberOfDays;
        totalPrice *= season.getPower();
        totalPrice = totalPrice - (totalPrice * discountType.getDiscount() / 100);

        return totalPrice;
    }
}
