package J01WorkingWithAbstraction.Lab.Hotel;

public enum DiscountType {
    VIP("VIP", 20),
    SECONDVISIT("SecondVisit", 10),
    NONE("VIP", 0);
    private String name;
    private double discount;

    DiscountType(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
