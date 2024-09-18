package javacodeseries;

public class Book {
	private String title;
	private String author;
	private int numberOfPages;
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
		this.numberOfPages=0;
	}
		
		public Book(String title,String author,int numberOfPages) {
			this.title=title;
			this.author=author;
			this.numberOfPages=numberOfPages;
		}
		//getters and setters
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title=title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author=author;
		}
		public int getNumberOfPages() {
			return numberOfPages;
		}
		public void setNumberOfPages(int numberOfPages) {
			this.numberOfPages=numberOfPages;
		}
		public static void main(String[]args) {
			//creating objects with both constructor
			Book book1=new Book("To Kill a Mockingbird","Harper Lee");
			Book book2=new Book("1984","GeorgeOrwell",328);
			
			System.out.println("Book1:Title="+book1.getTitle()+",Author="+book1.getAuthor()+",Pages="+book1.getNumberOfPages());
			System.out.println("Book 2:Title="+book2.getTitle()+",Author="+book2.getAuthor()+",Pages="+book2.getNumberOfPages());
			
		}
	}