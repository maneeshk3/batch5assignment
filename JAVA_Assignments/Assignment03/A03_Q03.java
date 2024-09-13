// Question 3:
// Write a Rectangle class, having length and width as instance variable.
// Create a method isEqual(Rectangle rec) to check if the current rectangle is 
// equal to the other rectangle passed as an argument.

import java.util.*;

class Rectangle{
	int length;
	int width;
	
	Rectangle(int l, int w)
	{
		this.length = l;
		this.width = w;
		
	}
	
	boolean isEqual(Rectangle o)
	{
		if(o.length ==length && o.width==width)
		{
			return true;
		}
		else 
			return false;
	}
	
	
	public static void main (String args[])
	{
		Rectangle rec1 = new Rectangle(10,20);
		Rectangle rec2 = new Rectangle(10,20);
		Rectangle rec3 = new Rectangle(20,20);
		
		
		System.out.println("rec1==rec2" + rec1.isEqual(rec2));
		System.out.println("rec1==rec3" + rec1.isEqual(rec3));
		
	}
	
}