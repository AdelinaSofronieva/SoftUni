package J05Polymorphism.Lab.shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * height + 2 * width;
    }

    @Override
    public Double calculateArea() {
        return height * width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
