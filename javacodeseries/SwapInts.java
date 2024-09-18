package javacodeseries;

public class SwapInts {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		
		System.out.println("Before swap:a="+a+",b="+b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swap with temp:a="+a+",b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap without temp:a="+a+",b="+b);
		

	}

}
