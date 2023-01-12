package J04InterfacesAndAbstraction.Lab.carShop;

public interface Car{
    Integer TIRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

}
