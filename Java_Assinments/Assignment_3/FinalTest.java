// Question 9:
// Write a java program to demonstrate the use of final keyword with variable, method
// and classes. Understand and study the difference b/w a final and a regular variable,
// methhod and classes.

import java.util.*;

   // A final class cannot be subclassed
final class FinalClass 
{
    public void show() 
	{
        System.out.println("\nconclusion:\nFinal variable value cannot be changed once assigned.");
        System.out.println("A final method cannot be overridden.");
        System.out.println("final class cannot be inherited.");
	}
}
		// error: cannot inherit from final FinalClass
		// class RegularClass extends FinalClass 
	class RegularClass
{
	
    
    final int a = 100;
    int b = 50;

    
    public final void finalMethod() 
	{
        System.out.println("This is a final method.");
    }
    public void regularMethod() 
	{
        System.out.println("This is a regular method.");
    }
}


class SubClass extends RegularClass 
{
  
 // error: finalMethod() in SubClass cannot override finalMethod() in RegularClass
    // public void finalMethod() 
	// {
			 // System.out.println("This is a final method.");
	// }

    public void regularMethod() 
	{
        System.out.println("This is an overridden regular method.");
    }


}

class FinalTest 
{
    public static void main(String[] args) 
	{
        System.out.println("Demonstrating final and regular variables");
        RegularClass obj1 = new RegularClass();
        System.out.println("final variable (before change): " + obj1.a);
        System.out.println("Regular variable (before change): " + obj1.b);
        obj1.b = 60;  
        //obj1.a = 30; //error: cannot assign a value to final variable a 
        System.out.println("Regular variable (after change): " + obj1.b);
		System.out.println("final variable (after change): " + obj1.a); //error


        System.out.println("\nDemonstrating final and regular methods.");
        obj1.finalMethod();  
        obj1.regularMethod();  

         
        System.out.println("\nUsing the subclass to demonstrate method overriding.");
        SubClass obj2 = new SubClass();
        obj2.finalMethod();  // Still calls the final method from parent class
        obj2.regularMethod();  // Calls the overridden method in SubClass

        
        FinalClass Obj3 = new FinalClass();
        Obj3.show(); 
    }
}
