// Question 2:
// Write a Book class, having two constructors, showcasing constructor overloading,
// one constructor will take title, Author as arguments, the other constructor will
// take title, author and numberOfPages as arguments. Create objects of this class
// showcasing both the constructor usage.

import java.util.*;

class book
{
	String title, author;
	int numberOfPages;
	book( String title, String author)
	{
		this.title = title;
		this.author = author;
		System.out.println("title: " + title + "\n" + "Author: " + author + "\n" );
	}
	
	book( String title, String author, int numberOfPages)
	{
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		System.out.println("title: " + title + "\n" + "Author: " + author + "\n" + "numberOfPages: "+ numberOfPages );
	
	}
	
	public static void main(String[] args)
	{
		book obj1 = new book("java 9th edition","Herbert");
		book obj2 = new book("java 9th edition","Herbert",1300);
		
	}
	
	
}