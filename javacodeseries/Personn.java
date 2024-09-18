package javacodeseries;

public class Personn {
	String name;
	int age;
	String address;
	
	public Personn() {
		this.name="";
		this.age=0;
		this.address="";
	}
	public Personn(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
	public static void main(String[]args) {
		Personn personn1=new Personn();
		personn1.name="John Doe";
		personn1.age=30;
		personn1.address="123 Main St";
		personn1.displayInfo();
		
		Personn personn2 = new Personn("Jane Smith",25,"ELM St");
		}
		
	}

