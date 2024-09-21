class Vehicle{
    String brand;
    protected String fuelType;
    Vehicle(String brand, String fuelType){
        this.brand=brand;
        this.fuelType=fuelType;
    }
    public void fuelTypeInfo() {
        System.out.println("Fuel Type: " + fuelType);
    }
    public void startEngine() {
        System.out.println("Starting the vehicle's engine....");
    }
}
class Car extends Vehicle {
    int yearOfLaunch;
    public Car(String brand, String fuelType, int yearOfLaunch) {
        super(brand, fuelType); 
        this.yearOfLaunch = yearOfLaunch;
    }
    public void startEngine() {
        System.out.println("Starting the car's engine...");
    }
    public void playMusic() {
        System.out.println("Playing music in the car...");
    }
}
class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String fuelType) {
        super(brand, fuelType);
    }
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine...");
    }
}
public class Main {
    public static void main(String[] args) {
        // Vehicle reference pointing to Car object
        Vehicle Obj = new Car("TATA", "Petrol", 1999);
        Obj.startEngine();
        Obj.fuelTypeInfo();
        //Obj.playMusic();
        Car objcar = (Car)Obj;
        objcar.playMusic(); 
        Vehicle myMotorcycle = new Motorcycle("Honda", "Gasoline");
        myMotorcycle.startEngine();
    }
}
