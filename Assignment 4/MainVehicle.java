
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