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

