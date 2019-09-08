package day14_Scanner;

public class Exercise02 {
	
	public static void main(String[] args) {
		
			/*
			 write a program that can convert numbers (between 0~9) to words.
			if the number is greater than 9, the output should be "invalid" number.
			            DO NOT USE IF STATEMENT
			ex 1: 
			input:
			enter a number between 0 to 9:
			1
			output:
			you have entered: one
			ex 2:
			input:
			enter a number between 0 to 9:
			2
			output:
			you have entered: two
			ex 3:
			enter a number between 0 to 9:
			10
			output:
			you have entered: Invalid number
			 */
		 //write a program that can convert numbers (between 0~9) to words.
		
		// 1st solution:
		
		int num =8;
		String result ="";
		if (num>=0 && num<=9) {
			
			if(num==9) 
				result="nine";
			else if(num==8)
				result="eight";
			else if(num==7)
				result="seven";
			else if(num==6)
				result="six";
			else if(num==5)
				result="five";
			else if(num==4)
				result="four";
			else if(num==3)
				result="three";
			else if(num==2)
				result="two";
			else if(num==1)
				result="one";
			else
				result="zero";
		}else {
			result="Invalid";
				
		}
		 System.out.println(result);
		 
		 
		 
		 
		
		// 2nd solution:
		
		int number = 5;
		String result2 = number==0 ? "zero"  :number==1 ? "one"
						:number==2 ? "two"   :number==3 ? "three"
						:number==4 ? "four"  :number==5 ? "five"
						:number==6 ? "six"   :number==7 ? "seven"
						:number==8 ? "eight" :number==9 ? "nine"
						: "Invalid Number";
		System.out.println(result2);
		
		
		
	// 3rd solution:
		
		int n = 7;
		switch (num) {
		
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		case 0:
			System.out.println("zero");
			break;
			default :
				System.out.println("Invalid Number");
		}
		
			
			
			
	}			
			
			
}
