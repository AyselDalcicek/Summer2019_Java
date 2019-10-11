package day31_javaReview;

import java.util.Arrays;

public class ArrayReviews {
	
	// Store multiple data to a variable
	// Array's size is fixed
	
	
	public static void main(String[] args) {
		
		
		int num = 10;
		
		// decleration of array:
		int[] arr = {10};  // array has size of 1   [10
								// index     :       0
//			arr[1] = 20; // [10, 10]   array size is fixed
//			System.out.println(arr[1]);
		
		// initializing the array's size:
		
		int[] arr2 = new int[2]; // [0,0] , maximum capacity of the array is 2
		
		System.out.println(arr2[0]);  // 0  default value of int is 0
		System.out.println(arr2[1]);  // 0
	//	System.out.println(arr2[3]);  // there is no index 2 in the array
		
		
			String[] cars = new String[5];  // this array can contain 5 string values
				// {Tesla, Audi, Toyota, jeep, Subaru }
			
			cars[4] = "Subaru";
			cars[2] = "Toyota";
			cars[1] = "Audi";
			cars[3] = "jeep";
			cars[0] = "Tesla";
			
			for(int i = 0; i<=cars.length-1; i++) {
				 System.out.print(cars[i]+" ");    // Tesla Audi Toyota jeep Subaru 
			 }
			System.out.println();
			
			cars = new String[10];
			// {Tesla, Audi, Toyota, jeep, Subaru, "Ford", "Honda", BMW", "Volvo", "Volkswagen"}
			
			cars[5]= "Ford";
			
			 for(int i = 0; i<=cars.length-1; i++) {
				 System.out.print(cars[i]+" ");    // null null null null null Ford null null null null
			 }
			 
			 
	boolean[] bool = {10>9, false, 10==10} ;
	boolean b1 = bool[1];
	System.out.println(b1);
	
	System.out.println(bool);  // [Z@24d46ca6
	
	String str = Arrays.toString(bool); 
	System.out.println(str);   // [true, false, true]
	
			
			  // Arrays.sort( VariableName ): sorts the array in ascending order
		    
		    double[] dArray = { 1000, 900, 800, 700, 600 };
		    
		    System.out.println(Arrays.toString(dArray)); // [1000.0, 900.0, 800.0, 700.0, 600.0]
		    
		    // expected: {600, 700, 800, 900, 1000}
		    
		    Arrays.sort( dArray );  // {600, 700, 800, 900, 1000}
		    
		    System.out.println(Arrays.toString(dArray));
		    
				
				    // print each values of the given array in descending order:
				    int[] numbers = {200, 300, 20, 7890, 40, -9, -100};
				    
				    Arrays.sort(numbers);  // sorts the array in ascending order
				    
				    System.out.println( Arrays.toString( numbers) );
				    
				    String result ="";
				    for(int i = numbers.length - 1;  i  >= 0 ;  i--  ) {
				        result += numbers[i] +", ";
				    }
		    

	 //  result = result.trim();  // if we use substring we won'n need trim
	 // result =  result.replace("-100,", "-100");  ===> it works for this question but substring works for all.
	result = result.substring(0, result.lastIndexOf(",") );  // 
				    
	System.out.println(result);
								    
				    
					 
					
		
	}
	

}
