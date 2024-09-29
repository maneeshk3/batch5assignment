// Final class example
final class FinalClass {
    // Final variable
    final int finalVariable;

    // Constructor to initialize final variable
    FinalClass(int value) {
        finalVariable = value; // final variable must be initialized
    }

    // Final method
    public final void display() {
        System.out.println("Final Variable: " + finalVariable);
    }
}

// Non-final class
class NonFinalClass {
    // Non-final variable
    int nonFinalVariable;

    // Method to set the variable
    public void setVariable(int value) {
        nonFinalVariable = value;
    }

    // Non-final method
    public void display() {
        System.out.println("Non-final Variable: " + nonFinalVariable);
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Demonstrating final variable
        FinalClass finalObject = new FinalClass(100);
        finalObject.display();
        // Uncommenting the line below will cause a compilation error
        // finalObject.finalVariable = 200; // Cannot change final variable

        // Demonstrating non-final class
        NonFinalClass nonFinalObject = new NonFinalClass();
        nonFinalObject.setVariable(50);
        nonFinalObject.display();

        // Updating non-final variable
        nonFinalObject.setVariable(200);
        System.out.println("After updating:");
        nonFinalObject.display();
    }
}
