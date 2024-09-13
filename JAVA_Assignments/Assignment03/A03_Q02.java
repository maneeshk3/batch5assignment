// Write a Book class, having two constructors, showcasing constructor overloading,
// one constructor will take title, Author as arguments, the other constructor will
// take title, author and numberOfPages as arguments. Create objects of this class
// showcasing both the constructor usage.

import java.util.*;

class book{
	 
	 book(String title, String author ){
		 
		 System.out.println("title: " + title+ "\n" + "author: " + author+"\n" );
		 
	 }
	 
	  book(String title, String author, int nop ){
		  
		 System.out.println("title: " + title+ "\n" + "author: " + author+"\n" + "number of pages: "+ nop );
		 
		 
	 }
	
	public static void main (String args[])
	{
		book B1 = new book("graceful strength", "Dr.s");
		book B2 = new book("one piece", "oda", 200);
		
		
	}
}