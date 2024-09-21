import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = num.nextInt();
        
        int firstnum = 0, secondnum = 1, thirdnum;
        System.out.println(firstnum);
        System.out.println(secondnum);
        for (int i=2; i<=n; i++) 
        {
            thirdnum=firstnum+secondnum;
            System.out.println(thirdnum);
            firstnum = secondnum;
            secondnum=thirdnum;
        }
            
        num.close();
    }
}