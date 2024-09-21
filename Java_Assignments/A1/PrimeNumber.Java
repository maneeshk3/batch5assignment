import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;
public class PrimeNumber {
    Scanner num = new Scanner(System.in);
        System.out.print("Enter the number to print a number is prime or not ");
        int n = num.nextInt();
    int count = 0;
    if (n>1){
    for (int i=1;i<=n;i++){
        if(n%i==0)
            count++;
    }
    if(count==2)
    {
        System.out.println("the given number is Prime");
    } else{
        System.out.println("the given number is not Prime");
    }
}
else System.out.println("the given number is not Prime");
    num.close();
}