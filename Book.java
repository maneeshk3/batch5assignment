import.java.util.*;
class Book {
    String author; 
    String title;
    int NoOfPages;
    Book(String author) {
        this.author=author;
    }
    Book(String author,String title,int NoOfPages) {
        this.author=author;
        this.title=title;
        this.NoOfPages=NoOfPages;
    }
    public static void main(String[] args){
        Book book1 = new Book("W.Shakespeare","As you like it",100);
        Book book2 = new Book("Williams wordsworth");
        System.out.println(book2.author);
        System.out.println("Book Author: "+ book1.author + ". Book Title: "+ book1.title + ". No of Pages: " + book1.NoOfPages);
    }
}
