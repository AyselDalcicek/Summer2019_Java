package Kahoot_Quiz;

public class Quiz_Kahoot2 {
	
	public static void main(String[] args) {
		
		
//  question 02 :	
	//  System.out.println(b); 	I have not defined yet before line 9
		
		
//	question 01 :
		int a =30;
		//int b = (long) a;
		int b = (byte) a;
		System.out.println(b); 	// 30
		
		
		
//	question 03:
		System.out.print("Result A"+0+1);	//  Result A01
						
		System.out.print(";Result B "+(1)+(2) + "\n");	// ResultB12
						
		System.out.println("Result B "+(1+2));		// Result B3
		
		
		
//	question 04:
		System.out.println("5 + 2 =" +3+4);	// 5 + 2 = 34
		
		System.out.println("5 + 2 =" + (3+4) );	// 5 + 2 = 7
		
		
		
//	question 05:
		float FloatNum = 100.98765432f;
		short ShortNum = (byte) FloatNum;	// float is larger than short
		System.out.println(ShortNum);		// 100
		
		
		
//	question 06:
		
		//	byte a = 200; 	// byte' maximum capacity is 127
		
		
		int Numa = 200;
		int Numb = 2;
		
		System.out.println(Numa + Numb - Numa * Numb + Numa / Numb);	// -98
		//					200 + 2 - 400 + 100		
		//					202 - 400 + 100 = 202 - 300 = -98
		
		
		
//	question 07:
		 System.out.println( (3+2) * 2/3 % 2); 	//
		 //						5 * 2/3 % 2
		 //						10 / 3 % 2
		 //						3 % 2
		 //						1
		 
		 
		 
//	question 08:
		// int num1 = 9, num2 =0, num3 = num1/num2;
		//  System.out.println(num3);	//   throws error message because  denominator can not be 0
		 
		 
		 
//	question 09:
		 long Lnum = 3_000L;
		 double Dnum = (float) Lnum;	// narrowing 
		 int INum = ( short) Dnum;		// instead of short we can not use float, double, long  because they are>int
		 								// We can use byte and int 
		 
		 System.out.println(INum % 1000);	//
		 
		 
		 
//	question 10:
		 double result1 = 10/3;
		 //		result1 = 3; ==> 3.0
		 System.out.println(result1); 	// 3.0
		 
		 
//	question 11:
		 System.out.println(10.0/3.0); 
		 
		 
//	question 12:
		 String str = "10.5";	// string of text 
		// int num = (int)str; 	// string is not a primitive 
		// comletition fail
		 
		 
		 
//	question 13:
		  int I1 = 10, I2=20, I3 =30;
		  I1 = I1 % 5;	// 10 % 5 = 0 	I1=0
		  I2 = I2 % 5;	// 20 % 5 = 0 	I2=0
		  
		  I3 = I1*I2 ;	// I3=0
		  
		  System.out.println(I1+"\t" + I2 + "\t" + I3);
		 
		 
		 
		  
		  
		  
		  System.out.println( 10 / 3L); 	// 3
		  System.out.println( 10 / 3f);		//3.3333
		  System.out.println( 10 / 3D);		//3.333333333
		  
		  float yy = 10.7f; // we MUST put f in decimal 
		  double uu = 10.9; 
		  
	}

}
