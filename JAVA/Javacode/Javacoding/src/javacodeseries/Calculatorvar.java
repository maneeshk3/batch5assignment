package javacodeseries;

public class Calculatorvar {
	public static void calculateLCMAndHCF(int...numbers) {
		int lcm=numbers[0];
		int hcf=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			lcm=lcm(numbers[i],lcm);
			hcf=hcf(numbers[i],hcf);
		}
		System.out.println("LCM:"+lcm);
		System.out.println("HCF:"+hcf);
	}
	private static int lcm(int a,int b) {
		return(a*b)/hcf(a,b);
	}
	private static int hcf(int a,int b) {
		if(b==0) {
			return a;
		}
		return hcf(b,a%b);
	}
}