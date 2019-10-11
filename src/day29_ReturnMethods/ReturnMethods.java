package day29_ReturnMethods;

public class ReturnMethods {
	
	  /*
    access-modifier specifier  returnType name(parameter){
                   statements;
    }
    */
   
	public static void main(String[] args) {
		
		name();  // // this is a String value
	//  "z"
		System.out.println(name());  // return methods are either printed or assigned to the variable
									// Batch12
		String str = name();
		System.out.println(str);   //// Batch12
		
		
		System.out.println(result());  // false
		boolean b = result();
		System.out.println(b);   // false
		
		
		method1();   // hello
		
		
	}
	
	public static boolean result() {
		return 8>9;
		
		
		
	}
	
	// if return type is void:
	public static void method1() {
		System.out.println("Hello");
		return;
	}

	// if the return type of the method is not void:
	public static String name() {
		return "Batch12";
		// System.out.println();
		 //  once return statement executed it exits the method immediately  
		
	}
}
