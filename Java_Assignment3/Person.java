public class Person {
    String name;
    int age;
    String emailAddress;

    // Constructor
    public Person() {}

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Method to print person details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email Address: " + emailAddress);
    }

    public static void main(String[] args) {
        Person person = new Person();

        // Set values using setter methods
        person.setName("Gauri Chachar");
        person.setAge(29);
        person.setEmailAddress("gaurichachar45@gmail.com");

        person.printDetails();

        // Attempt to update name directly (will result in compiler error)
        // person.name = "Jane Doe"; // Uncomment to see compiler error

        // Update name using setter method
        person.setName("Gouri Chachar");
        person.printDetails();
    }
}