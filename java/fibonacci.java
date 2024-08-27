import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fibonacci series");
        int n =sc.nextInt();
        int first = 0,second = 1;
        System.out.println("fibonacci series up to "+ n +"terms");
        for (int i = 1; i <= n; i++){
            System.out.println(first+"");
            int next = first + second;
            first = second ;
            second = next;
        } 
        
    }
}