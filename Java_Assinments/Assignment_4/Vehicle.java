// Question 3:
    // Create a superclass Vehicle with:
        // A String instance variable as brand.
        // Create a protected instance variable fuelType of type String.
        // A constructor that initializes the brand and the fuelType.
        // Implement a method fuelTypeInfo() that prints the fuelType of the vehicle.
        // A method startEngine() that prints: Starting the vehicle's engine....

import java.util.*;

class vehicle
{
	String brand;
	protected String fuelType;
	
	vehicle(String brand, String fuelType)
	{
		this.brand = brand;
		this.fuelType = fuelType;
	}
	void fuelTypeInfo()
	{
				System.out.println("Fuel type: " +fuelType);

	}
	void startEngine()
	{
				System.out.println("Starting the vehicle's engine....");
		
	}
	
}

    
    // Then create a subclass Car that inherits from Vehicle with:
        // An additional int instance variable yearOfLaunch.
        // A constructor that initializes brand, fuelType and yearOfLaunch using the super keyword.
        // Override the startEngine() method to print: Starting the car's engine...
        // Add a method playMusic() that prints Playing music in the car...

class car extends vehicle
{
	int yearOfLaunch;
	
	car (String brand, String fuelType, int yearOfLaunch)
	{
		super (brand, fuelType);
		
		this.yearOfLaunch = yearOfLaunch;
		
	}
	
	void startEngine()
	{
				System.out.println("\nStarting the car's engine....");
				System.out.println("\ncar's info... \nBrand name: "+ brand +"\n" + "Fuel type: "
										+fuelType+ "\nYear of Launch: "+ yearOfLaunch+"\n\n");
				
		
	}
	void playMusic()
	{
				System.out.println("\nPlaying music in the car...");
		
	}
	
}    
    
    // Subclass Motorcycle (inherits from Vehicle):
        // Create a constructor that initializes the fuelType of the Motorcycle.
        // Override the startEngine() method to print Starting the motorcycle's engine...
        
		
class motorcycle extends vehicle
{
	
	motorcycle (String brand, String fuelType)
	{
		super (brand, fuelType);
		
	}
	
	void startEngine()
	{
				System.out.println("Starting the motorcycle's engine...");
				System.out.println("\ncar's info... \nBrand name: "+ brand +"\n" + "Fuel type: "
										+fuelType+ "\n\n");
	}
		
}

// In the main() method:
        // Declare a reference variable of type Vehicle and assign the reference of a Car object.
        // Call the startEngine() method using the Vehicle reference and observe that the method which  is executed.
        // Call the fuelTypeInfo() method using the Vehicle reference to display the fuelType.
        // Try to call the playMusic() method using the Vehicle reference. This should result in a compilation error (as Vehicle doesn’t define playMusic()).
        // Use casting to convert the Vehicle reference back to a Car object and then successfully call the playMusic() method.
    
	
    // Demonstrate Polymorphism with Both Subclasses:
        // Create a Vehicle reference for both a Car and a Motorcycle.
        // Call the startEngine() method using both references to demonstrate polymorphism.
        // Show that the correct startEngine() method is invoked for each subclass (Car and Motorcycle), 
		// even though the reference is of type Vehicle.
    
    // Polymorphism and Method Resolution:
        // Show that method overriding (for startEngine()) works through the superclass reference, but 
		// subclass-specific methods (like playMusic()) require casting back to the subclass type.

class test3
{
	public static void main (String args[])
	{
		vehicle obj = new vehicle("a","b");
		obj.startEngine();
		vehicle obj1 = new car("Toyota","petrol", 2020);
		obj1.startEngine();
		obj1.fuelTypeInfo();
		
		// obj1.playMusic(); //  error: cannot find symbol
		car obj2 = (car) obj1;
		obj2.playMusic();
		
		vehicle obj3 = new car("kia","diesel", 2020);
		vehicle obj4 = new motorcycle("honda","petrol");
		System.out.println("Demonstrating Polymorphism with Both Subclasses object");		
		System.out.println("calling the startEngine() method using car's object ");		
		obj3.startEngine();
		System.out.println("calling the startEngine() method using motorcycle's object ");		
		obj4.startEngine();
		
		
		
		
		
	}
	
	
	
}