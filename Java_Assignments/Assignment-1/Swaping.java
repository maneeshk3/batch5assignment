import java.util.Scanner;
public class Swaping {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number for swapping : ");
        int firstnum = num.nextInt();
        System.out.print("Enter second number for swapping: ");
        int secondnum = num.nextInt();
        // Swap the two numbers using temp variable        
        int temp = firstnum;
        firstnum = secondnum;
        secondnum = temp;
        
        System.out.println("After swaping the two numbers with temp  " + firstnum + " , "  + secondnum);
        
        // Swap the two numbers without using temp variable
        
        firstnum = firstnum + secondnum;
        secondnum = firstnum - secondnum;
        firstnum = firstnum - secondnum;
        
        System.out.println("After swaping two numbers without temp  = " + firstnum + ", " + secondnum);
        
        num.close();
    }
}
