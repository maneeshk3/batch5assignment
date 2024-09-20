// Question 4:
    // Create a superclass Bird with: A method fly() that prints: Bird is flying....
    
    // Create a subclass Eagle that: Overrides the fly() method to print: Eagle is flying high..
    // In the overridden fly() method, use super.fly() to also call the fly() method of the superclass.
    
    // In the main() method: Create an Eagle object and call the fly() method. Ensure both superclass and subclass methods are called.

import java.util.*;

class Bird
{
	void fly()
	{
		System.out.println("\nBird is flying....");
	}	
}

class Eagle extends Bird
{
	void fly()
	{
		System.out.println("\nEagle is flying high..");
		super.fly();
	}
}

class test4
{
	
	public static void main(String[] args)
	{
		Eagle obj = new Eagle();
		obj.fly();
		
	} 
	
}