public class Book{
    
    String title;
    String author;
    int pagenumbers;
    
    //Constructor 1
    public Book(String title,String author){
        this.title = title;
        this.author = author;
        this.pagenumbers = 0;
    }
    
     //Constructor 2
    public Book(String title,String author,int pagenumbers){
        this.title = title;
        this.author = author;
        this.pagenumbers = pagenumbers;
        
    }
    
    public void printresult(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + pagenumbers);
        
    }
    
    
	public static void main(String[] args) {
		Book book1 = new Book("Java Guide","James");
		book1.printresult();
		
		Book book2 = new Book("Java Complete Guide","Oracle",1234);
		book2.printresult();
		
	}
}
