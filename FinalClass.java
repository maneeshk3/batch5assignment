/*
Write a java program to demonstrate the use of final keyword with variable, method
and classes. Understand and study the difference b/w a final and a regular variable,
methhod and classes.
*/

final class FinalClass {
    
	//we cannot modify this variable in future code
    final double pie = 3.14;
	
	//we can modify this variable in future code
    int num1 = 20;

    
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public void regularMethod() {
        System.out.println("This is a regular method.");
    }
	
	public static void main(String[] args){
		FinalClass fc = new FinalClass();
		System.out.println(fc.pie);
		System.out.println(fc.num1);
		fc.regularMethod();
		fc.finalMethod();
		
	}
}