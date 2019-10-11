package day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
	public static void main(String[] args) {
		
		
		ArrayList<String> nameList = new ArrayList<>();
		
		// add method: 
				nameList.add("Zeynep");
				nameList.add("Bera");
				System.out.println(nameList); // [Zeynep, Bera]
		
				/* crate an Arraylist called studentNames
				   crate scanner object called scan
				 */
				
		Scanner scan = new Scanner(System.in);	
		ArrayList<String> studentName = new ArrayList<>();
			
		while(true) {
			System.out.println("Enter a name");
			String name = scan.nextLine();
				studentName.add(name);
			System.out.println("do you want to add another name");
			String answer = scan.nextLine();// tolowerCase(); --> we can write it instead of equalsIgnoreCase
			if(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ) {
				System.out.println("Invalid");
			break;
		}
			if(answer.equalsIgnoreCase("no")) {
				break;
			}
		}
		
		System.out.println(studentName);
		
		
	}

}
