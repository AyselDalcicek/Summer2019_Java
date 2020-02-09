package Quiz;

import java.util.Arrays;

public class quiz08 {
	
	// quiz-8
	
	public static void main(String[] args) {
		   
		// q-4:
		int[] arr= {30,20,10,5,0};
		Arrays.sort(arr);  // {0,5,10,20,30}
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==30) {
				continue;
				// count++;    // Compile error it can be before continue statement but not here
			}
			System.out.print(arr[i]+" ");
		}
		 // Example: If we write break, return or continue, we can not write anymore.
		 // it will give compile error.
		
		
		
		// q-6:
		for(int i=5;  i>0; i--) {
			
			if( i==3 ) {
				break;
			//	System.out.println("Done");   We can not write any think after break statement.
			}

            System.out.print(i+" ");
			
			 int num2 = 5; //0
	            
	            while( isAvailable(num2) ) {
	                    // num2 >  0 
	            	
	            //   num2 -- ;   //43210
	                 
	                System.out.print(--num2); 
	                
	                // num2 -- ;  //54321
					System.out.println();
			}
			
			
			dosum(10.0, 20.0);
			dosum(10,20);
			Integer a =10, b=20;
			dosum(a,b);
			
					
			
						byte a1 =10;
						Byte a2 = a1;
						Double a3 =(double)a1;  // auto boxing
						
						Integer b1=30;
						long b2 =b1;
						 /* wrapper class only accepts their own primitive values
						  primitives accepts any value as it's within the range.
						  */
						Integer c1 = 30;
					//	Double c2 = c1;
						Double c2 = (double)c1;
						

		// q-16:
	    int data[] = {  2010,  2013,  2014,  2015,  2014 };
	    int key = 2014;
	    int count2 = 0;
	    	for ( int  e :  data ) {
			                     
	    			if(e != key) {
	    				count2++;
	    				continue;
	    				}
			       }
	    	
	    		System.out.println ( count2 + " Found ");			
						
						
		}	
		
		
		
		
		// q-5:
		
		int[] numbers = {1,2,3,4};
		int num=findMax(numbers);
		
	}
	
	
	
		public static int findMax(int[] a) {
			return 1;
		}
		
		
		
		// q-7:
		public static int sum(int a, int b) {
			return a+b;
		//	System.out.println("");  
		}
		
		
		// q-8:
		public static boolean isAvailable(int num2) {
			return num2--> 0? true : false;
		}
		
	
		// q-11:
		    // dosum (10.0,20.0) ==> double sum
			// dosun(10,20) ==> int sum
		public static void dosum(double x, double y) {
			System.out.println("double sum: "+(x+y) );
			
		}
		
		public static void dosum(Integer x, Integer y) {
			System.out.println("Integer sum: "+(x+y) );
			
		}
		
		public static void dosum(int x, int y) {
			System.out.println("int sum: "+(x+y) );
			
		}
	
		public static void dosum(float x, float y) {
			System.out.println("float sum: "+(x+y) );
			
		}
}
