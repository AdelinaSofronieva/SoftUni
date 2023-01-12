package J04InterfacesAndAbstraction.Lab.carShop;

public interface Rentable extends Car{
    Integer getMinRentDay();
    Double getPricePerDay();

}
