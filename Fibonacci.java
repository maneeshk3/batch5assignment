import java.util.Scanner;
public class Fibonacci{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print: ");
        int i=sc.nextInt();
        
        if(i==0 || i<0){
            System.out.println("enter a valid number or greater than zero ");
        }
        else if(i==1){
            System.out.print("The Fibonacci numbers are: ");
            System.out.println("1");
        }
        else if(i==2){
            System.out.print("The Fibonacci numbers are: ");
            System.out.println("1,1");
        }
        else{
            int n=3;
            int a=1,b=1,c;
            System.out.print("The Fibonacci numbers are: ");
            System.out.print(a+" "+b+" ");
            while(n<=i){
                n++;
                c=a+b;
                
                System.out.print(c+" ");
             
                a=b;
                b=c;
                
            }
            
        }
                
        sc.close();    
        
    }
}

































































