package Kahoot_Quiz;

public class Quiz_Kahoot3 {
	
	public static void main(String[] args) {
		
		 // question 01:
		 boolean a = !!!!!false;
		 //			!!!!true
		 //			!!!false
		 //			!!true
		 //			!false
		 //			true
		 // if we have even number of !!, we can delete them, which means 2,4,6
		 System.out.println(a);
		 
		 
		 // question 02:
		 boolean result = !false != ("Batch12" != "Best Batch Ever");
		 //					true != true
		 //						false
		 System.out.println(result);
		 
		 
		 
		 // question 03:
		 int x =100;
		 double y = x += 100/20;
		 //			x=x+(100/20) = 105
		 //		y = 100 += 5  ==> 105
		
		 System.out.println(x);
		 
		 System.out.println(105.0 > 105); 	// false
		 System.out.println(105.1 > 105);	//true
		 
		 
		 
		 
		 // question 05:
		 boolean A = 128 >'9'  || 128 ==127; 
		 //				true  ||	false    ==>false
				 System.out.println(A);
		 
		 
		
		
		 // question 06:
		 boolean StupidOperators = 10>= 20 && 'a' > 'b';
		 //							false  &&	true	==> false
		 System.out.println(StupidOperators);
		 
		 
		 
		 
		 // question 07:
		 int num1 = 9999999;
		 int num2 = 10;
		 System.out.println( num1 * num2 / 10 % num1 );	// 0
		 
		 
		 
		 
		 // question 08:
		 int s = 100;
		 int t = (byte)100;
		 System.out.println( s >= t && ( s + 1 == s * 2 / 2 + 1 ) );
		 //					  false && ( 101 == 200/2+1)
		 //					  false && 101 == 101
		 // 				  false && true 	==> true
		 
		 
		 
		 // question 09:
		 
		 	//int x = 100;
		 	//System.out.println( " z > 100 is :"+ H );	
		 				// H is not defined before this line
		 	//boolean H = z>100 ; 	// false
		 
		 
		 // question 10:
		 System.out.println( 5 + 7 + "8" );	//128
		 
		 System.out.println( "8" + 5 + 7); 	// 857
		 
		 System.out.println( 5 + 7 + "8" + 5 + 7);	// 12857
		 
		 System.out.println(5 + 7 + "8" + (5 + 7) ); 	// 12812
		 
		 System.out.println("5 + 7" + "8" + 5 + 7); 	// 5+7857
		 
		 
		 // question 11:
		 
		 System.out.println( 1 + 11 + "3" == "123" ); 	//true
		 
		 String str = "cybertek";
		 str = str + "1219" + "true" + 'A';
		 System.out.println(str);		//cybertek1219trueA
		 
		 
		 
		 // question 12:
		 int numberA = 100;
		 	numberA += 300;		// 400
		 	System.out.println(numberA++ + " " + numberA );	// 400  401
		 	//						400				401
		 	
		 	
		 	
		  // question 13:
            // local variables MUST be initialized
        
        
		  // question 14:
        System.out.println( (10 * 2) / (5 * 4) * 1000 / 10 % 100 );
        //                   20 / 20 * 1000 / 10 % 100
        //                      1000 / 10 % 100
        //                       100%100
        //                       0
		 
		 
	}

}
