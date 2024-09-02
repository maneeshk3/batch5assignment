import java.util.Scanner;
public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the value for sum of natural numbers");
        int n = num.nextInt();        
        int sum = (n * (n + 1)) / 2;
        System.out.println("The sum of the first " + n + " natural numbers is" + sum);
        num.close();
    }
}
