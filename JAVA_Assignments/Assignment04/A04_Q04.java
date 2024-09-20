// Question 4:
    // Create a superclass Bird with: A method fly() that prints: Bird is flying....
    
    // Create a subclass Eagle that: Overrides the fly() method to print: Eagle is flying high..
    // In the overridden fly() method, use super.fly() to also call the fly() method of the superclass.
    
    // In the main() method: Create an Eagle object and call the fly() method. Ensure both superclass and subclass methods are called.
import java.util.*;

class bird
{
	void fly()
	{
		System.out.println("Bird is flying....");
	}
}

class eagle extends bird{
	void fly()
	{
		
		System.out.println("eagle is flying high....");
		
		super.fly();
	}
	
}
class main1 {
	public static void main(String args[])
	{
		eagle obj = new eagle();
		obj.fly();
		
	}
	
}