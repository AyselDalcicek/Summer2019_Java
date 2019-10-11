package day31_javaReview;

import java.util.Arrays;

public class Array_MultiDimensional {
	
	  /*
    n dimensional array: contains (n-1) dimensional arrays
   
   */
  
	
	public static void main(String[] args) {
		
		
		int[] arr1D = {1,2,3};
		
		 // index:          0 1 2     0 1 2
        int[][] arr2D = { {1,2,3} , {4,5,6}  };
        // index:            0         1
		
		System.out.println(arr2D.length ); //2
		

        //[index num of 1D arrays][index num of each values]
        
		// print: 2
		System.out.println(arr2D[0][1]);  // 2
		
		// print: {4,5,6}
		System.out.println(arr2D[1]); // [I@24d46ca6
		System.out.println(Arrays.toString(arr2D[1]));  // [4, 5, 6]
		
		// print:{ {1,2,3},{4,5,6} }
		System.out.println(arr2D); // hashcode
		System.out.println(Arrays.toString(arr2D)); // hashcode
			

	    	//  Arrays.deepToString(variableName):  converts multi dimensional arrays to String
		
			System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5, 6]]
			String str = Arrays.deepToString(arr2D);
			System.out.println(str);  // [[1, 2, 3], [4, 5, 6]]
			
					
					
					System.out.println("----------------------------");
					
				char[] ch = {'a', 'b', 'c', 'd'};
				
				for( char each: ch) {
					System.out.print(each+" ");  // a b c d 
				}
				System.out.println();
				
				
						char[] ch2 = {'a', 'b', 'c', 'd', 'c', 'e'};
				
						for( char each: ch2) {
							if(each=='c') {
								continue;
		//   System.out.print(each + " ");  // as soon as continue statement is executed, it skips the next statement
							}
							System.out.print(each+" ");   // a b d e
						}
						System.out.println();
						
					System.out.println("----------------------------");
					
					
			
			
			String[][] names= {{"Erhan", "Holy", "Denis","John-Snow", "Tarzan"}, {"Muhtar", "Mike", "Asiya", "Dilyar", "Nadira"} };
			
				//          0                                                   1
				for( String[] each1D   :  names ) {
				 //  System.out.println( Arrays.toString(  each1D )  );
					
				for(String eachValue : each1D) {
					if(eachValue.equals("Holy") || eachValue.equals("John-Snow")) {
						continue;
					}
					System.out.print(eachValue+" "); // Erhan Denis Tarzan Muhtar Mike Asiya Dilyar Nadira 
				
				}
			}
			
	}

}
