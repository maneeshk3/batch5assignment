public class Personn {
    // Private attributes
    private String name;
    private int age;
    private String email;

    // Method to set values for the private attributes
    public void setValues(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Method to print the values of the attributes
    public void printValues() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        Personn person = new Personn();

        // Set values using the setValues method
        person.setValues("Aditya", 30, "satish@example.com");
        person.printValues(); // Print the initial values

        // Attempt to update the name directly
        try {
            person.name = "Satish"; // This will cause a compilation error
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
