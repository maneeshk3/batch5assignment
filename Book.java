public class Book{
    
    String title;
    String author;
    int numberOfPages ;
    
    public Book(String title,String author){             //1st constructor
        this.title = title;
        this.author = author;
        this.numberOfPages  = 0;
    }
    
    public Book(String title,String author,int numberOfPages ){       //2nd constructor
        this.title = title;
        this.author = author;
        this.numberOfPages  = numberOfPages ;
        
    }
    
    public void printresult(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages );
        
    }
    
    
	public static void main(String[] args) {
		Book book1 = new Book("Jungle Book","Rudyard Kipling",568);
		book1.printresult();
		
		Book book2 = new Book("UV Can","Yuvraj",158);
		book2.printresult();
		
	}
}