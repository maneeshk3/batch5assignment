public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public boolean isEqual(Rectangle rec) {
        
        return this.length == rec.length & this.width == rec.width;
    }

    public void display() {
        System.out.println("Rectangle [Length: " + length + ", Width: " + width + "]");
    }

    public static void main(String[] args) {
      
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);

        rect1.display();
        rect2.display();
        rect3.display();

        if (rect1.isEqual(rect2)) {
            System.out.println("Rectangle 1 is equal to Rectangle 2.");
        } else {
            System.out.println("Rectangle 1 is not equal to Rectangle 2.");
        }

        if (rect1.isEqual(rect3)) {
            System.out.println("Rectangle 1 is equal to Rectangle 3.");
        } else {
            System.out.println("Rectangle 1 is not equal to Rectangle 3.");
        }
    }
}
