// Question 7:
// Create a Person class with Private attributes name, age, email address.
// Write a method which will set the values of these instance variable as these
// cant be access as Object.age etc...
// Write another method to print the values of these instance variable..
// Also try to udpate the name using Object.name = ''; and study the exception(error) you get.


import java.util.*;
class Person 
{
	// private we dont have access to this variables outside the class
	private String name;
	private int age;
	private String email;
	
	public void setinfo(String name, int age, String email)
	{
		this.name = name;
		this.age = age;
		this.email = email;		
	}
	public void displayinfo()
	{
	System.out.println("Name: "+name);	
	System.out.println("Age: "+age);	
	System.out.println("Email: "+email);	
		
	}
	
	
	class PersonTest 
{
	
	public static void main(String[] args)
	{
		person obj = new person();	
		obj.setinfo("musheer",24,"musheer2911");
		// obj.name = "mushir"; // error: name has private access in person 
		obj.displayinfo();
	}
	
	
}
	
	
}