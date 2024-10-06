public class Person{
	
	String FirstName; 
	String LastName;
	String Address;
	String Email;
	String Gender;
	int Age;
	
			 
	public Person(){
		this.FirstName = "Virat";
		this.LastName = "Kohli";
		this.Address = "UK";
		this.Email = "howtowinipl@gmail.com";
		this.Gender = "Male";
		this.Age = 35;
	}
	
		 
	public Person(String FirstName,String LastName,String Address,String Email,String Gender,int Age){
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Address = Address;
		this.Email = Email;
		this.Gender = Gender;
		this.Age = Age;
	}
	
			 
	public void displayInfo(){
		System.out.println("Deatils of Person");
		System.out.println(FirstName +"\n"+ LastName +"\n"+ Address +"\n"+ Email +"\n"+ Gender +"\n"+ Age);
	}
	

	public void setinfo(String firstname,String lastname, String address,String mail,String gender,int age){
		this.FirstName = firstname;
		this.LastName = lastname;
		this.Address = address;
		this.Email = mail;
		this.Gender = gender;
		this.Age = age;
	}


	public boolean isAdult(){
		return this.Age>18;
	}
	
	
	public static void main(String[] args){
		Person Demo_One = new Person();
		Person Demo_Two = new Person("Dhoni","Thala","Farmhouse","Wc91@","Male",42);
		Demo_One.displayInfo();
		Demo_Two.displayInfo();

		Demo_Two.setinfo("Suresh", "Raina", "India", "sr@", "M", 38);
		Demo_Two.displayInfo();


		Demo_One.isAdult();
		Demo_Two.isAdult();

	}
	
}