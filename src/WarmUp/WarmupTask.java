package WarmUp;

public class WarmupTask {
	
	

	/*
	  1. Cucumber   		=> 2.5$    => float, double
	  2. Onion				=> 1.5$    => float, double
	  3. Green Pepper		=> 2$      => byte, short, int, long , float, double
	  4. Tomato				=> 3$      => byte, short, int, long, float, double
	  5. Carrots			=> 4$	   => byte, short, int, long, float, double
	 
	 */
	
	
		public static void main(String[] args) {
			// Cucumber: 2.5 $
	//		int Cucumber = 2.5; // we can only assign whole numbers to int, byte, short, long
			
		//	float Cucumber = 2.5;  // float cannot contain double
			float Cucumber = 2.5f;
			double  Cucumber2 = 2.5f;  // double can contain float
			double Cucumber3 = 2.5;
			
				System.out.println(Cucumber);
				System.out.println(Cucumber2);
				System.out.println(Cucumber3);
			
			
				
				
			//Onion: 1.5 $
			float Onion = 1.5F;
			double Onion2 = 1.5;
			
				System.out.println(Onion);
				System.out.println(Onion2);
			
			
			
				
			// Green Pepper: 2$
			byte GreenPepper = 2;
			short GreenPepper2 = 2;
			int GreenPepper3 = 2;
			long GreenPepper4 = 2L;
			
			float GreenPepper5 = 2; //only time we add f or F is, when are assigning deciamls
			double GreenPepper6 = 2;
			
			
				System.out.println( GreenPepper );
				System.out.println( GreenPepper2 );
				System.out.println( GreenPepper3 );
				System.out.println(GreenPepper4);
				
				System.out.println(GreenPepper5);  // double and float converts the whole numbers to decimals
				System.out.println(GreenPepper6);
			
			
				
			
			// Tomato : 3$
			byte Tomato = 3;
			short Tomato2 = 3;
			int Tomato3 = 3;
			long Tomato4 = 3L;
			
			float Tomato5 = 3; //only time we add f or F is, when are assigning deciamls
			double Tomato6 = 3;
			
				System.out.println(Tomato);
				System.out.println(Tomato2);
				System.out.println(Tomato3);
				System.out.println(Tomato4);
				
				System.out.println(Tomato5);	 // double and float converts the whole numbers to decimals
				System.out.println(Tomato6);
				
				
			
			
			
			// Carrots : 4$
			byte Carrot = 4;
			short Carrot2 = 4;
			int Carrot3 = 4;
			long Carrot4 = 4L;
			
			float Carrot5 = 4; //only time we add f or F is, when are assigning deciamls
			double Carrot6 = 4;

				System.out.println(Carrot);
				System.out.println(Carrot2);
				System.out.println(Carrot3);
				System.out.println(Carrot4);
				
				System.out.println(Carrot5);	 // double and float converts the whole numbers to decimals
				System.out.println(Carrot6);
				
			

		
		
		
		
		
	}

}
