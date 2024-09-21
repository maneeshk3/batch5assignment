// Superclass Bird
class Bird {
    public void fly() {
        System.out.println("Bird is flying...");
    }
}

// Subclass Eagle
class Eagle extends Bird {
    @Override
    public void fly() {
        super.fly();  // Call the superclass fly() method
        System.out.println("Eagle is flying high...");
    }
}

// Main class to demonstrate inheritance and method overriding
public class BirdEagle {
    public static void main(String[] args) {
        // Create an Eagle object
        Eagle eagle = new Eagle();

        // Call the fly() method
        System.out.println("Calling fly() method on Eagle object:");
        eagle.fly();
    }
}