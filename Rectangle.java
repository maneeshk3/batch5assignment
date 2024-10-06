public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {      //initialize the rectangle via Constructor 
        this.length = length;
        this.width = width;
    }

    public boolean isEqual(Rectangle rect) {     //1st method to compare rectangles
        if (rect == null) {
            return false; // If the passed rectangle is null, return false
        }
        return (this.length == rect.length) && (this.width == rect.width);
    }

    public void displayInfo() {              //2nd method for output
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(1.0, 2.0);
        Rectangle rect2 = new Rectangle(3.0, 4.0);
        Rectangle rect3 = new Rectangle(5.0, 6.0);

        rect1.displayInfo();
        rect2.displayInfo();
        rect3.displayInfo();

        System.out.println("rect1 is equal to rect2: " + rect1.isEqual(rect2)); 
        System.out.println("rect1 is equal to rect3: " + rect1.isEqual(rect3));
    }
}
