// Question 1.3: Thirs commit after adding this method to the code.
// Add another method to the class Person, named as isAdult(), which return a boolean,
// if the age of the person age is 18 or above. Create a object of this class, and call 
// this method.
import java.util.*;

class Person 
{
	int age;
	String name, address;
	person()
	{			
		System.out.println("Program to display and update person details..... \n ");
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
		System.out.println("Updated info\n ");
	}
	public boolean isAdult()
	{
		boolean flag = true;
		if (age>=18)
		{
			flag=true;
		}
		else
		{
			flag= false;
		}
		return flag;
	}
	
	public static void main(String[] args)
	{
		person obj = new person();
		person obj2 = new person("mak",20,"nanded");
		obj2.displayInfo();
		obj2.setInfo("musheer",24,"maharashtra");
		obj2.displayInfo();
		boolean flag = obj2.isAdult();
		System.out.println("is adult?: " + flag);	
	}
	
}
