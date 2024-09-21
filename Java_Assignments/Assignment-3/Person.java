/*Question 7:
Create a Person class with Private attributes name, age, email address.
Write a method which will set the values of these instance variable as these
cant be access as Object.age etc...
Write another method to print the values of these instance variable..
Also try to udpate the name using Object.name = ''; and study the exception you get.
 */
public class Person {
    // take attributes as private
    private String name;
    private int age;
    private String emailAddress;

    // method to set the values of the private attributes
    public void setDetails(String name, int age, String emailAddress) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    // method to print the values of the private attributes
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email Address: " + emailAddress);
    }

    public static void main(String[] args) {
        // creating an object of the Person class
        Person person = new Person();
        
        // setting values using the method
        person.setDetails("Archana", 35, "abc@gmail.com");
        
        // printing the details
        person.printDetails();

        // trying direct access and update the private variable 'name'
        // this will cause a compile-time error because 'name' is private        
        // person.name = "new-name"; // Error: 'name' has private access in 'Person'
    }
}
