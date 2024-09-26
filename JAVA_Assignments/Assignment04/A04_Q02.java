// Question 2:
    // Design a abstract Shape with a abstract method calculateArea().
    // Create subclasses Rectangle and Circle using the Shape abstract class, each with its own calculateArea() implementation i.e method override.
    // Write a program to compute the areas of both shapes.
    // Rectangle should have width and height instance variable and implement calculateArea() to return the area of a rectangle.
    // Circle should have a radius instance variable and implement calculateArea() to return the area of a circle.
    
    // Also:
        // Add a final method getType() in Shape that prints the shape type and ensure it cannot be overridden in subclasses.
        // In the main() method, demonstrate the use of abstract classes, calling getType() and calculateArea() for both Rectangle and Circle.
        // HINT : this.getClass().getSimpleName() or this.getClass() method return the name of the current object class.

import java.util.*;

abstract class shape{
public abstract double area();
 final void getType()
 {
	 String className = this.getClass().getSimpleName();
	 System.out.println("shape Type is: " +className);
 }


}
class rectangle extends shape {
	
	double	width;
	double height;
	public double area(double h , double d)
{
	this.width = d;
	this.height = h;
	return h * d;
	
}
	
}

class circle extends shape {
	double radius;
	final double pi=3.14;
	public double area(double r)
{
	this.radius= r;
	return  pi*r*r;
	
	
}
}


