public class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to check if the current rectangle is equal to another rectangle
    public boolean isEqual(Rectangle rec) {
        if (rec == null) {
            return false; // If the passed rectangle is null, return false
        }
        return (this.length == rec.length) && (this.width == rec.width);
    }

    // Method to display rectangle information
    public void displayInfo() {
        System.out.println("Rectangle [Length: " + length + ", Width: " + width + "]");
    }

    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);

        // Display rectangle information
        rect1.displayInfo();
        rect2.displayInfo();
        rect3.displayInfo();

        // Check if the rectangles are equal
        System.out.println("rect1 is equal to rect2: " + rect1.isEqual(rect2)); // Output: true
        System.out.println("rect1 is equal to rect3: " + rect1.isEqual(rect3)); // Output: false
    }
}
