abstract class Shape{
    abstract double calculateArea();
     final void getType() {
        System.out.println("Shape type: " + this.getClass().getSimpleName());
    }
}
class Rectangle extends Shape{
    double height;
    double width;
    Rectangle(double height, double width)
    {
        this.height=height;
        this.width=width;
    }
    double calculateArea()
    {
        return height*width;
    }
}
class Circle extends Shape{
    double radi;
    Circle(double radi)
    {
        this.radi =radi;
    }
    double calculateArea(){
        return Math.PI * radi * radi;
    }
}
public class Main{
    public static void main(String args[]){
        Shape objr = new Rectangle(3.0,2.0);
        Shape objc = new Circle(7.0);
        objr.getType();
        System.out.println("Area of a Rectangle : "+ objr.calculateArea());
        objc.getType();
        System.out.println("Area of a Circle : "+ objc.calculateArea());
        
    }
}