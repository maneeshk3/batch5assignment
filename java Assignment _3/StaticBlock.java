public class StaticBlock {
    // Instance variables
    private int instanceVariable1;
    private int instanceVariable2;

    // Static variables
    private static int staticVariable1;
    private static int staticVariable2;

    // Static block
    static {
        staticVariable1 = 10;
        staticVariable2 = 20;
        System.out.println("Static block executed");
    }

    // Constructor
    public StaticBlock(int var1, int var2) {
        this.instanceVariable1 = var1;
        this.instanceVariable2 = var2;
    }

    // Method to display values
    public void displayValues() {
        System.out.println("Instance Variable 1: " + instanceVariable1);
        System.out.println("Instance Variable 2: " + instanceVariable2);
        System.out.println("Static Variable 1: " + staticVariable1);
        System.out.println("Static Variable 2: " + staticVariable2);
    }

    public static void main(String[] args) {
        // Create two instances
        StaticBlock obj1 = new StaticBlock(5, 15);
        StaticBlock obj2 = new StaticBlock(7, 17);

        // Display initial values
        System.out.println("Values for obj1:");
        obj1.displayValues();

        System.out.println("Values for obj2:");
        obj2.displayValues();

        // Modify values from obj1
        obj1.instanceVariable1 = 50;
        obj1.instanceVariable2 = 150;
        StaticBlock.staticVariable1 = 100;
        StaticBlock.staticVariable2 = 200;

        // Display values after modification
        System.out.println("Values for obj1 after modification:");
        obj1.displayValues();

        System.out.println("Values for obj2 after modification:");
        obj2.displayValues();
    }
}
