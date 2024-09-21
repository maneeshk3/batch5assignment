/*Question 3:
    Create a superclass Vehicle with:
        A String instance variable as brand.
        Create a protected instance variable fuelType of type String.
        A constructor that initializes the brand and the fuelType.
        Implement a method fuelTypeInfo() that prints the fuelType of the vehicle.
        A method startEngine() that prints: Starting the vehicle's engine....
    
    Then create a subclass Car that inherits from Vehicle with:
        An additional int instance variable yearOfLaunch.
        A constructor that initializes brand, fuelType and yearOfLaunch using the super keyword.
        Override the startEngine() method to print: Starting the car's engine...
        Add a method playMusic() that prints Playing music in the car...
        
    In the main() method:
        Declare a reference variable of type Vehicle and assign the reference of a Car object.
        Call the startEngine() method using the Vehicle reference and observe that the method which  is executed.
        Call the fuelTypeInfo() method using the Vehicle reference to display the fuelType.
        Try to call the playMusic() method using the Vehicle reference. This should result in a compilation error (as Vehicle doesn’t define playMusic()).
        Use casting to convert the Vehicle reference back to a Car object and then successfully call the playMusic() method.
    
    Subclass Motorcycle (inherits from Vehicle):
        Create a constructor that initializes the fuelType of the Motorcycle.
        Override the startEngine() method to print Starting the motorcycle's engine...
        
    Demonstrate Polymorphism with Both Subclasses:
        Create a Vehicle reference for both a Car and a Motorcycle.
        Call the startEngine() method using both references to demonstrate polymorphism.
        Show that the correct startEngine() method is invoked for each subclass (Car and Motorcycle), even though the reference is of type Vehicle.
    
    Polymorphism and Method Resolution:
        Show that method overriding (for startEngine()) works through the superclass reference, but subclass-specific methods (like playMusic()) require casting back to the subclass type.
 */

//take  Superclass as Vehicle
class Vehicle {
    @SuppressWarnings("unused")
    private String brand;
    protected String fuelType;

    public Vehicle(String brand, String fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public void fuelTypeInfo() {
        System.out.println("Fuel type: " + fuelType);
    }

    public void startEngine() {
        System.out.println("Starting the vehicle's engine...");
    }
}

// Subclass Car
class Car extends Vehicle {
    @SuppressWarnings("unused")
    private int yearOfLaunch;

    public Car(String brand, String fuelType, int yearOfLaunch) {
        super(brand, fuelType);
        this.yearOfLaunch = yearOfLaunch;
    }

    //Override the method startEngine() and playMusic()
    public void startEngine() {
        System.out.println("Starting the car's engine...");
    }

    public void playMusic() {
        System.out.println("Playing music in the car...");
    }
}

// take Subclass as Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String fuelType) {
        super(brand, fuelType);
    }

    //Override the method startEngine
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine...");
    }
}

// main class implementation
public class MainVehicle {
    public static void main(String[] args) {
        // declare a Vehicle class reference and assign it a Car object
        Vehicle vehicleCar = new Car("Tata", "diesal", 2024);

        // Call startEngine() method using the Vehicle reference
        System.out.println("calling startEngine() on Car through Vehicle reference:");
        vehicleCar.startEngine();

        // Call fuelTypeInfo() method using the Vehicle reference
        System.out.println("\ncalling fuelTypeInfo() from Car ");
        vehicleCar.fuelTypeInfo();

        // Attempt to call playMusic() method using the Vehicle reference, This line would cause a compilation error
         //vehicleCar.playMusic(); uncomment this if u see the error

        // Use casting to call playMusic() method
        System.out.println("\ncalling playMusic() after casting to Car ");
        ((Car) vehicleCar).playMusic();

        // Demonstrate polymorphism with both subclasses
        Vehicle vehicleMotorcycle = new Motorcycle("Harley-Davidson", "Gasoline");

        System.out.println("demonstrate polymorphism:\n");
        System.out.println("call startEngine() from  Car");
        vehicleCar.startEngine();
        System.out.println("call startEngine() from Motorcycle:");
        vehicleMotorcycle.startEngine();
    }
}