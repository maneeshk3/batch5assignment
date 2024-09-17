public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.numberOfPages = 0; // Default value
    }

    // Constructor with title, author, and numberOfPages
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + numberOfPages;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "surya kiran");
        Book book2 = new Book("Advanced Java", "dinesh", 30);

        System.out.println(book1);
        System.out.println(book2);
    }
}
