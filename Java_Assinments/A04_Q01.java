// Question 1:
    // Write a Java program where you create a superclass Animal with a method makeSound(). 
    // Create two subclasses, Dog and Cat, that inherit from Animal and override the makeSound() method 
	// to print Woof and Meow respectively. 
    
    // In the main() method:
        // Declare a Animal reference and assign it objects of both Dog and Cat.
        // Call the makeSound() method using the Animal reference for both instances 
		// and observe how dynamic method dispatch works.
import java.util.*;

class animal
{
	void makeSound()
	{
		System.out.println("this is superrrrr");
	}
	
}

class dog extends animal
{
	void makeSound()
	{
		System.out.println("woof woof");
	}	
}

class cat extends animal
{
	void makeSound()
	{
		System.out.println("meow meow");
	}
	
}

class test
{
	
	public static void main(String args[])
	{
		animal obj1;
		dog obj2 = new dog();
		cat obj3 = new cat();
		
		obj1 = obj2;
		
		obj1.makeSound();
		
		obj1 = obj3;
		
		obj1.makeSound();
		
		
		
	}
	
}