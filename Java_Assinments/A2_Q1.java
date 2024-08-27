import java.util.*;

class person 
{
	int age;
	String name, Address;
	person()
	{			

	}
	person(String n, int ag, String ad)
	{	
		name = n;
		age = ag;
		Address = ad;
	}
	public void displayInfo()
	{
		System.out.println("Displaying info......\n ");
		System.out.println("Name: " + name + ".\nAge: " + age +".\nAddress: "+ Address +'\n');
	}
	public static void main(String[] args)
	{
		person obj = new person();
		person obj2 = new person("mak",20,"nanded");
		obj2.displayInfo();
		
	}
	
}
