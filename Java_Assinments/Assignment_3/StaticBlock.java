// Question 8:
// write a java class StaticBlock, Create a static block in the class which has some instance.
// variables, and also some instance variables out of the static block.
// Try to update the values of all the instane variable from a object, and check the values from the 
// object of the same class.
// Also update the values of the static block instance variable and non static instance variable from one.                              
// object and check the values from the other object. Note down your observation.

import java.util.*;

class StaticBlock
{
	static int a=20;
	static String b ="static variable test";
			
	int c = 30;
	String d = "non static variable test";

	public static void main (String[] args)
	{
		
		staticblock obj = new staticblock();
		staticblock obj2 = new staticblock();

	// before updating
	
	System.out.println("before updating");	
	System.out.println(obj.a);	
	System.out.println(obj.b);	
	System.out.println(obj.c);	
	System.out.println(obj.d+"\n");

	// updating values of static and non static variables
	obj.a = 40;
	obj.b = "test 1 static variable updated";
	obj.c = 60;
	obj.d = "test 2 non static variable updated";
	
	System.out.println("after updating object 1 checking object 2 values");	
	System.out.println(obj2.a);
	System.out.println(obj2.b);
	System.out.println(obj2.c);
	System.out.println(obj2.d);
	
	System.out.println("observation: static variable shared one address by all class object");
	
	// static variable shared one address by all class object	
		
		
	}
	
	
	
	
}