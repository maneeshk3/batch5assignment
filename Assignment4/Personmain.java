/*
Question 5:
    Create a Superclass Person: having instance variable name, age, gender a Constructor to  Initializes the name age gender.
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

//Super class
class Person{
    
    String name = "Person Name";
    int age = 23;
    String gender = "Male";
    
    public Person(){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    
    public void displayInfo(){
        System.out.println("Person Name : " + name);
        System.out.println("Person Age : " + age);
        System.out.println("Person Gender : " + gender);
    }
}


//subclass
class Employee extends Person{
    
    int employeeID = 10001;
    String name = "Emp Name";
    
    public Employee(String personname,String empname,int age,String gender,int employeeID ){
        
        super(personname,age,gender);
        this.name = empname;
        this.employeeID = employeeID;
        
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Employee Name : " + name);
        System.out.println("Person Age : " + age);
        System.out.println("Person Gender : " + gender);
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Person Name : " + super.name);
    }
    
}


class Manager extends Employee{
    
    String department;
    
    public Manager(String personName, String employeeName, int age, String gender, int employeeId, String department) {
        super(personName, employeeName, age, gender,employeeId);
        this.department = department;
    }
    
     @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}


public class Personmain{
    
    public static void main(String args[]){
        Person p1 = new Person("Person One",12,"F");
        p1.displayInfo();
        System.out.println("************************************"+"\n");
        
        
        Employee emp1 = new Employee("Person One","Employee One",21,"Male",10002);
        emp1.displayInfo();
        System.out.println("************************************"+"\n");
        
        Manager manager1 = new Manager("Persone One","Manager One",45,"Male",10003,"PLM");
        manager1.displayInfo();
    }
    
}
