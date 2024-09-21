/*Question 2:
Write a Book class, having two constructors, showcasing constructor overloading,
one constructor will take title, Author as arguments, the other constructor will
take title, author and numberOfPages as arguments. Create objects of this class
showcasing both the constructor usage.
 */

public class Book {
    private String title;
    private String author;
    private int numberofPages;

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.numberofPages = 0; // default value when pages are not specified
    }

    // Constructor with title, author, and numberofPages
    public Book(String title, String author, int numberofPages) {
        this.title = title;
        this.author = author;
        this.numberofPages = numberofPages;
    }

    // this method is to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + (numberofPages == 0 ? "Not specified" : numberofPages));
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        // creating a book object using the first constructor title and author
        Book book1 = new Book("The Compund Effect", "Darren Hardy");
        System.out.println("Book 1 Information:");
        book1.displayInfo();

        // creating a book object using the second constructor title, author, and numberOfPages
        Book book2 = new Book("The power of Subconsious mind", " Dr. Joseph Murphy ", 360);
        System.out.println("Book 2 Information:");
        book2.displayInfo();
    }
}