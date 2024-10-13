class Person {
 
    String name;
    int age;
    String gender;

    // Constructor to initialize name, age, and gender
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Method to display person information
    void displayInfo() {
        System.out.println("Person Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Employee extends Person {
    // Instance variables
    int employeeId;
    String name;

    // Constructor to initialize name, age, gender, and employeeId
    Employee(String personName, String employeeName, int age, String gender, int employeeId) {
        super(personName, age, gender);
        this.name = employeeName;
        this.employeeId = employeeId;
    }

    // Method to display employee information
    @Override
    void displayInfo() {
        System.out.println("Employee Name (Person1): " + super.name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Employee ID: " + employeeId);
    }

    // Method to demonstrate variable hiding
    void showEmployeeName() {
        System.out.println("Employee Name (Employee): " + name);
    }
}

class Manager extends Employee {
    // Instance variable
    String department;

    // Constructor to initialize name, age, gender, employeeId, and department
    Manager(String personName, String employeeName, int age, String gender, int employeeId, String department) {
        super(personName, employeeName, age, gender, employeeId);
        this.department = department;
    }

    // Method to display manager information
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
 public class Person_main {
    public static void main(String[] args) {
       
        Manager manager = new Manager("Gauri Chachar", "GC", 29, "Female", 216, "R&D");
        
        // Display information using displayInfo() from Manager
        manager.displayInfo();
        
        // Demonstrate variable hiding with showEmployeeName()
        manager.showEmployeeName();
    }
}