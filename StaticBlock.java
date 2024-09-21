import java.util.*;
public class StaticBlock {
    
    static int staticVar;
    int instanceVar;
    static {
        staticVar = 10; 
        System.out.println("Static block executed: staticVariable = " + staticVar);
    }
    public StaticBlock(int instanceVar) {
        this.instanceVar = instanceVar;
        System.out.println("Constructor is executed instanceVar = " + this.instanceVar);
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock(5);
        StaticBlock obj2 = new StaticBlock(10);
        obj1.instanceVar = 20;
        StaticBlock.staticVar = 30;
        System.out.println("updating values object 1 instanceVar = " + obj1.instanceVar);
        System.out.println("updating values object 2 instanceVar = " + obj2.instanceVar);
        System.out.println("updating values object 1 staticVar = " + StaticBlock.staticVar);
        System.out.println("updating values object 2 staticVar = " + StaticBlock.staticVar);
    }
}
