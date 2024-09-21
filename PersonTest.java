
class Person {
    public String name;
    public int age;
    public String gender;

    // Constructor to initialize name, age, and gender
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Method to display person info
    public void displayInfo() {
        System.out.println("Person Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

// Subclass Employee that extends Person
class Employee extends Person {
    private int employeeId;
    private String employeeName; // Hides the name variable from Person

    // Constructor to initialize Employee attributes
    public Employee(String name, int age, String gender, int employeeId) {
        super(name, age, gender); 
        this.employeeName = name; // Employee's name (hiding the Person's name)
        this.employeeId = employeeId;
    }

    // Override displayInfo() method
    @Override
    public void displayInfo() {
        System.out.println("Employee Name: " + employeeName); 
        System.out.println("Age: " + age); 
        System.out.println("Employee ID: " + employeeId); 
    }

    // Method to demonstrate variable hiding
    public void showEmployeeName() {
        System.out.println("Employee's hidden name: " + employeeName); // Employee's name
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }
}

// Subclass Manager that extends Employee
class Manager extends Employee {
    private String department;

    // Constructor to initialize Manager attributes
    public Manager(String name, int age, String gender, int employeeId, String department) {
        super(name, age, gender, employeeId); // Calls the Employee constructor
        this.department = department;
    }

    // Override displayInfo() method
    @Override
    public void displayInfo() {
        System.out.println("Manager Name: " + super.getName()); // Use the getter from Person
        System.out.println("Age: " + age); 
        System.out.println("Gender: " + gender); 
        System.out.println("Employee ID: " + getEmployeeId()); // Use the getter from Employee
        System.out.println("Department: " + department);
        super.displayInfo(); // Call the Employee's displayInfo() to demonstrate method chaining
    }
}

// Main class to test the Person, Employee, and Manager classes
public class PersonTest {
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("Alice", 35, "Female", 101, "Sales");
        
        // Display information using the displayInfo() method
        manager.displayInfo();

        // Show the hidden employee name
        manager.showEmployeeName();
    }
}
