package javacodeseries;

public class Personntw {
	String name;
	int age;
	String address;
	
	public Personntw() {
		this.name="";
		this.age=0;
		this.address="";
	}
	public Personntw(String name,int age,String address) {
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
		
		public static void main(String[]args) {
			
			Personntw personntw1 = new Personntw();
			personntw1.setInfo("John Doe",30,"123 Main St");
			personntw1.displayInfo();
			
			Personntw Personntw2 = new Personntw("Jane Smith",25,"457 Elm St");
			Personntw2.displayInfo();
			
			Personntw2.setInfo("Jane DOE",26,"789 Oak St");
			Personntw2.displayInfo();
		
		}
	}
