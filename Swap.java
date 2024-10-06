public class Swap {

 public static void main(String[] args) {

  int x = 10;
  int y = 20;

  System.out.println("Before Swapping");
  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);

  //add both the numbers and assign it to first
  x = x + y;             // x=30
  y = x - y;             //y=30-20=10
  x = x - y;             //x-y=20, x=20

  System.out.println("Before Swapping");
  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);
 }
}
