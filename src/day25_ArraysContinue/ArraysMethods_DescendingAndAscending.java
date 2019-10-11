package day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethods_DescendingAndAscending {
	
	
	public static void main(String[] args) {
		
		/*
		 write a program that can print the arrays in Descending order (largest to smallest)
		 
		 */
		int[]  MyNumbers = { 99,10,200, 3000, 40, 50, 5000};
			Arrays.sort(MyNumbers);
					// MyNumberw -> [10, 40, 50, 99, 200, 3000, 5000]
			//						  0   1   2   3   4    5      6
			
			System.out.println( Arrays.toString(MyNumbers) ); // [10, 40, 50, 99, 200, 3000, 5000]
		
			String result ="[";
			for(int i = MyNumbers.length-1; i  >= 0; i--) {
				
				 result += MyNumbers[i] +", " ;
				
			}
					System.out.println();
					
			result = result.substring(0, result.length()-2)+"]"; 
					
					System.out.println(result);   // [5000, 3000, 200, 99, 50, 40, 10]
		
					System.out.println("--------------------------------------");
					
		int[] arr2 = { 99,10,200, 3000, 40, 50, 5000};
			Arrays.sort(arr2);  //  array will be sorted in Ascending order
		//	arr2 -> [10, 40, 50, 99, 200, 3000, 5000]
			//	      0  1   2    3   4    5     6
			
			int[] Decedning = new int[arr2.length];
			/*
				Descending[0] = arr2[6];
				Descending[1] = arr2[5];
				Descending[2] = arr2[4];
				Descending[3] = arr2[3];
				Descending[4] = arr2[2];
				Descending[5] = arr2[1];
				Descending[6] = arr2[0];
			*/
			
			int z=0;
			for(int i = arr2.length-1; i >=0; i-- ) {
				Decedning[ z ] = arr2[i];
				z++;
			}
			
			System.out.println( "Ascending order: "+ Arrays.toString(arr2));
		
			System.out.println("Descedning order: "+Arrays.toString(Decedning));
					
					
					
					
					
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
