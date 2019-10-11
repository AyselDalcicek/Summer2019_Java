package day25_ArraysContinue;

import java.util.Arrays;

public class Mutli_DimensionalArray {
	
	public static void main(String[] args) {
		
		/*
	 	n dimensional array contains multiple (n-1) dimensional arrays
	 */
	
		
		int[] arr1D = {1,2,3};
		
	//	2 dimensional array: array that contains multiple 1 dimensional arrays
		
		int[][] arr2D  = {  {1,2,3}  ,  {4,5,6}   };
		
		
		String[] arr = {"A" ,"B"};
		
		//						   0   1       0    1    2
		String[][] str2D  =   {  {"A" ,"B"} ,  {"C" ,"D","E"}     };
		//							 0            1
		
// [represents the index number of 1 dimensional arrays ][ represents the index number of the values]
		
				// print A:
				System.out.println( str2D[0][0] ); // A
				
				// print D:
				System.out.println( str2D[1][1] ); // D
				
				//print E:
				System.out.println(str2D[1][2]);   // E
		
				// print [A ,B]:
				System.out.println( str2D[0] );     // [Ljava.lang.String;@24d46ca6
				System.out.println(  Arrays.toString( str2D[0] ) ); // [A, B]
				
				System.out.println("************************************************");
				
				// print [C, D, E]:
				System.out.println(  str2D[1] );  // [Ljava.lang.String;@4517d9a3
				System.out.println( Arrays.toString( str2D[1] ));  // [C, D, E]
				
				
			//print [[A,B], [C, D, E]]
			System.out.println(  Arrays.toString(str2D) );   // [[Ljava.lang.String;@24d46ca6, [Ljava.lang.String;@4517d9a3]
			System.out.println(  Arrays.deepToString( str2D ) );  // [[A, B], [C, D, E]]
	
			// Arrays.deepToString(variableName ): converts multi-Dimensional Arrays to STring value
			
			
			System.out.println("***************************************************");
			
			
			//              	     0 1       0  1     0  1 
			int[][]  Numbers2D = {	{1,2}  ,  {3, 4} , {5, 6, 7, 8, 9 , 10}  };
			//					       0        1         2
				
			
				// print 6:
			System.out.println( Numbers2D[2][1] ); 
			
				// print 10:
			System.out.println( Numbers2D[2][5] );
								System.out.println("---------------");
				// print {5, 6, 7, 8, 9 , 10}:
			System.out.println(  Numbers2D[2]  );  // [I@2f92e0f4
			System.out.println( Arrays.toString(  Numbers2D[2]  ) ); // [5, 6, 7, 8, 9, 10]
			
				// print the entire 2D array:
			System.out.println(Arrays.deepToString(  Numbers2D )); // [[1, 2], [3, 4], [5, 6, 7, 8, 9, 10]]
				
			System.out.println("================================================");
			
			
				
		// 3 dimensional array contains multiple 2 dimensional arrays
		int[][] Array2D = { {1,2}, {3,4} };
		//							   0      1              0       1
		int[][][]  Array3D =  {    { {1,2}, {3,4} }  ,   { {5, 6}, {7, 8} }    };
//                                       0                          1	
		//[index numbers of 2D array][ index number of 1D array] [ index number of value]

		
			//print 8:
		System.out.println(Array3D[1][1][1]);  // 8
		
		// print {5, 6}:
		System.out.println(  Array3D[1][0] );  // [I@5305068a
		System.out.println( Arrays.toString( Array3D[1][0] ) );  // [5, 6]
		
		System.out.println("================================================");
		
		// print { {5, 6}, {7, 8} }:
		System.out.println( Array3D[1] ); // [[I@1f32e575
		System.out.println( Arrays.toString( Array3D[1] ) );  //  [[I@5305068a, [I@279f2327]
		System.out.println( Arrays.deepToString( Array3D[1] ));  //  [[5, 6], [7, 8]]
		
		
		// print the entire 3d array:
		System.out.println(Arrays.deepToString( Array3D )); //  [[[1, 2], [3, 4]], [[5, 6], [7, 8]]]
			
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
			
		int[][][]  numbers3D = {  { {1,2} } , { {3,4} }   };	
		
		
		
	//	4 dimensional array contains multiple 3 dimensional arrays
	int[][][][] numbers4D = {  {  { {1,2} } , { {3,4} }   }     , {  { {7,8} } , { {9,10} }   }      };	
	
		System.out.println(Arrays.deepToString(numbers4D));  // [[[[1, 2]], [[3, 4]]], [[[7, 8]], [[9, 10]]]]
		System.out.println(Arrays.deepToString(numbers4D[0][0])); // [[1, 2]]
		System.out.println(Arrays.deepToString(numbers4D[0][1])); // [[3, 4]]
		System.out.println(Arrays.deepToString(numbers4D[1][1])); // [[9, 10]]
		System.out.println(Arrays.deepToString(numbers4D[1]));    // [[[7, 8]], [[9, 10]]]
		System.out.println(Arrays.deepToString(numbers4D[0]));    // [[[1, 2]], [[3, 4]]]
		
		
		
		
		
	}
	
	

}
