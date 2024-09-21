
abstract class Shape {
    // Abstract method to be implemented by subclasses
    abstract double calculateArea();

    // Final method to get the type of shape
    public final void getType() {
        System.out.println("Shape Type: " + this.getClass().getSimpleName());
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor to initialize width and height
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

    // Implement the calculateArea method for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        // Create instances of Rectangle and Circle
        Shape rect = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        // Call getType() and calculateArea() for Rectangle
        rect.getType();
        System.out.println("Area of Rectangle: " + rect.calculateArea());

        // Call getType() and calculateArea() for Circle
        circle.getType();
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
