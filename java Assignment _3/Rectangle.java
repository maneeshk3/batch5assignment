public class Rectangle {
    private int length;
    private int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to check if two rectangles are equal
    public boolean isEqual(Rectangle rec) {
        return this.length == rec.length && this.width == rec.width;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(10, 5);
        Rectangle rect3 = new Rectangle(8, 5);

        System.out.println("Rect1 is equal to Rect2: " + rect1.isEqual(rect2));
        System.out.println("Rect1 is equal to Rect3: " + rect1.isEqual(rect3));
    }
}
