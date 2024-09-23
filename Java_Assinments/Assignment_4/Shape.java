// Question 2:
    // Design a abstract Shape with a abstract method calculateArea().
    // Create subclasses Rectangle and Circle using the Shpae abstract class, each with its own calculateArea() implementation i.e method override.
    // Write a program to compute the areas of both shapes.
    // Rectangle should have width and height instance variable and implement calculateArea() to return the area of a 
	// rectangle.
    // Circle should have a radius instance variable and implement calculateArea() to return the area of a circle.
    
    // Also:
        // Add a final method getType() in Shape that prints the shape type and ensure it cannot be overridden in subclasses.
        // In the main() method, demonstrate the use of abstract classes, calling getType() and calculateArea() for 
		// both Rectangle and Circle.
        // HINT : this.getClass().getSimpleName() or this.getClass() method return the name of the current object class.


import java.util.*;

abstract class Shape
{
	public abstract double calculateArea();
	
	final void getType()
	{
	System.out.println("shape Type is: " +this.getClass().getSimpleName() );	
		
	}
	
}

class rectangle extends shape
{
	double height, width;
	rectangle(double height, double width)
	{
		this.width = width;
		this.height = height;	
	}
	public double calculateArea()
	{
		return height*width;
	}
	
	
}

class circle extends shape
{
	final double pi = 3.14;
	double radius;
	circle(double radius)
	{
		this.radius = radius;
	}
	public double calculateArea()
	{
			return pi*radius*radius;
	}
	
	
}

class test2
{
	public static void main (String args[])
	{
		rectangle obj1 = new rectangle(3,6);
		circle obj2 = new circle(4.5);
		obj1.getType();
		System.out.println("area is "+obj1.calculateArea());
		System.out.println(" ");
		obj2.getType();
		System.out.println("area is "+ obj2.calculateArea());

		
		
	}
	
	
	
}