/*Question 3:
Write a Rectangle class, having length and width as instance variable.
Create a method isEqual(Rectangle rec) to check if the current rectangle is 
equal to the other rectangle passed as an argument.
 */

class Rectangle {
    // instance variables
    private double length;
    private double width;

    // constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // method to check if the current rectangle is equal to another rectangle
    public boolean isEqual(Rectangle rec) {
        return this.length == rec.length && this.width == rec.width;
    }

    // method to display rectangle dimensions
    public void displayDimensions() {
        System.out.println("Length is : " + length + ", Width is : " + width);
    }

    public static void main(String[] args) {
        // Creating two Rectangle objects
        Rectangle rect1 = new Rectangle(5.0, 10.0);
        Rectangle rect2 = new Rectangle(5.0, 10.0);
        Rectangle rect3 = new Rectangle(7.0, 10.0);

        // Displaying the dimensions of the rectangles
        System.out.println("Rectangle 1:");
        rect1.displayDimensions();

        System.out.println("Rectangle 2:");
        rect2.displayDimensions();

        System.out.println("Rectangle 3:");
        rect3.displayDimensions();

        // Checking if Rectangle 1 is equal to Rectangle 2
        if (rect1.isEqual(rect2)) {
            System.out.println("Rectangle 1 is equal to Rectangle 2.");
        } else {
            System.out.println("Rectangle 1 is not equal to Rectangle 2.");
        }

        // Checking if Rectangle 1 is equal to Rectangle 3
        if (rect1.isEqual(rect3)) {
            System.out.println("Rectangle 1 is equal to Rectangle 3.");
        } else {
            System.out.println("Rectangle 1 is not equal to Rectangle 3.");
        }
    }
}
