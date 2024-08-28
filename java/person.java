<<<<<<< HEAD

import java.util.*;
class person
{ 
 int age;
 String name, address;

 
 person() {
 
  age = 24;
  name ="Nani";
  address = "Vizag";
 }

 person( String name1, int age1, String address1)
 {
	name = name1;
	age = age1;
	address = address1;
 }

 public void per(){
 System.out.println(name + '\n'+ age +'\n' + address);
 
 }

public static void main (String args[])
{
person newperson1 = new person();
person newperson2 = new person("Dinesh", 22, "Mumbai");

=======
import java.util.*;
class person
{ 
 int age;
 String name, address;

 
 person() {
 
  age = 24;
  name ="Nani";
  address = "Vizag";
 }

 person( String name1, int age1, String address1)
 {
	name = name1;
	age = age1;
	address = address1;
 }

 public void per(){
 System.out.println(name + '\n'+ age +'\n' + address);
 
 }

public static void main (String args[])
{
person newperson1 = new person();
person newperson2 = new person("Dinesh", 22, "Mumbai");

>>>>>>> cf39d31e392aa547fe02e14e12aa1514ca02eefc
 newperson1.per();
 newperson2.per();
 
}
}
