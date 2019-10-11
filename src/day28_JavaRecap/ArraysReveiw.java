package day28_JavaRecap;

import java.util.Arrays;

public class ArraysReveiw {
	
	public static void main(String[] args) {
	
	/* single dimensional array:
	   int[] arr1D = {1, 2, 3, 4};
	   int arr1D[] = {1, 2, 3, 4};
	   int arr1D[] = new int[]{1, 2, 3, 4};
	*/
	
	
	// int arr1D[] = new int[]{1, 2, 3, 4};
	int[] arr1D = {1, 2, 3, 4};
	// 	 index  :  0  1  2  4
	
	// initialize the size of 1D array: int[] arr = new int[Length number]
		int[] arr = new int[3];  // [0,0,0]
			// this array can contain three values
			arr[1] =10;			 // [0,10,0]
			arr[0] =30;          // [30,10,0]
			arr[2] =40;			 // [30,10,40]
	//		arr[2] =50;	  Array's size is fixed.
		
		// to print the array:
		System.out.println(Arrays.toString(arr));  // [30, 10, 40]
		
		System.out.println("===================================");
		
		
		
		
		int[] numbers = {10,20,30,40};
		for(int eachValues: numbers) {
			if(eachValues == 20) {
				continue;  // skip every single statements after the continue
			}
			System.out.print(eachValues+" ");  // 10  
			break;  // exist the loop immediately. If we do not write break statement here, print ==> 10 30 40 
		}
		
		
		System.out.println();
		System.out.println("===================================");
		
		
		
		int[] nums = {100, 200, 300, 400};
		for(int i =0; i<nums.length; i++) {
			if(nums[i] == 300) {
				break;
			}
			System.out.print(nums[i]+" ");  // 100 200 
		}
		
		
//		int[] nums = {100, 200, 300, 400};
//		for(int i =0; i<nums.length; i++) {
//			
//			System.out.print(nums[i]+" ");  
//			if(nums[i] == 300) {
//				break;	// 100 200 300 <== if we write the break statement here. 
//			}
//		}
		
		
		
		
		
		
		
		
		}
				
		

}
