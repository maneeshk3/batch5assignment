// Question 1:
    // Write a Java program where you create a superclass Animal with a method makeSound(). 
    // Create two subclasses, Dog and Cat, that inherit from Animal and override the makeSound() method to print Woof and Meow respectively. 
    
    // In the main() method:
        // Declare a Animal reference and assign it objects of both Dog and Cat.
        // Call the makeSound() method using the Animal reference for both instances and observe how dynamic method dispatch works.

import java.util.*;
class animal{
	void makesound(){
		System.out.println("This is animals sound");
	}
	
	 
}

class dog extends animal{
	void makesound(){
		System.out.println("woof woof woof woof woof");
	}
}

class cat extends animal{
	void makesound(){
		System.out.println("Meow Meow Meow");
	}
}

