public class Person {
    // Private attributes
    private String name;
    private int age;
    private String email;

    // Method to set the values of the instance variables
    public void setValues(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Method to print the values of the instance variables
    public void printValues() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        Person person = new Person();
        
        // Set values for the person's attributes
        person.setValues("Alice", 30, "alice@example.com");
        
        // Print the person's details
        person.printValues();

        // Attempt to update name directly (this will cause a compile-time error)
        // Uncommenting the following line will result in a compile-time error
        // person.name = "Bob";  // Error: name has private access in Person
    }
}
