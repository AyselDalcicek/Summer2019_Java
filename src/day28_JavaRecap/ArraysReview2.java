package day28_JavaRecap;

import java.util.Arrays;

public class ArraysReview2 {
	
	public static void main(String[] args) {
		
		/*
        Arrays Util class:  toString() , sort(), deepToString()
           
               toString(): converting single dimensional array to String
               sort(): sorting single dimensional array in ascedning order
               deepToString(): converting Mulit-Dimensional array to String
        */
		
		// sort():
		long[] Longarr = {20, 400, 500, 300, 10, 20};
		System.out.println(Arrays.toString(Longarr)); // [20, 400, 500, 300, 10, 20]
								// I we do not use sort method
		
		Arrays.sort(Longarr);   
		System.out.println(Arrays.toString(Longarr));  // [10, 20, 20, 300, 400, 500]
		
		
		
				System.out.println("---------------------------------------");
	
		
		
		// deepToString():
		
		int[][] arr2D = { {1,2}, {3,4} } ;
		//   index          0      1
		
		System.out.println(Arrays.toString(arr2D));  // [[I@4517d9a3, [I@372f7a8d]
										   // because arrays.toString cannot convert MD arrays to String
		
		System.out.println(Arrays.deepToString(arr2D)); // [[1, 2], [3, 4]]
		
		
		
				System.out.println("-----------------------------------------");
				
		
		// in 2D array: [index number of 1D arrays][index number of values]
		        
		
		// print :{3,4}
		System.out.println(arr2D[1]); // [I@372f7a8d ==> needs to be converted to String
		System.out.println(Arrays.toString(arr2D[1]));  // [3, 4]
		
		// print :4
        System.out.println(arr2D[1][1]); //4
		
		// arr2D = { {1,2}, {3,4} } ;
		for(int[]each1DArray: arr2D) {
			for(int eachValue : each1DArray) {
				System.out.print(eachValue);  // 1234
			}
			
			 // System.out.println(Arrays.toString(each1DArray)); //  [3, 4]
		}
		
	}

}
