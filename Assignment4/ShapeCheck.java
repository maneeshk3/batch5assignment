/*
Question 2:
    Design a abstract Shape with a abstract method calculateArea().
    Create subclasses Rectangle and Circle using the Shpae abstract class, each with its own calculateArea() implementation i.e method override.
    Write a program to compute the areas of both shapes.
    Rectangle should have width and height instance variable and implement calculateArea() to return the area of a rectangle.
    Circle should have a radius instance variable and implement calculateArea() to return the area of a circle.
    
    Also:
    Add a final method getType() in Shape that prints the shape type and ensure it cannot be overridden in subclasses.
    In the main() method, demonstrate the use of abstract classes, calling getType() and calculateArea() for both Rectangle and Circle.
    HINT : this.getClass().getSimpleName() or this.getClass() method return the name of the current object class.

*/
abstract class Shape{
    
    public abstract double calculateArea();
    
    public final void getType() {
        System.out.println("Current Class Name : " + this.getClass());
    }
}

class Rectangle extends Shape{
    
    double width = 10.5;
    double height = 12.5;
    
    @Override
    public double calculateArea(){
        return width*height;
    }
}

class Circle extends Shape{
    
    double pi = 3.14;
    double radius = 10.5;
    
    @Override
    public double calculateArea(){
        return pi*radius*radius;
    }
}

public class ShapeCheck{
    
    public static void main(String args[]){
        Rectangle rectanglearea = new Rectangle();
        System.out.println(rectanglearea.calculateArea());
        rectanglearea.getType();
        System.out.println("-------------------------------");
        
        Circle circlearea = new Circle();
        System.out.println(circlearea.calculateArea());
        circlearea.getType();
        System.out.println("-------------------------------");
    }
    
}