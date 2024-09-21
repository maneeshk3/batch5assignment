/*Question 1:
    Write a Java program where you create a superclass Animal with a method makeSound(). 
    Create two subclasses, Dog and Cat, that inherit from Animal and override the makeSound() method to print Woof and Meow respectively. 
    
    In the main() method:
        Declare a Animal reference and assign it objects of both Dog and Cat.
        Call the makeSound() method using the Animal reference for both instances and observe how dynamic method dispatch works.
*/



// Superclass Animal
class Animal {
    public void makeSound(){
        System.out.println("animal sounds");
    }
}

// Subclass Dog
class Dog extends Animal {
    
    public void makeSound() {       //overide Makesoundmethod from super class Animal
        System.out.println("Woof");
    }
}

// Subclass Cat
class Cat extends Animal {
		public void makeSound() { //overide Makesoundmethod from super class Animal
        System.out.println("Meow");
    }
}

public class AnimalSoundDemo {   //  demonstrate dynamic method dispatch using main class Animal
    public static void main(String[] args) {
        // Declare Animal reference and assign Dog object
        Animal dog = new Dog();
        
        // Declare Animal reference and assign Cat object
        Animal cat = new Cat();
        
        // Call makeSound() method for both instances
        System.out.println("dog sound:");
        dog.makeSound();
        
        System.out.println("cat sound:");
        cat.makeSound();
    }
}