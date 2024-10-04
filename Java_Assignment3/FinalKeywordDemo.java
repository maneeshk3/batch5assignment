final class FinalClass {
    public void displayMessage() {
        System.out.println("This is a final class, and it cannot be inherited.");
    }
}

class RegularClass {
    // Final variable - its value cannot be changed once assigned
    final int finalVariable = 50;
    
    // Regular variable - its value can be changed
    int regularVariable = 100;

    // Final method - cannot be overridden
    public final void finalMethod() {
        System.out.println("This is a final method, and it cannot be overridden.");
    }

    // Regular method - can be overridden by subclasses
    public void regularMethod() {
        System.out.println("This is a regular method, and it can be overridden.");
    }
}

class SubClass extends RegularClass {
    @Override
    public void regularMethod() {
        System.out.println("This is the overridden regular method in the subclass.");
    }

    // Uncommenting this method would cause a compilation error because finalMethod is final
    // @Override
    // public void finalMethod() {
    //     System.out.println("Cannot override final method");
    // }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Working with final and regular variables
        RegularClass obj = new RegularClass();
        System.out.println("Final Variable: " + obj.finalVariable);
        System.out.println("Regular Variable (before): " + obj.regularVariable);
        
        // Modifying the regular variable
        obj.regularVariable = 400;
        System.out.println("Regular Variable (after): " + obj.regularVariable);
        
        // Trying to modify final variable will cause a compilation error
        // obj.finalVariable = 300; // Uncommenting this line will cause an error
        
        // Working with final and regular methods
        obj.finalMethod();   // Calls the final method
        obj.regularMethod(); // Calls the regular method

        SubClass subclassObj = new SubClass();
        subclassObj.finalMethod();   // Calls the inherited final method (cannot override)
        subclassObj.regularMethod(); // Calls the overridden method in the subclass

        FinalClass finalClassObj = new FinalClass();
        finalClassObj.displayMessage();

        // Uncommenting this would cause a compilation error, because FinalClass cannot be extended
        // class AnotherClass extends FinalClass {}
    }
}