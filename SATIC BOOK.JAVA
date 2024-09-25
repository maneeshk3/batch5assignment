public class StaticBlock {

    // Instance variables
    private String instanceVar1;
    private int instanceVar2;

    // Static variable
    private static String staticVar1;
    private static int staticVar2;

    // Static block to initialize static variables
    static {
        staticVar1 = "Initial Static Value 1";
        staticVar2 = 100;
    }

    // Constructor to initialize instance variables
    public StaticBlock(String var1, int var2) {
        this.instanceVar1 = var1;
        this.instanceVar2 = var2;
    }

    // Method to display all variables
    public void displayValues() {
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
        System.out.println();
    }

    // Method to update instance variables
    public void updateInstanceVariables(String var1, int var2) {
        this.instanceVar1 = var1;
        this.instanceVar2 = var2;
    }

    // Method to update static variables
    public static void updateStaticVariables(String var1, int var2) {
        staticVar1 = var1;
        staticVar2 = var2;
    }

    public static void main(String[] args) {
        // Create the first object
        StaticBlock obj1 = new StaticBlock("Object 1 Var 1", 1);
        
        // Display initial values
        System.out.println("Values from Object 1:");
        obj1.displayValues();

        // Create the second object
        StaticBlock obj2 = new StaticBlock("Object 2 Var 1", 2);
        
        // Display values of the second object
        System.out.println("Values from Object 2:");
        obj2.displayValues();

        // Update instance and static variables from obj1
        obj1.updateInstanceVariables("Updated Object 1 Var 1", 10);
        StaticBlock.updateStaticVariables("Updated Static Value 1", 200);
        
        // Display updated values from both objects
        System.out.println("After updates:");
        System.out.println("Values from Object 1:");
        obj1.displayValues();

        System.out.println("Values from Object 2:");
        obj2.displayValues();
    }
}
