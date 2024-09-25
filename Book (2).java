class Book {
    private String title;
    private String author;
    private int numberOfPages;

    // Constructor that takes title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.numberOfPages = -1; // Indicates the number of pages is not specified
    }

    // Constructor that takes title, author, and numberOfPages
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        String pages = (numberOfPages != -1) ? String.valueOf(numberOfPages) : "Not specified";
        return "Title: '" + title + "', Author: " + author + ", Pages: " + pages;
    }

    public static void main(String[] args) {
        // Creating an object using the first constructor
        Book book1 = new Book("1984", "George Orwell");
        System.out.println(book1);

        // Creating an object using the second constructor
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        System.out.println(book2);
    }
}
