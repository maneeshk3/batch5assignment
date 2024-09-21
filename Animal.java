class Animal{
    public void makeSound(){
        System.out.println("Animals make sound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof......");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow......");
    }
}
public class Main{
    public static void main(String args[]){
        Animal obj;
        obj = new Dog();
        obj.makeSound();
        
        obj = new Cat();
        obj.makeSound();
    }
}
