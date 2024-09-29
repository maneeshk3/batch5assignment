public class StaticBlock {
    // Instance variables
    private int instanceVar1;
    private int instanceVar2;

    // Static block to initialize static instance variables
    static {
        System.out.println("Static block executed.");
    }

    // Constructor to initialize instance variables
    public StaticBlock(int var1, int var2) {
        this.instanceVar1 = var1;
        this.instanceVar2 = var2;
    }

    // Method to display instance variable values
    public void displayValues() {
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create the first object
        StaticBlock obj1 = new StaticBlock(10, 20);
        System.out.println("Initial values of obj1:");
        obj1.displayValues();

        // Create the second object
        StaticBlock obj2 = new StaticBlock(30, 40);
        System.out.println("\nInitial values of obj2:");
        obj2.displayValues();

        // Update values of obj1
        obj1.instanceVar1 = 50;  // Update instance variable of obj1
        obj1.instanceVar2 = 60;  // Update instance variable of obj1
        System.out.println("\nUpdated values of obj1:");
        obj1.displayValues();

        // Check values of obj2 to see if they are affected
        System.out.println("\nValues of obj2 after updating obj1:");
        obj2.displayValues();
    }
}
