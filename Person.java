import java.util.*;
class Person
{
    String name;
    int age; 
    String address;
    Person()
    {
      name="Suriya";
      age=23;
      address="Chennai";
    }
    Person(String name1, int age1, String address1)
    {
        name=name1;
        age=age1;
        address=address1;
    }
    public void setInfo(String name, int age, String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
        System.out.println("Person Name : " + name);
        System.out.println("Person Age : " + age);
        System.out.println("Person Address : " + address);
    }
    public void displayInfo()
    {
        System.out.println("Person Name : " + name);
        System.out.println("Person Age : " + age);
        System.out.println("Person Address : " + address);
    }
    public boolean isAdult()
    {
      return age>=18;
    }
    
    public static void main(String[] args) 
    {
       Person p1 = new Person();
       Person p2 = new Person("Sonu", 24, "Trichy");
       p1.displayInfo();
        if (p1.isAdult()) {
            System.out.println(p1.name + " is an adult.");
        } else {
            System.out.println(p1.name + " is not an adult.");
        }
       p2.displayInfo();
        if (p2.isAdult()) {
            System.out.println(p2.name + " is an adult.");
        } else {
            System.out.println(p2.name + " is not an adult.");
        }
       p1.setInfo("Uma", 17, "Chennai");
       if (p1.isAdult()) {
            System.out.println(p1.name + " is an adult.");
        } else {
            System.out.println(p1.name + " is not an adult.");
        }
    }
}
