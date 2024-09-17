package javacodeseries;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseArray {
	public static void reverseArray(int[]arr) {
	
	int left=0;
	int right=arr.length-1;
	while(left<right) {
		int temp=arr[left];
		arr[left]=temp;
		left++;
		right--;
		
	}
	int[]myArray= {1,2,3,4,5};
	reverseArray(myArray);
	System.out.println(Arrays.toString(myArray));
	}
}
   
