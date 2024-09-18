package javacodeseries;

public class Personntw3 {
	String name;
	int age;
	String address;
	
	public Personntw3() {
		this.name="";
		this.age=0;
		this.address="";
	}
	public Personntw3(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
	public void setInfo(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public boolean isAdult() {
	return this.age>=18;
	}
	
		public static void main(String[]args) {
			
			Personntw3 Personntw31 = new Personntw3();
			Personntw31.setInfo("John Doe",30,"123 Main St");
			Personntw31.displayInfo();
			System.out.println("Is adult?"+Personntw31.isAdult());
			
			
			Personntw3 Personntw32 = new Personntw3("Jane Smith",25,"457 Elm St");
			Personntw32.displayInfo();
			
			Personntw32.setInfo("Jane DOE",26,"789 Oak St");
			Personntw32.displayInfo();
			System.out.println("Is adult?"+Personntw32.isAdult());
		}
	}
