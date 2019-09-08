package day03_Variables;

public class EscapeSequances {
	/*
	 \n (or \r): starts from a new line
	 \t: horizontal tab
	 \\: prints a back slash
	 \': prints single quote
	 \": prints double qoute
	 
	  \: back slash
	  /: front slash
	 
	 */

	public static void main(String[] args) {
		System.out.println("Hello Cybertek\n Batch12 students");
		
		System.out.print("Tomorro wis off \n");
		System.out.print("True\r");
		System.out.println("False\n\n\n");
		
		System.out.println("\tClass starts tomorrow");
		
		System.out.println("\\aysel");
		System.out.println("\'Java");
		System.out.println("Book is called \"Game of Throne\" ");
		
	}
}
