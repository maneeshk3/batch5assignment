// Question 7:
// Write another method to print the values of these instance variable..
// Also try to udpate the name using Object.name = ''; and study the exception(error) you get.


import java.util.*;
class persontest 
{
	
	
	public static void main(String[] args)
	{
		person obj = new person();	
		obj.setinfo("musheer",24,"musheer2911");
		// obj.name = "mushir"; // error: name has private access in person 
		obj.displayinfo();
	
	
	
		
	}
	
	
}