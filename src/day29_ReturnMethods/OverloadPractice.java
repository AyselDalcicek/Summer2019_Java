package day29_ReturnMethods;

public class OverloadPractice {
	
	
	public static void main(String[] kfc) {
		
		System.out.println("String Array");
		
		boolean[] array1 = {true, false};
		main(array1);
		
		double[] array2 = {1,2,3};
		main(array2);
		
		return; 
	//	System.out.println("hello"); // return statement exits the method as soon as it gets executed
		
		
		
		
	}
	
	public static void main(int[] a) {
		System.out.println("Int Array");
	}

	public static void main(double[] b) {
		System.out.println("double Array");	
	}
	
	public static int main(boolean[] c) {
		System.out.println("boolean Array");
		return 3;   // if we do not write it we have compile error, because we wrote int
	}
}
