package day07_Unarary_ShortHand;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
		/*
		 + : positive 
		 - : negative
		 ++ : increment
		 -- : decrement
		 
		 for + & - :
		 +- ====> -
		 -- ====> +
		 ++ ====> +
		 -+ ====> -
		 
		 */
		
		int a = 10;
		int b = -10;
		System.out.println(b);
		
		int c = +b;		// 	+(-10)  
		System.out.println(c);	// -10
		
		int d = -c; 	// 	- (-10)  
		System.out.println(d);	// 10
		
		int f = -(10);
		System.out.println(f); 	// -10
		
		
		// increment: increases the value by 1	
		
// 1. pre increment : operator is placed before the variable.
//						Increase the value by 1 immediately.
		
		int num1 = 100;
		
		++num1;  // 101
		
		int num2 = ++num1; 
		
		System.out.println(++num1);		// ++(101) ==> 102 
		
		
		
// post increment : Operator is placed after the variable. 
//					It will pass the current value first than it will be increment by one
		
		int IntNum =100;
		
		System.out.println( IntNum ++ );	// 100
		System.out.println( IntNum );	// 101
		
		
		int IntNum2 = IntNum ++;	// IntNum2 = 101	
		//		IntNum2  =  101
		
		
		System.out.println( IntNum2);	// 101
		
		
		System.out.println(IntNum);   // 102
		
		
		
		
		int x = 100;
		int y = x++ -1;
		// 	y = 100 -1;
		
		System.out.println(y); 	// 99
		
		
		
		
//	decrement: Decreases the value by 1.
//				Opposite of increment.
		
		
// pre decrement : operator is placed before the variable. 
//				 	Decreases the value by 1 immediately	
		
		
		
		int Z = 100;
		
			System.out.println( -- Z ); 	//99
			
			
		
// post decrement : operator is place after the variable. 
//					It will pass the current value, and 			
			
			
			
			int Y = 95;
			
			System.out.println( Y -- );		// 95
			System.out.println( Y ); 	// 94
			
			
			
			
			int T = 25;
			System.out.println(++T);	// 26
			System.out.println(--T);	// 25
			
			
			
			int P = 50;	// 50 
			P = --P  +  P++  +  P--  +  P++;
			//  pre     post    post    post
			//  49   +  49   +  50   +  49
			//  P = 197
			
			
			System.out.println( P );	// 197	
			
			
			
			
			
			short S =4;		
			int R = S * 4  -  S --;
			// 				16   -   4   =   12
			System.out.println(R); 	// 12
			System.out.println(S);  // 3
			
			
			
			
			
			int W = 1; // -1
				W = - W--  +  W++  /  -W--  *  --W;
			//      post      post     post     pre
				
		    //		-1	   +	0	/   -1   *  -1
				// -1  +  0 * -1
				// -1 + 0
				// -1
				
				System.out.println(W); 	// -1
				
				
				
				
				
				
				
	}

}
