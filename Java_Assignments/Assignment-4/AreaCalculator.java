/*Question 2:
    Design a abstract Shape with a abstract method calculateArea().
    Create subclasses Rectangle and Circle using the Shape abstract class, each with its own calculateArea() implementation i.e method override.
    Write a program to compute the areas of both shapes.
    Rectangle should have width and height instance variable and implement calculateArea() to return the area of a rectangle.
    Circle should have a radius instance variable and implement calculateArea() to return the area of a circle.
     Also:
        Add a final method getType() in Shape that prints the shape type and ensure it cannot be overridden in subclasses.
        In the main() method, demonstrate the use of abstract classes, calling getType() and calculateArea() for both Rectangle and Circle.
        HINT : this.getClass().getSimpleName() or this.getClass() method return the name of the current object class.

 */

/*//package java_Assignments.Assignment-4;

// take Shape as Abstract Class in this class define abstract method calculateArea()
abstract class Shape {
    abstract float calculateArea();
}

// create subclass as Rectangle extents superclass Shape  and create own method  CalculateArea() in subclass Rectangle 
class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
    @Override
    float calculateArea() {
        return width * height;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    float calculateArea() {
        return (float) (PI * radius * radius);
    }
}

// main class implementation
public class AreaCalculator {
    public static void main(String[] args) {
        // Create area of a Rectangle
        Rectangle rectangle = new Rectangle(5, 3);
        
        // Create area of a Circle
        Circle circle = new Circle(4);

        // Calculate and display area of rectangle and circle 
        System.out.println("Area of Rectangle is :" + rectangle.calculateArea());
        System.out.println("Area of Circle is : " + circle.calculateArea());
    }
} 


    

*/
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
public class AreaCalculator {
    public static void main(String[] args) {
        // Create a Rectangle
        Shape rectangle = new Rectangle(5, 3);
        
        // Create a Circle
        Shape circle = new Circle(4);

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