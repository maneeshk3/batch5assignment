import java.util.Scanner;
public class Person {
    // Instance variables
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method to set person info
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to check if the person is an adult
    public boolean isAdult() {
        return this.age >= 18;
    }

    public static void main(String[] args) {
        // Creating objects using both constructors
        Person person1 = new Person(); // Default constructor
        Person person2 = new Person("Alice", 30, "123 Main St"); // Parameterized constructor

        // Displaying information
        person1.displayInfo();
        person2.displayInfo();

        // Setting new info for person1
        person1.setInfo("Bob", 25, "456 Elm St");
        person1.displayInfo();

        // Checking if person2 is an adult
        System.out.println("Is person2 an adult? " + person2.isAdult());
    }
}
