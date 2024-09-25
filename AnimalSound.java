/*
Question 1:
    Write a Java program where you create a superclass Animal with a method makeSound(). 
    Create two subclasses, Dog and Cat, that inherit from Animal and override the makeSound() method to print Woof and Meow respectively. 
    
    In the main() method:
    Declare a Animal reference and assign it objects of both Dog and Cat.
    Call the makeSound() method using the Animal reference for both instances and observe how dynamic method dispatch works.
*/


class Animal{
    
    public void makeSound(){
        System.out.println("Animal Sound is :");
    }
    
}

class Dog extends Animal{
    
    @Override
    public void makeSound(){
        System.out.println("Animal Sound is : Woof");
    }
    
}

class Cat extends Animal{
    
    @Override
    public void makeSound(){
        System.out.println("Animal Sound is : Meow");
    }
}

class AnimalSound{
    public static void main(String args[]){
        Dog animalone = new Dog();
        animalone.makeSound();
        
        Cat animaltwo = new Cat();
        animaltwo.makeSound();
    }
}