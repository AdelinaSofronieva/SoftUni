package J05Polymorphism.Lab.shapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(4d, 5d);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

        shape = new Circle(5d);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
    }
}
