package day33_ArrayList;

public class MethodCalls {
	
	
	public static void main(String[] args) {
		method2();  // A
		            // B
		
		
		method3();  // A
					// B
					// C
		
		
	    method1(); // method can not call itself
			    
			    int max2 = max(10, 20);
			    System.out.println(max2);  // 20
			          //  OR
			    System.out.println(max(10, 20)); // 20 
			    
			    int max3 =  max(100, 200, 50); 
	            System.out.println(max3);   // 200
	            
			    
	     maximum(100, 500, 3000);	// 3000
	     
	     maximum(100, 200, 300);  // 300
	     
	     String str = print(100, 200, 300);
	     System.out.println(str);  // 300
	}				
	
	
	public static void method1() {
		// method2(); // method can not call itself
		System.out.println("A");  // A
	}
	
	public static void method2() {
		method1();  // A
		System.out.println("B");  // B
	}
	
	public static void method3() {
		method2();  // A B
		System.out.println("C"); // C
	}

	
	public static int max(int a, int b) {
		return ( a > b ) ? a : b;
	}
	
	public static int max(int a, int b, int c) {
		int largestNum = max(a,b);  // max(a,b) 
		return ( largestNum > c ) ? largestNum : c;
				// OR
		// return ( max(a,b) > c ) ?  max(a,b) : c; 	
	}
	
	  public static int max(int a, int b, int c, int d) {
	        /*
	        int result = max(a, b, c);
	        if(result > d) {
	            return result;
	        } else {
	            return d;
	        }
	        */
	        // return  (result > d) ? result : d;
	        
	        return  max(    max(a, b)  ,   max(c, d)  );
	        
	    }
	  
	  public static int max(int a, int b, int c, int d, int e) {
	        
          // return   max(    max(a,b,c,d)  ,  e );
      
          return max (    max(a,b,c)  ,  max(d,e) );
          
  }
	
	public static void maximum(int a, int b, int c) {

		System.out.println( max(a,b,c) );	
	}
	
	public static String print(int a, int b, int c) {
		maximum(a, b, c);
		return "900";
	}
	
	
}
