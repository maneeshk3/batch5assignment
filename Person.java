public class Person{
	
	String First_Name,Last_Name,Address,Email,Gender;
	int Age;
	
	public Person(){
		this.First_Name = "Rohit";
		this.Last_Name = "Rohit";
		this.Address = "Bangalore India";
		this.Email = "rohit@gmail.com";
		this.Gender = "Male";
		this.Age = 26;
	}
	
	public Person(String First_Name,String Last_Name,String Address,String Email,String Gender,int Age){
		this.First_Name = First_Name;
		this.Last_Name = Last_Name;
		this.Address = Address;
		this.Email = Email;
		this.Gender = Gender;
		this.Age = Age;
	}
	
	public void displayInfo(){
		System.out.println("The details of the person are as Shown Below");
		System.out.println(First_Name +"\n"+ Last_Name +"\n"+ Address +"\n"+ Email +"\n"+ Gender +"\n"+ Age);
	}
	
	public static void main(String[] args){
		Person User1 = new Person();
		Person User2 = new Person("ABC","XYZ","IN","Gmail","Male",25);
		User1.displayInfo();
		User2.displayInfo();
	}
	
}