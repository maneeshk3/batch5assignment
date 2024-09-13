// Question 7:
// Create a Person class with Private attributes name, age, email address.
// Write a method which will set the values of these instance variable as these
// cant be access as Object.age etc...
// Write another method to print the values of these instance variable..
// Also try to udpate the name using Object.name = ''; and study the exception you get.

class person{
	 private String name;
	 private int age;
	 private String email_address;
	 
	void setinfo(String name,int age,String email_address )
	{
		this.name = name;
		this.age = age;
		this.email_address = email_address;
		
	}
	
	public void displayinfo()
	{
		System.out.println("Name: "+name);	
		System.out.println("Age: "+age);	
		System.out.println("Email: "+email_address);	
	}
	
	
	public static void main (String args[])
	{
		person object = new person();
		
		object.setinfo("Maheen",28,"aspirantk");
		object.name = "Asna";
		object.displayinfo();
	
	}
	
}