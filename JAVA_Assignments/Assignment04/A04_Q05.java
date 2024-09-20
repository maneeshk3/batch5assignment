// Question 5:
    // Create a Superclass Person: having instance variable name, age, gender a Constructor to  Initializes the name age gender.
    // A method displayInfo() that prints: "Person Name: " + name, like that the other info as well.
 
import java.util.*;

class person
{
	String name, gender;
	int age;
	
	person(String name, int age, String gender)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	void displayInfo()
	{
		System.out.println("\nPerson's info... \n***************\nname: "
										+ name +"\n" + "Age: "+age+"\nGender"+ gender);
	}
	
	
}

 
    // Subclass Employee (extends Person): Adds an int instance variable employeeId.
    // Introduces a new name instance variable (hides the name instance variable from the Person class to demonstrate variable hiding).
    // Initializes both name (from Person and from Employee), age, gender and employeeId using the super keyword to call the Person constructor.
    // Override the displayInfo() method to print: "Employee Name: ", " Age : " and "Gender : ", Employee ID: ",  Name from the person class.
    // Add a method showEmployeeName() to demonstrate how the name variable is hidden at the subclass level, print the name variable created in employee class.

class employee extends person
{
	int employeeId;
	String EmpName;
	// String name, gender;
	// int age;
	
	employee(String name, int age, String gender, String EmpName, int employeeId )
	{
		super(name, age, gender);// call person constructor using super 
		this.EmpName = EmpName;
		this.employeeId = employeeId;
		
	}
	void displayInfo()
	{
		super.displayInfo();
		System.out.println("\nEmployee ID: "+ employeeId );
										
	}
	void showEmployeeName()
	{
		System.out.println("Empolyee Name: " +EmpName);
		
	}
	
	
	
}

    
    // Subclass Manager (extends Employee): Adds a String instance variable department.
    // Initializes name, age, gender, employeeId, and department using the super keyword to call the Employee constructor.
    // Override the displayInfo() method to print: "Manager Name: " + name + ", " Age : " and "Gender : ", Employee ID: " + employeeId + ", Department: " + department.
    // Use the super keyword to call the displayInfo() method from the Employee class to demonstrate method chaining.
	
class Manager extends employee
{
	String department;
	Manager(String name, int age, String gender ,String EmpName ,int employeeId, String department)
	{
		super(name, age, gender,EmpName, employeeId);
		
		this.department = department;
			
	}
	void displayInfo()
	{
		super.displayInfo();
		System.out.println("\nDepartment: "+ department );
										
	}
	
}	

class test5
{
	
	public static void main(String args[])
	{
	//person obj1 = new person("Asna", 28, "Female");
	//employee obj2 = new employee("Asna", 27, "Female1","Maheen",1122);
	Manager obj3 = new Manager("Asna", 27, "Female","Maheen",1122,"design eng");	
	obj3.displayInfo();	
		
	}
	
	
}