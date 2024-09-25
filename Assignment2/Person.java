public class Person{
	
	String First_Name,Last_Name,Address,Email,Gender;
	int Age;
	
	//Question 1		 
	public Person(){
		this.First_Name = "Rohit";
		this.Last_Name = "Rohit";
		this.Address = "Bangalore India";
		this.Email = "rohit@gmail.com";
		this.Gender = "Male";
		this.Age = 26;
	}
	
	//Question 1		 
	public Person(String First_Name,String Last_Name,String Address,String Email,String Gender,int Age){
		this.First_Name = First_Name;
		this.Last_Name = Last_Name;
		this.Address = Address;
		this.Email = Email;
		this.Gender = Gender;
		this.Age = Age;
	}
	
	//Question 1		 
	public void displayInfo(){
		System.out.println("The details of the person are as Shown Below");
		System.out.println(First_Name +"\n"+ Last_Name +"\n"+ Address +"\n"+ Email +"\n"+ Gender +"\n"+ Age);
	}
	
	//Question 2
	public void setinfo(String firstname,String lastname, String address,String mail,String gender,int age){
		this.First_Name = firstname;
		this.Last_Name = lastname;
		this.Address = address;
		this.Email = mail;
		this.Gender = gender;
		this.Age = age;
	}

	//Question 3
	public boolean isAdult(){
		return this.Age >18;
	}
	
	
	public static void main(String[] args){
		Person User1 = new Person();
		Person User2 = new Person("ABC","XYZ","IN","Gmail","Male",25);
		User1.displayInfo();
		User2.displayInfo();
		System.out.println("Question 1 Completed");
		System.out.println("*".repeat(100));

		System.out.println("Updating the user details.");
		User2.setinfo("google", "java", "india", "gmail.com", "M", 26);
		User2.displayInfo();

		System.out.println("Details updated Question 2 completed");
		System.out.println("*".repeat(100));

		System.out.println("Audit check of the age");
		User1.isAdult();
		User2.isAdult();
		System.out.println("Audit check of the age completed");
		System.out.println("*".repeat(100));
	}
	
}
