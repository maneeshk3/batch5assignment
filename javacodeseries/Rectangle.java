package javacodeseries;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle(double length ,double width) {
		this.length= length;
		this.width=width;
	}
	//getter method
	public double getLength(){
		return length;
	}
	public double getWidth() {
		return width;
	}
	public boolean isEqual(Rectangle rec) {
		if(this.length==rec.length&&this.width==rec.width) {
			return true;
		}
		return false;
	}
	public static void main(String[]args) {
		Rectangle rec1=new Rectangle(4,5);
		Rectangle rec2=new Rectangle(4,5);
		Rectangle rec3=new Rectangle(3,5);
		
		System.out.println(rec1.isEqual(rec2));
		System.out.println(rec1.isEqual(rec3));
		
	}
}