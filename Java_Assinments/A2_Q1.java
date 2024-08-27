// Question 1.2: Second commit after adding this method to the code.
// Create a method for the above class as setInfo(), accepting parameters(name, age, address)
// and update the values of the instance variable in this method using this keyword.
import java.util.*;

class person 
{
	int age;
	String name, address;
	person()
	{			

	}
	person(String n, int ag, String ad)
	{	
		name = n;
		age = ag;
		address = ad;
	}
	public void displayInfo()
	{
		System.out.println("Displaying info......\n ");
		System.out.println("Name: " + name + ".\nAge: " + age +".\nAddress: "+ address +'\n');
	}
	public void setInfo(String name,int age,String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public static void main(String[] args)
	{
		person obj = new person();
		person obj2 = new person("mak",20,"nanded");
		obj2.displayInfo();
		obj2.setInfo("musheer",24,"maharashtra");
		obj2.displayInfo();
	}
	
}
