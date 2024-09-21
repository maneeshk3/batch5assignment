/*Question 8:
write a java class StaticBlock, Create a static block in the class which has some instance 
variables, and also some instance variables out of the static block.
Try to update the values of all the instane variable from a object, and check the values from the 
object of the same class.
Also update the values of the static block instance variable and non static instance variable from one 
object and check the values from the other object. Note down your observation.
 */

public class StaticKeyword {
    // static variables initialized in static block
    static int staticVar1;
    static int staticVar2;
    
    // take two integer instance variables
    int instanceVar1;
    int instanceVar2;
    
    // static block
    static {
        System.out.println("Static block executed");
        staticVar1 = 10;
        staticVar2 = 20;
    }
    
    // constructor
    public StaticKeyword() {
        instanceVar1 = 1;
        instanceVar2 = 2;
    }
    
    // method to display all variables
    public void displayVariables() {
        System.out.println("staticVar1: " + staticVar1);
        System.out.println("staticVar2: " + staticVar2);
        System.out.println("instanceVar1: " + instanceVar1);
        System.out.println("instanceVar2: " + instanceVar2);
        System.out.println("--------------------");
    }
    
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        System.out.println("creating first object as obj1 ");
        StaticKeyword obj1 = new StaticKeyword();
        obj1.displayVariables();
        
        System.out.println("modifying variables through obj1 ");
        obj1.staticVar1 = 100;
        obj1.staticVar2 = 200;
        obj1.instanceVar1 = 10;
        obj1.instanceVar2 = 20;
        obj1.displayVariables();
        
        System.out.println("creating second object as obj2 ");
        StaticKeyword obj2 = new StaticKeyword();
        obj2.displayVariables();
        
        System.out.println("modifying variables through obj2 ");
        obj2.staticVar1 = 1000;
        obj2.staticVar2 = 2000;
        obj2.instanceVar1 = 100;
        obj2.instanceVar2 = 200;
        obj2.displayVariables();
        
        System.out.println("checking obj1 after modifying obj2:");
        obj1.displayVariables();
    }
}