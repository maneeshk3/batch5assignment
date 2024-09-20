 
 import java.util.*;
 class animal_test{
	 public static void main (String args[])
	 {
		animal obj = new animal();
		dog obj1 = new  dog();
		cat obj2 = new cat();
		
		animal obj3;
		
		obj3 = obj1;
		
		obj3.makesound();
		
		obj3 = obj2;
		
		obj3.makesound();
	 }
 }