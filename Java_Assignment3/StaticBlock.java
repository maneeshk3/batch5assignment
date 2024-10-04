public class StaticBlock {
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
    public StaticBlock() {
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
        StaticBlock obj1 = new StaticBlock();
        obj1.displayVariables();
        
        System.out.println("modifying variables through obj1 ");
        obj1.staticVar1 = 50;
        obj1.staticVar2 = 100;
        obj1.instanceVar1 = 10;
        obj1.instanceVar2 = 15;
        obj1.displayVariables();
        
        System.out.println("creating second object as obj2 ");
        StaticBlock obj2 = new StaticBlock();
        obj2.displayVariables();
        
        System.out.println("modifying variables through obj2 ");
        obj2.staticVar1 = 100;
        obj2.staticVar2 = 200;
        obj2.instanceVar1 = 150;
        obj2.instanceVar2 = 250;
        obj2.displayVariables();
        
        System.out.println("checking obj1 after modifying obj2:");
        obj1.displayVariables();
    }
}