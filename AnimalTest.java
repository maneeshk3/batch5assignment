public Class Animal{
	void makeSound(){
		System.out.println("The animal makes a sound.");
	}
}
public Class Dog extends Animal{
	@Override
    
    public void makeSound() {
        
        System.out.println("The dog sounds woof.");
}
	
}

public Class Cat extends Animal{
	@Override
    
    public void makeSound() {
        
        System.out.println("The cat sounds Meow");
}
public class AnimalTest {
public static void main String[]args{
	 Animal animal = new Animal();
        
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.makeSound();
        // Call the makeSound method on the cat instance
        cat.makeSound();
		dog.makeSound();
}
}
