// Question 3:
// Write a Rectangle class, having length and width as instance variable.
// Create a method isEqual(Rectangle rec) to check if the current rectangle is 
// equal to the other rectangle passed as an argument.

import java.util.*;

class Rectangle 
{
	int length ,width;
	Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	public isEqual(rectangle rec)
	{
		if (this.length == rec.length || this.width == rec.width)
	}
	
	
	public static void main(String [] args)
	{
		rectangle obj = new rectangle(10,5);
		rectangle obj2 = new rectangle(10,5);
		rectangle obj3 = new rectangle(10,7);
		
		obj2.isEqual(obj);
		obj2.isEqual(obj3);
	}
	
}


	
	
