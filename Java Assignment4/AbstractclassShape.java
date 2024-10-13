abstract class Shape {
    abstract double calculateArea();
    final void getType() {
        System.out.println("Shape type: " + this.getClass().getSimpleName());
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return width * height;
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(6, 12);
        Shape circle = new Circle(8);
        rectangle.getType();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        circle.getType();
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
