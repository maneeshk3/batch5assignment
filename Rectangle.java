/*
Write a Rectangle class, having length and width as instance variable.
Create a method isEqual(Rectangle rec) to check if the current rectangle is 
equal to the other rectangle passed as an argument.
*/

public class Rectangle{
	
	double length;
	double width;
	
	Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	
	public boolean isEqual(Rectangle rec){
		return this.length==rec.length & this.width==rec.width;
	}
	
	public static void main(String[] args){
		Rectangle rec1 = new Rectangle(10.5,5.5);
		Rectangle rec2 = new Rectangle(10.5,5.5);
		System.out.println(rec1.isEqual(rec2));
	}
}