public class Book {
    String title;
    String author;
    int numberOfPages;

    // Constructor 1: Takes title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.numberOfPages = -1; // Default value if number of pages is not provided
    }

    // Constructor 2: Takes title, author, and number of pages
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (numberOfPages != -1) {
            System.out.println("Number of Pages: " + numberOfPages);
        } else {
            System.out.println("Number of Pages: Not specified");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a book object using the first constructor (title and author)
        Book book1 = new Book("Wings of Fire", "A.P.J Abdul Kalam");
        book1.displayBookInfo();

        // Creating a book object using the second constructor (title, author, number of pages)
        Book book2 = new Book("Believe in Yourself", "Swami Vivekanad", 136);
        book2.displayBookInfo();
    }
}
