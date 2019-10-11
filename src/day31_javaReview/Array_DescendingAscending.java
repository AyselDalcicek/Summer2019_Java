package day31_javaReview;

import java.util.Arrays;

public class Array_DescendingAscending {
	
	public static void main(String[] args) {
		
		
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
