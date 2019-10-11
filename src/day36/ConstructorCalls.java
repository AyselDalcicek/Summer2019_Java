package day36;

public class ConstructorCalls {
	
	/*
	 constructor calls: 
        1. only a constructor can call another constructor
        2. constructor cannot called by constructor name
        3. we use "this()" keyword to call the constructor in currect class
        4. constructor call MUST be the first step in a constructor
        5. one constructor can only call one constructor (cannot call more than 1
	 */
	
		public ConstructorCalls() {
			
			System.out.println("A");
			
		}
		
		public ConstructorCalls(int a){
			//ConstructorCalls();
			
		//	System.out.println("B"); // constructor call has to be the first step in a constructor
			this();  // A
			System.out.println("B");
			
		}
		
		public ConstructorCalls(double a) {
			
			this(10);  // A B
			//this();    // one constructor can only call one constructor
			System.out.println("C"); // C
			
		}
		
		
		
		public static void main(String[] args) {
			method1();
		//	ConstructorCalls();
			
			ConstructorCalls obj  = new ConstructorCalls( 10.5 );  // A B
			
			
			
			
			
		}
		
		public static void method1() {
			
			
		}
		
		public static void method2() {
			method1();
		}
	

}
