/*
Create a Person class with Private attributes name, age, email address.
Write a method which will set the values of these instance variable as these
cant be access as Object.age etc...
Write another method to print the values of these instance variable..
Also try to udpate the name using Object.name = ''; and study the exception you get.
*/

public class Personclass {
    
    private String name;
	private String email;
    private int age;

    public void setinfo(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void printinfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
    }
	
	public static void main(String[] args){
		Personclass p1 = new Personclass();
		p1.setinfo("James",35,"gmail.com");
		p1.printinfo();
	}
}