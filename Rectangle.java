import java.util.*;
class Rectangle{
double length, breadth;
Rectangle(double l, double b) {
length = l;
breadth = b;
}
boolean isEqual(Rectangle rec) {
    if(rec.length == length && rec.breadth == breadth) 
        return true;
    else 
        return false;
    }
    public static void main(String args[]) 
    {
        Rectangle rec1 = new Rectangle(7.5, 15.5);
        Rectangle rec2 = new Rectangle(7.5, 15.5);
        Rectangle rec3 = new Rectangle(10.2, 2.5);
        System.out.println("rec1 equal to rec2: " + rec1.isEqual(rec2));
        System.out.println("rec1 equal to rec3: " + rec1.isEqual(rec3));
    }
}
