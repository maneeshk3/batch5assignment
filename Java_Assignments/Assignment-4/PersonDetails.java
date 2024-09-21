/*Create a Superclass Person: having instance variable name, age, gender a Constructor to  Initializes the name age gender.
    A method displayInfo() that prints: "Person Name: " + name, like that the other info as well.
    
    Subclass Employee (extends Person): Adds an int instance variable employeeId.
    Introduces a new name instance variable (hides the name instance variable from the Person class to demonstrate variable hiding).
    Initializes both name (from Person and from Employee), age, gender and employeeId using the super keyword to call the Person constructor.
    Override the displayInfo() method to print: "Employee Name: ", " Age : " and "Gender : ", Employee ID: ",  Name from the person class.
    Add a method showEmployeeName() to demonstrate how the name variable is hidden at the subclass level, print the name variable created in employee class.
    
    Subclass Manager (extends Employee): Adds a String instance variable department.
    Initializes name, age, gender, employeeId, and department using the super keyword to call the Employee constructor.
    Override the displayInfo() method to print: "Manager Name: " + name + ", " Age : " and "Gender : ", Employee ID: " + employeeId + ", Department: " + department.
    Use the super keyword to call the displayInfo() method from the Employee class to demonstrate method chaining.
*/
// create superclass as Person
    class Person {
        protected String name;
        protected int age;
        protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Person Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// take Subclass as Employee
    class Employee extends Person {
        protected int employeeId;
        protected String name; // This hides the name variable from Person

        public Employee(String personName, String employeeName, int age, String gender, int employeeId) {
            super(personName, age, gender);
            this.name = employeeName;
            this.employeeId = employeeId;
    }

    // Override method displayInfo
    public void displayInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name from Person class: " + super.name);
    }

    public void showEmployeeName() {
        System.out.println("Employee name from Employee class : " + this.name);
    }
}

// Subclass Manager
class Manager extends Employee {
    private String department;

    public Manager(String personName, String employeeName, int age, String gender, int employeeId, String department) {
        super(personName, employeeName, age, gender, employeeId);
        this.department = department;
    }

    //Override displayinfo() 
    public void displayInfo() {
        super.displayInfo(); // Call Employee's method displayInfo 
        System.out.println("Department: " + department);
    }
}

// main class implementation
public class PersonDetails {
    public static void main(String[] args) {
        System.out.println("Person Information:");
        Person person = new Person("Archana", 35, "Female");
        person.displayInfo();

        System.out.println("Employee Information:");
        Employee employee = new Employee("ThulasiNath", "1001 Employee", 35, "Male", 1001);
        employee.displayInfo();
        employee.showEmployeeName();

        System.out.println("\nManager Information:");
        Manager manager = new Manager("Vaydhu", "2001 Manager", 40, "Male", 2001, "IT");
        manager.displayInfo();
    }
}