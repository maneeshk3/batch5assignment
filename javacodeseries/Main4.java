package javacodeseries;

public class Main4 {
	public static void main(String[]args) {
		//primitive data type
		int x=10;
		System.out.println("Before:"+x);
		changeValue(x);
		System.out.println("After:"+x);
		//non-primitive
		Person person=new Person("John");
		System.out.println("Before:"+person.getName());
		changeName(person);
		System.out.println("After:"+person.getName());
		
		
	}
	
	static void changeValue(int x) {
		x=20;
	}
	static void changeName(Person person) {
		person.setName("Jane");
	}
}
class Person{
	private String name;
	
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;	
		// TODO Auto-generated method stub
		
	}

}