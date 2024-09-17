
public class FibonacciSeries{
	
	public static int fibonacci(int num){
		if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
	}
	
	public static void main(String[] args){
		
		int n1 = 10;
		for(int i=0;i<=n1;i++){
			System.out.println(fibonacci(i));
		}
	}
}