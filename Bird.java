class Bird{
    void fly(){
        System.out.println("Bird is flying...");
    }
}
class Eagle extends Bird{
    
    void fly(){
        super.fly();
        System.out.println("Eagle is flying high...");
    }
}
public class Main{
    public static void main(String args[]){
        Eagle obj = new Eagle();
        obj.fly();
    }
}
