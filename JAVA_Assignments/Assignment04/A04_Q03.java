// Question 3:
    // Create a superclass Vehicle with:
        // A String instance variable as brand.
        // Create a protected instance variable fuelType of type String.
        // A constructor that initializes the brand and the fuelType.
        // Implement a method fuelTypeInfo() that prints the fuelType of the vehicle.
        // A method startEngine() that prints: Starting the vehicle's engine....
    
    // Then create a subclass Car that inherits from Vehicle with:
        // An additional int instance variable yearOfLaunch.
        // A constructor that initializes brand, fuelType and yearOfLaunch using the super keyword.
        // Override the startEngine() method to print: Starting the car's engine...
        // Add a method playMusic() that prints Playing music in the car...
        
    // In the main() method:
        // Declare a reference variable of type Vehicle and assign the reference of a Car object.
        // Call the startEngine() method using the Vehicle reference and observe that the method which  is executed.
        // Call the fuelTypeInfo() method using the Vehicle reference to display the fuelType.
        // Try to call the playMusic() method using the Vehicle reference. This should result in a compilation error (as Vehicle doesn’t define playMusic()).
        // Use casting to convert the Vehicle reference back to a Car object and then successfully call the playMusic() method.
    
    // Subclass Motorcycle (inherits from Vehicle):
        // Create a constructor that initializes the fuelType of the Motorcycle.
        // Override the startEngine() method to print Starting the motorcycle's engine...
        
    // Demonstrate Polymorphism with Both Subclasses:
        // Create a Vehicle reference for both a Car and a Motorcycle.
        // Call the startEngine() method using both references to demonstrate polymorphism.
        // Show that the correct startEngine() method is invoked for each subclass (Car and Motorcycle), even though the reference is of type Vehicle.
    
    // Polymorphism and Method Resolution:
        // Show that method overriding (for startEngine()) works through the superclass reference, but subclass-specific methods (like playMusic()) require casting back to the subclass type.
import java.util.*;
class vehicle{
	String brand;
	protected String fueltype;
	public vehicle(String brand, String fueltype)
	{
		this.brand =brand;
		this.fueltype = fueltype;
		
		
	}
	
	void fuelTypeInfo()
	{
		System.out.println("fueltype is: " + fueltype);
	}
	
	void startEngine()
	{
		System.out.println("Starting the vehicle's engine....");
	}
	
}

class car extends vehicle{
int yearoflaunch;	
 public car(String brand, String fueltype, int yearoflaunch)
 {
	 super(brand, fueltype);
	 // super.brand = brand;
	 // super.fueltype = fueltype;
	 this.yearoflaunch = yearoflaunch;
	 System.out.println(brand + fueltype +yearoflaunch);
 }
 
 void startEngine()
 {
	 System.out.println("Starting the car's engine...");
 }
 
 void playMusic()
 {
	 System.out.println("Playing music in the car...");
 }
 
}
class motorcycle extends vehicle
{
	public motorcycle(String brand, String fueltype)
	{
		super(brand, fueltype);
		
	}
	void startEngine()
 {
	 System.out.println("Starting the motorcycle's engine...");
 }
	
}

