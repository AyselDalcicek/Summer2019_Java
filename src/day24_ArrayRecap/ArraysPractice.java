package day24_ArrayRecap;

import java.util.Scanner;

public class ArraysPractice {
	
	public static void main(String[] args) {
	    /*
	     ask user to enter five numbers,  then find the sum of 
	     those five numbers.
	     
	            MUST use Array
	     
	     */ int sum ;
	        int[] numbers = new int[5];
	        Scanner scan = new Scanner(System.in);
	        
	        for(int i= numbers.length -1 ; i >= 0; i--) {
	            System.out.println("Enter a number");
	                numbers[i] = scan.nextInt(); 
	                // assign user inputs to the Array's indexes
	        }
	        
	        
	       
	        for(int i=0; i < numbers.length; i++) {
	                System.out.print(numbers[i]+" ");
	        
	        }
	        
	        System.out.println();    // videodan bak, hepsinin toplamini bulmayi
	        
	       
	}
}
