
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
public class Details {
    public static void main(String[] args) {
        System.out.println("Person Information:");
        Person person = new Person("priyanka", 24, "female");
        person.displayInfo();

        System.out.println("Employee Information:");
        Employee employee = new Employee("Nani", "115 Employee", 27, "Male", 1001);
        employee.displayInfo();
        employee.showEmployeeName();

        System.out.println("\nManager Information:");
        Manager manager = new Manager("Dinesh", "101 HR", 25, "Male", 111, "IT");
        manager.displayInfo();
    }
}