package day06_ArithmeticOperation;

public class PrimitivesCasting {
	
	/* 
	 casting : converting larger primitive to smaller size
	 			datatype variablename = (datatype) value
	 
	 
	 			casting : Explicit & implicit
	 			
	 			
	 primitives : byte, short, int, long, float, double
	 
	 */
	
	public static void main(String[] args) {
		
	// explicit casting
		
		 int a = 10;
		 byte b =(byte) a; 	// explicit casting
		 System.out.println(b);
		 
		 
		 
		 double  DecimalNumber = 10.5;
		 float FloatNumber = (int) DecimalNumber; // double > float
		 	// FloatNumber =10;
		 
		 
		 System.out.println(FloatNumber);
	
		 
		 long LongNum = 300L;
		 	
		 // int IntNum = (int)LongNum;		// we can 
		 	int IntNum = (short) LongNum;
		 //	int IntNum = (byte) LongNum; 	// we can not use byte 
		 	
		 	System.out.println( IntNum);
	
		 	
	// implicit casting
		 	 
		 			byte ByteNum =100;
		 			int IntNum2 = ByteNum;
		 			
		 				// same with:
		 			int IntNum3 = (int) ByteNum;
		 				
		 		
		 	short ShortNum = 100;
		 		long LongNum2 = ShortNum;
		 			// same with:
		 		long LongNum3 = (long) ShortNum;
		 	
		 		
		// explicit casting practices:
		 			double LargestNumber = 100.8765;
		 		
		 			byte ByteValue = (byte) LargestNumber;	//	100		
		 		
		 			float FloatValue = (float) LargestNumber;	//	100.8765F
		 		
		 			float FloatValue2 = (int) LargestNumber;
		 			float FloatValue3 = (byte) LargestNumber;	//	100.0
		 		 
		 		
		 			float FloatValue4 = (short) LargestNumber;
		 			float FloatValue5 = (long) LargestNumber;
		 		
		 		
		 			System.out.println(FloatValue); 	// 100.8765
		 		
		 		
		 		float FloatNumber2 = 500.67F;
		 		int myNumber = (short) FloatNumber2;	//	500
		 		
		 		System.out.println( myNumber );
		 	
		 		
		 	
		 		int Num1 =100;
		 		int Num2 =200;
		 		int Num3 =300;
		 	
		 		
		 		
		 int num1 = 100, num2 = 200,  num3 = 300 ;
		 
		 System.out.println(num1+"\t" +num2+"\t" +num3);
		 		
		 	
		boolean result; 
		// System.out.println( result); // LOCAL VARIABLES MUST BE INITILALIZED 
		 	
		 char Character1 = 'A';
		 System.out.println( Character1 );
		 
		 
		
		// boolean result1, result2, result3;
 
		 
		 
		 boolean result1, 
		 				result2,
		 				result3;
		 
		 
		 //  System.out.println(result1);
		 
		 
		
		 	
		 	
		 
		 
	}
	

}
