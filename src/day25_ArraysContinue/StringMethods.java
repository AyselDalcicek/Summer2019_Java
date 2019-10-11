package day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
	
	
	public static void main(String[] args) {
		
		 
	    /*
	     split(str): splits the String by the given value, and returns it as String array
	     
	     
	     toCharArray():
	     
	     */
		
		String sentence = "Today is great day Good day to learn java";
		
			String[] arr= sentence.split(" ");
			System.out.println( Arrays.toString(arr) );  // [Today, is, great, day, Good, day, to, learn, java]
			
			
			String email ="FirstName_LastName";
				String[] arr2 =email.split("_"); 
				
			
				String str = Arrays.toString(arr2);
			System.out.println( str.replace("[","").replace("]","") );  // FirstName, LastName
			
			
			
			String fullName = "Cybertek School Batch12";
			
				String[] array1 = fullName.split(" ");
				System.out.println( Arrays.toString(array1));  // [Cybertek, School, Batch12]
				
				
				System.out.println("========================================");
		
			String Java = "I love Java and Java is fun, Java is Life";
		   //              I love  |   and   |  is fun,   | is Life  |
			
			String[] array2 = Java.split("Java");
				
			System.out.println( Arrays.toString(array2));  // [I love ,  and ,  is fun, ,  is Life]
			System.out.println( array2.length-1); //3
			
			System.out.println("=======================================");
			
			
			
			String Python = " Python is good, I Love Python, Python is Life";
			 //            [     |   is good, I Love     | ,  |     is life      ]
			String[] array3 = Python.split("Python");
			System.out.println(array3.length-1);  //3  returns the total number of python in String
			
			System.out.println("*******************************************");    
			
			
			
			String emailAddress = "Cybertek.school.batch12@gmail.com";
			String Fullname = emailAddress.substring(0,emailAddress.indexOf("@") );
				String[] AllNames = Fullname.split("\\.");
				
				System.out.println(Arrays.toString(AllNames ));  // [Cybertek, school, batch12]
				
				
				
				
				String word = "ABCDEFG";
				String[] AllCharacters = word.split(""); // all characters from the string as an array
									// splits the String character by character
				
				System.out.println(Arrays.toString(AllCharacters));   // [A, B, C, D, E, F, G]
				
				
				
				 /*
		         toCharArray(): returns a char array from the String
		         */
		            
		         String Str ="Java";
		             char[] ch = Str.toCharArray();
		                
		             System.out.println(Arrays.toString(ch));   // [J, a, v, a]
				
				
	}
	
	
	

}
