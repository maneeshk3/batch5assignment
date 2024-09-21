
class Bird {
    
    public void fly() {
        System.out.println("Bird is flying...");
    }
}


class Eagle extends Bird {
    
    @Override
    public void fly() {
        
        super.fly();
        
        System.out.println("Eagle is flying high...");
    }
}

// Main class 
public class BirdTest {
    public static void main(String[] args) {
        
        Eagle eagle = new Eagle();
        
        eagle.fly();
    }
}
