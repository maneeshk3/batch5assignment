// Final class cannot be subclassed
final class FinalClass {
    // Final variable
    private final int finalVariable = 10;

    // Method to get the value of finalVariable
    public int getFinalVariable() {
        return finalVariable;
    }

    // Final method
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

// Regular class that can be subclassed
class RegularClass {
    // Regular variable
    private int regularVariable = 5;

    // Method to get the value of regularVariable
    public int getRegularVariable() {
        return regularVariable;
    }

    // Regular method
    public void regularMethod() {
        System.out.println("This is a regular method.");
    }
}

// Subclass of RegularClass
class SubClass extends RegularClass {
    // Overriding the regular method
    @Override
    public void regularMethod() {
        System.out.println("This is an overridden regular method in SubClass.");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Demonstrating final class
        FinalClass finalClassInstance = new FinalClass();
        System.out.println("Final Variable: " + finalClassInstance.getFinalVariable());
        finalClassInstance.finalMethod();

        // Demonstrating regular class and subclass
        RegularClass regularClassInstance = new RegularClass();
        System.out.println("Regular Variable: " + regularClassInstance.getRegularVariable());
        regularClassInstance.regularMethod();

        SubClass subClassInstance = new SubClass();
        System.out.println("Regular Variable from SubClass: " + subClassInstance.getRegularVariable());
        subClassInstance.regularMethod();
    }
}
