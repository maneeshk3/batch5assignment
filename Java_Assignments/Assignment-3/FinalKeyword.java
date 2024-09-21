/*Question 9:
Write a java program to demonstrate the use of final keyword with variable, method
and classes. Understand and study the difference b/w a final and a regular variable,
methhod and classes.
 */

//define the class as final
final class FinalClass {
 // This class cannot be extended
 void display() {
     System.out.println("This is a final class");
 }
}

//define regular class
class RegularClass {
 // define final variable
 final int FINAL_VALUE = 100;
 // regular variable
 int regularValue = 200;

 // define final method
 final void finalMethod() {
     System.out.println("This is a final method");
 }

 // define regular method
 void regularMethod() {
     System.out.println("This is a regular method");
 }
}

//this class extends RegularClass
class SubClass extends RegularClass {
 //override the regularMethod() this is allowed
 void regularMethod() {
     System.out.println("This is an overridden regular method");
 }

 // This would cause a compilation error
 //override finalMethod
 //void finalMethod() { }  //uncomment this method if see the error
}

public class FinalKeyword {
 public static void main(String[] args) {
     // implement the final variable
     RegularClass obj = new RegularClass();
     System.out.println("Final variable value is  " + obj.FINAL_VALUE);
     System.out.println("Regular variable value is  " + obj.regularValue);

     // obj.FINAL_VALUE = 200; // this would cause a compilation error if uncommented
     obj.regularValue = 300;  // this is allowed

     System.out.println("modified regular variable value is  " + obj.regularValue);

     // implementing final method
     obj.finalMethod();
     obj.regularMethod();

     // implementing subclass behavior
     SubClass subObj = new SubClass();
     subObj.regularMethod();
     subObj.finalMethod(); // This calls the final method from the superclass

     // implementing final class
     FinalClass finalObj = new FinalClass();
     finalObj.display();
     
     // class SubFinalClass extends FinalClass { }    //get compilation error if uncommented
 }
}
