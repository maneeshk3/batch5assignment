class Finaltest 
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