public class FinalKeywordDemo {

    // Final variable
    public final int FINAL_VARIABLE = 300;

    // Final method
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    // Final class cannot be subclassed
    public final class FinalInnerClass {
        // Inner class contents
    }

    public static void main(String[] args) {
        FinalKeywordDemo demo = new FinalKeywordDemo();
        
        // Display final variable
        System.out.println("Final Variable: " + demo.FINAL_VARIABLE);
        
        // Call final method
        demo.finalMethod();
        
        // Trying to change the final variable (will cause a compile-time error)
        // demo.FINAL_VARIABLE = 200; // Uncommenting this line will cause a compilation error

        // Final classes cannot be extended
        // class SubClass extends FinalKeywordDemo {} // Uncommenting this line will cause a compilation error
    }
}
