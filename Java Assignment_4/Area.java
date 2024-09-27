// take Shape as Abstract Class in this class define abstract method calculateArea() and add final method as getType()
abstract class Shape {
    abstract float calculateArea();

    // this is a Final method that cannot be overridden in subclass
    public final String getType() {
        return this.getClass().getSimpleName();
    }
}

// take Rectangle as subclass
class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    //override the Abstract method calculateArea()
    float calculateArea() {
        return width * height;
    }
}

// take Circle as subclass
class Circle extends Shape {
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    //override the Abstract Method calculateArea
    float calculateArea() {
        return (float) (PI * radius * radius);
    }
}

// main class implementation
public class Area {
    public static void main(String[] args) {
        // Create a Rectangle
        Shape rectangle = new Rectangle(1,5);
        
        // Create a Circle
        Shape circle = new Circle(3);

        // usage of getType() and calculateArea() for both Rectangle and circle shapes
        shapeType(rectangle);
        shapeType(circle);
    }

    // Method to demonstrate getType() and calculateArea() for a shape
    private static void shapeType(Shape shape) {
        System.out.println("Shape Type: " + shape.getType());
        System.out.println("Area: " + shape.calculateArea());
    }
}