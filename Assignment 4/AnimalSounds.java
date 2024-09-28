
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

public class AnimalSounds {   //  demonstrate dynamic method dispatch using main class Animal
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