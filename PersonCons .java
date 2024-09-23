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

    // Method to set person details
    public void setInfo(String name, int age, String address) {
        this.name = name;       // Using 'this' to refer to the instance variable
        this.age = age;
        this.address = address;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Main method to create and display Person objects
    public static void main(String[] args) {
        // Create Person object using the default constructor
        Person person1 = new Person();
        System.out.println("Person 1 Details:");
        person1.displayInfo();
        System.out.println();

        // Create Person object using the parameterized constructor
        Person person2 = new Person("John Doe", 30, "123 Main Street");
        System.out.println("Person 2 Details:");
        person2.displayInfo();
        System.out.println();

        // Update person1 details using setInfo method
        person1.setInfo("Alice Smith", 25, "456 Elm Street");
        System.out.println("Updated Person 1 Details:");
        person1.displayInfo();
    }
}
