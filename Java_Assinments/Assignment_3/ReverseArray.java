// Question 11:
// Write a java method, which will take array of integers as input and will reverse 
// the elements in the array.
import java.util.*;

class ReverseArray {

	static void reverse(int...arr)
	{
		for(int i=arr.length-1; i>=0; i--)
		{
	       System.out.print(arr[i]+" "); 
	    }
	}

	  public static void main(String args[])
	   {
		
	     int arr[] = {5, 10, 15,  20};

		reverse(arr);
	   }
}