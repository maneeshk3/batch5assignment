
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
		p1.setinfo("Virat",32,"viratbhai123@gmail.com");
		p1.printinfo();
	}
}