public class Person {
    // take instance variables 
    private String name;
    private int age;
    private String address;

    //take default constructor
    public Person() {
        this.name = "Archana";
        this.age = 0;
        this.address = "Bangalore";
    }

    // parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // this method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // this method to set information using parameters
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // this method to check if the person is an adult
    public boolean isAdult() {
        return this.age >= 18;
    }

    // main method implimentation
    public static void main(String[] args) {
        // Creating objects using both constructors
        Person person1 = new Person();  // Using default constructor
        Person person2 = new Person("ThulasiNath", 38, "Tirupathi");  // using parameterized constructor
        
        // displaying the information for both objects
        person1.displayInfo();
        System.out.println();
        person2.displayInfo();
        
        // updating person1  info using setInfo method
        person1.setInfo("M Archana", 35, "Bangalore, City");
        System.out.println("after updating person1 information:");
        person1.displayInfo();
        
        // checking if person1 is an adult
        System.out.println("check person1 is adult or not  " + person1.isAdult());

        // checking if person2 is an adult
        System.out.println("check person2 is adult or not  " + person2.isAdult());
    }
}
