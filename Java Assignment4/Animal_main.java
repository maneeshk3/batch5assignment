class Animal{
	void makesound(){
		System.out.println("Animal makes a sound");
	} 
}

class Dog extends Animal {
	void makesound(){
		System.out.println("Woof");
	}
}

class Cat extends Animal {
       void makesound(){
		System.out.println("Meow");
	}
}
public class Animal_main {
    public static void main(String args[]){
      
	  Animal Obj;
        Obj = new Animal();
        Obj.makesound();
        Obj = new Dog();
        Obj.makesound(); 
        Obj = new Cat();
        Obj.makesound();
    }
}
