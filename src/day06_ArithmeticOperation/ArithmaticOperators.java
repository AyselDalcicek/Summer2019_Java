package day06_ArithmeticOperation;

public class ArithmaticOperators {
	
	/*
	 + : addition, adds two numbers together
	 - : subtructoin, subtracts a number from another number
	 * : Multiplication, multiples
	 / : devision, divides
	    
	 % : remainder, returns the remainder from the division 
	 
	 */

	public static void main(String[] args) {
		
		int a = 100;
		int b= a - 400;	
		
		System.out.println( b ); // -300
		
		int c = a + b;	
		System.out.println( c ); //100 + -300 = -200
		
		int X =3, Y=5, Z=X*Y;
		System.out.println( Z ); //15
		
		int length =100,
				Wedith = 10 ,
				Area = length/Wedith;
		
		System.out.println( Area );
		
		System.out.println( 3 + 5 + 4 - 2 ) ;	// 10
		//										8+4-2=10
		
		
		// double resultNum = 9/0;	
		// System.out.println(resultNum);	//denominator can not be zero
		
		
		
		double Number1 = 10.0 / 3; 	
		System.out.println( Number1); // 3.33333
		
		double Number2 = 10/3;
		System.out.println( Number2);	// 3.0
		
		
		int output = 12 + 6 / 3;
		//			18 / 3 = 6
		//					12 + 2 = 14
		System.out.println( output ); 
		
		System.out.println( 5+ 2 * 4 );	// 13
		System.out.println( 5 + 4 * 2); // 13
		
		System.out.println( 10 / 2 - 3 ); // 2
		
		System.out.println( 8 + 12 * 2 ); //32
		
		 
	// % : returns the remainder
			 
			/*          10/3 ==> 3 with remainder of 1
			  			12/5 ==> 2 with remainder : (12 -5*3) )
			  	
			  			20/3 ==> 6   :  20 - 6 * 3 = 2
			  
			  */
			 
			 int result1 = 10%3; //1
			 
			 System.out.println( result1 ); // 1
		
			 System.out.println( 12%5 ); //2
			 
			 
			 /*
			  * 
			  20, 45, 65, 67, 68
			  even : can be divided by 2 without a remainder
			  odd : divided by 2, will have remainder
			  
			  */
			 
			 
			 int Number20 = 20 % 2 ;	// even   remainder 0
			 int Number45 = 45 % 2 ; 	// odd	  remainder 1
			 int Number65 = 65 % 2 ; 	// odd	( 65 - 32 * 2 ) = 1
			 
			 System.out.println( Number20 );
			 System.out.println( Number45 );
			 System.out.println( Number65 );
			 
			 
			 System.out.println( 4 + 17 % 2 - 1 );
			 //					4 + 1 - 1 = 4
			  
			 
			 System.out.println( 6 - 3*2 + 7 - 1 );  // 6
			 //					6 - 6 + 7 - 1 = 6
			 
			 System.out.println( 6 * 3 / 2 );    // 9
			 
	 /*
	  
	    first come first serve, except  for VIP
	    		VIP : % , / , *
	    	
	    		highest : () , % / *
	  
	  */
			 
			 System.out.println( 1 + 2 - 2 + 3 ); 	 // 4
			 System.out.println( 1 + 2 - (2 + 3) ); 	// 4 
			 //												 1+2 - 5 = -2
			 
			 System.out.println( 3 + 4 * 4 + 5 * (4 + 3 ) );
			 //												3 + 4 * 4 + 5 * 7 
			 //								3 + 16 + 35
			 // 											19 + 35 = 54
			 
			 
			 
	// 	 	%:
			 

				//   10/4 ==> 2 with remainder of  ( 10 - 2*4 ) =2
				
				System.out.println(  10 % 4 );
				
				
				System.out.println(  4 + 17  %  2 - 1 );
				//									 4 + 1 -1  = 4
				
				
				double percentage = 10/100;   // 10%  0.1 
				System.out.println(percentage);   // 0.0 olmali ???
		
		
		
		
	}
}
