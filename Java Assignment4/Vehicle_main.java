class Vehicle {
    String brand;
    protected String fuelType;

    public Vehicle(String brand, String fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public void fuelTypeInfo() {
        System.out.println("Fuel Type: " + fuelType);
    }

    public void startEngine() {
        System.out.println("Starting the vehicle's engine....");
    }
}

// Subclass Car
class Car extends Vehicle {
    int yearOfLaunch;

    public Car(String brand, String fuelType, int yearOfLaunch) {
        super(brand, fuelType);
        this.yearOfLaunch = yearOfLaunch;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine...");
    }

    public void playMusic() {
        System.out.println("Playing music in the car...");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand, "Petrol");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine...");
    }
}

public class Vehicle_main {
    public static void main(String[] args) {
        // Declare Vehicle reference and assign Car object
        Vehicle vehicle = new Car("Toyato", "Diesel", 2015);
        vehicle.startEngine(); // Output: Starting the car's engine...
        vehicle.fuelTypeInfo(); // Output: Fuel Type: Diesel

        // Try to call playMusic() using Vehicle reference (Compilation Error)
        // vehicle.playMusic(); // Error: Cannot resolve method 'playMusic()'

        // Casting to call playMusic()
        Car car = (Car) vehicle;
        car.playMusic(); // Output: Playing music in the car...

        // Demonstrate Polymorphism
        Vehicle carRef = new Car("Hyndai", "Petrol", 2010);
        carRef.startEngine(); // Output: Starting the car's engine...

        Vehicle motorcycleRef = new Motorcycle("Yamaha");
        motorcycleRef.startEngine(); // Output: Starting the motorcycle's engine...
    }
}