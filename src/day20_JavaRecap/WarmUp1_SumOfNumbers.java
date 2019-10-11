package day20_JavaRecap;

public class WarmUp1_SumOfNumbers {
	
	public static void main(String[] args) {
	
		/*
		 * // 1. find the sum of all numbers between 0 to 100: // 0+1+2+3 ... + 100 //
		 * // 2. find the sum of all even numbers between 0 to 100: // 0+2+4...+100 //
		 * // 3. find the sum of all odd numbers between 0 to 100: // 1+3+5...+99
		 */
	
		 // int sum =1+2+3+4=5...100;
	
			/*
		    for( initialization; condition; iterator){
		    }
		    
		 */
	
		
		// task 01:
		
	       int sum1 = 0;
	       for(int i = 0; i<=100; i++ ) { //  i: 1~100
	    	   sum1+=i;
	       }
	       		System.out.println("The sum is "+sum1);
	        
	    
	       
	     // task 02:
	       
	       int sum2 = 0;
	       for(int i = 0; i <= 100; i+=2 ) {
	         sum2+=i;
	       }
	         System.out.println("sum of all even numbers "+sum2);
	           
	         
	      //second solution:
	         int Sum2=0;
	         for(int i = 1; i <= 100; i++ ) { // i: 1~100
	             if( i%2 == 0) {
	                 sum2 += i;
	             }
	         }
	         System.out.println("sum of all even nums: "+sum2);
	           
	         
	         
	      // task 03:        
	                  
	        int sum3 = 0;            
	        for (int i=1; i<=100; i++) {            
	        	if(i%2==1) {
	              sum3+=i;
	        	}
	            }  
	        	System.out.println("sum of all odd numbers "+sum3);
	            
	           
		
			// second solution:
						
			   int Sum3 = 0;
		       for(int i =1; i <= 100; i +=2 ) {
		           Sum3 +=i; 
		           
		       }
		       System.out.println("sum of all odd numbers: "+Sum3);
	
	
	}
	
				
				}


