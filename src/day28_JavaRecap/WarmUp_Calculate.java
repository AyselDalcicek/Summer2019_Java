package day28_JavaRecap;

public class WarmUp_Calculate {
	/*
	  1. Write a method that accepts 3 parameters: 2 numbers and one operator, and prints out the calculation 
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10,2, "*") ==> 20;
	 */
	public static void main(String[] args) {
	
		calculate(10,2,"+");
	
	
	}
	
	public static void calculate(int a, int b, String Ope) {
		
		String result = "";
		if(Ope.equals("-")) {
			result +=(a-b);	
		}else if(Ope.equals("+")) {
			result+=(a+b);
		}else if(Ope.equals("*")) {
			result+=(a*b);
		}else if(Ope.equals("/")) {
			result+=(a/b);	
		}else if(Ope.equals("%")) {
			result+=(a%b);	
		}else {
			result="invalid";
		}
		
		// System.out.println(result);
		
		//Ternary
		String result2 ="";
		result2 += (Ope.equals("-")) ? (a-b) : (Ope.equals("+")) ? (a+b) 
				:(Ope.equals("*")) ? (a*b) : (Ope.equals("/")) ? (a/b)
				:(Ope.equals("%")) ? (a%b) : "invalid Operator";
		
		System.out.println(result2);
	}
	
	
}
