class Vehicle{
	
	 private String brand;
     protected String fuelType;

    
    public Vehicle(String brand, String fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
    }
	
	public void fuelTypeInfo(){
		
	System.out.println("fuel of vehicle " + fuelType);
		
	}
	public void startEngine(){
		
	System.out.println(" Starting the vehicle's engine....");
		
	}}

 class Car extends Vehicle{
	 private int yearoflaunch;
	 
	 Car(String brand, String fuelType,int yearoflaunch){
		 
		 super(brand,fuelType);
		 
		 
		 this.yearoflaunch=yearoflaunch;
		 
	 } 
	 
	
	 @Override
    public void startEngine() {
        System.out.println("Starting the car's engine...");
    }
	 public void playMusic() {
        System.out.println("Playing music in the car...");
    }
}
	 class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String fuelType) {
        super(brand, fuelType); // Specify brand as well
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine...");
    }
}

 





public class CarMade{
	
	public static void main (String[]args){
		
		Vehicle myCar =new Car("Toyota", "Petrol", 2025);
		 myCar.startEngine();  
         myCar.fuelTypeInfo();
		 
		 
		 
		   if(myCar instanceof Car) {
    Car car = (Car) myCar;
    car.playMusic();
}
		 
	    
        Vehicle myMotorcycle = new Motorcycle("Gasoline","hero");

        // Demonstrate polymorphism
        myCar.startEngine();         // Calls Car's startEngine
        myMotorcycle.startEngine();  // Calls Motorcycle's startEngine
	 
		
		
		
	}
}