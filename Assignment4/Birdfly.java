/*
Question 4:
    Create a superclass Bird with: A method fly() that prints: Bird is flying....
    
    Create a subclass Eagle that: Overrides the fly() method to print: Eagle is flying high..
    In the overridden fly() method, use super.fly() to also call the fly() method of the superclass.
    
    In the main() method: Create an Eagle object and call the fly() method. Ensure both superclass and subclass methods are called.

*/

class Bird{
    
    public void fly(){
        System.out.println("Bird is Flying......");
    }
}


class Eagle extends Bird{
    
    @Override
    public void fly(){
        super.fly();
        System.out.println("Eagle is Flying high ......");
    }
    
}

public class Birdfly
{
	public static void main(String[] args) {
		Eagle bird1 = new Eagle();
		bird1.fly();
	}
}