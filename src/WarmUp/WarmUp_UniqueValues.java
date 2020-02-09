package WarmUp;

import java.util.Scanner;

public class WarmUp_UniqueValues {
	
	/*Write a program that can print out the unique values from an int Array.
	 *if arr -->{1,1,2,3,3}
	 *output: 2
	  *if arr -->{1,2,2,3,4,4}
	 *output: 1 3 
	 
	 */
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,2,2,2,2,2,3,4,4,8,7,9,1};
		
		for(int j=0; j<arr.length; j++) {
		int count= 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i]==arr[j]) {
				count++;
			}
			
		}
		if(count==1) {
			System.out.println(arr[j]);
		}
		}
	
		
		
		
			
		
		
	}
}