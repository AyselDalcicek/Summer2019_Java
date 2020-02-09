package WarmUp;

import java.util.Arrays;

public class WarmUp_ArrayInDescending {
	
	/*
	 *write a method 
	 */
 
	public static void main(String[] args) {
		
		int[] arr = {0, -1, 1000, 2000, 5000};
		SortDes(arr);
	}
	
	 public static void SortDes(int[] array) {
		 
		 // array ={10,8,99,0,-1}; 
		 Arrays.sort(array); // ={{-1,0,8,10,99}
		 for(int i =array.length-1; i>=0; i-- ) {
			 System.out.println(array[i]+" ");
		 }
		 
		 
	 }
}
