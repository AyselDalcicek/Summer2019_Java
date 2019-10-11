package day31_javaReview;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp_MaxAndMin__MultiD {
	
	public static void main(String[] args) {
		
	    /*
	     
	     
	     */
	        
	    //  ask user to enter numbers and find the maximum and minimum numbers
	        Scanner scan = new Scanner(System.in);
	        System.out.println("How many numbers would you like to add?");
	        int number = scan.nextInt();
	        
	        int[] arr = new int[number];
	        
	        
	    for(int i=0; i < arr.length; i++) {     // length yerine number yazabiliriz. 
	        System.out.println("Enter a number: ");
	             arr[i] =  scan.nextInt();  // user input
	    }
	             
	    /*       Boyle yazmak yerine loop kullanmak daha kisa.
	        System.out.println("Enter a number: ");
	             arr[1] =  scan.nextInt();  // user input  
	             
	        System.out.println("Enter a number: ");
	             arr[2] =  scan.nextInt();  // user input 
	        */
	        
	         System.out.println( Arrays.toString(arr) );
	          
	          Arrays.sort(arr); 
	          System.out.println("Minimum value: "+arr[0]);
	          System.out.println("Maximum Value: "+arr[ arr.length-1 ]);
	             
	             for(int each: arr) {
	            	 System.out.print(each);
	             }
	        
	}

}
