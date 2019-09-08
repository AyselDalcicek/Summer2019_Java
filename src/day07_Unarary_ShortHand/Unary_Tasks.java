package day07_Unarary_ShortHand;

public class Unary_Tasks {
	
	public static void main(String[] args) {
		
		int x = 2;
		int y =x++;		// 2 ;  x=3
			// post
		System.out.println(y+" "+x);
		
		
		
		int x2 =2;
		System.out.println(x2++); 	// 2
		System.out.println( x2 );   // 3
		
		
		
		
		int x3 = 2;
		System.out.println(--x3); 	// 1    2-1=1
		
		
		
		
		int x4 = 8;
		int y4 = x4--;
		System.out.println(x4); 	// 8
		System.out.println( x4 );	//7
		
		
		
		
		int e = 1;
		e = -e-- + e++ / -e-- * --e;
		//	post   post  post  pre	
		//  -1 		0	 -1		-1
		// -1  +  0  /  -1   *  -1
		// -1
		
		System.out.println(e); 	// -1
		
		
		
		
		
		int f = 50; //49
		f = --f + f++ + f-- + f++;
		//  pre   post  post  post 
		//  49    49    50    49
		// 
		System.out.println(f); // 	197
		
		
		
		
		
		int t = 4;
		int w = t * 7 - t++;
		//		28 - 4  =  24
		
		
		System.out.println(w); // 24
		
		
		
		
		int m = 198 % 2;
		System.out.println(m); // even numver 
		
		byte n =30;
		// int v = v+=n; 
		// value of v is v+30
		
		
		
	}
	
	

}
