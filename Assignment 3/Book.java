public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    // Constructor that takes title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.numberOfPages = 0; // Default value
    }

    // Constructor that takes title, author, and numberOfPages
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // Method to display book information
    public void displayInfo() {
        String info = "Title: " + title + ", Author: " + author;
        if (numberOfPages > 0) {
            info += ", Number of Pages: " + numberOfPages;
        }
        System.out.println(info);
    }

    public static void main(String[] args) {
        // Creating an object using the first constructor
        Book book1 = new Book("Polite", "venu");
        book1.displayInfo(); 

        // Creating an object using the second constructor
        Book book2 = new Book("The life", "shyam", 180);
        book2.displayInfo(); 
		
    }
}
