package day17_StringClass;

import java.util.Scanner;

public class WarmUp6 {
	
	public static void main(String[] args) {
		
		 /*
        Task01:
         1. Declare Scanner class' object
         2. ask user to enter first and last name. 
         3. declear a string variable called full name
         4. concat firts and lastname and assign it to fullname
         5. Display in the console total numbers of characters in full name
         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first and last names");
		 String firstName = scan.nextLine();
		 String lastName = scan.nextLine();
		 String fullName = firstName.concat(" "+lastName); // we can only concat Strings/
		 
		 String fullName2 = firstName+" "+lastName; // We can concat String and numbers
		 											// firstName+12+  gibi
		 String name ="Cybertek" + 12 + 'A' + 4.5;
	//   String name2 ="Cybertek".concat(12);  
         // in concat method you can only give String variable or String value
		 
		 int num = fullName.length();
		 
		 System.out.println(fullName+" contains "+num+" characters");
		 
		 
		 
		// last character
		 int lastIndexNum = fullName.length()-1;
		 System.out.println(fullName.charAt(lastIndexNum));
		 
		 
		 scan.close();
		
	}
	
	
	
	
	

}
