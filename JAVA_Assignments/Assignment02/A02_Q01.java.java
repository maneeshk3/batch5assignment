import java.util.*;
class person
{ 
 int age;
 String name, address;

 
 person() {
 
  age = 27;
  name ="Asna";
  address = "maharashtra";
 }

 person( String name1, int age1, String address1)
 {
	name = name1;
	age = age1;
	address = address1;
 }

 public void displayinfo(){
 System.out.println(name + '\n'+ age +'\n' + address);
 
 }

public static void main (String args[])
{
person newperson1 = new person();
person newperson2 = new person("Maheen", 28, "maharashtra");

 newperson1.displayinfo();
 newperson2.displayinfo();
 
}
}