package day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp_Initials {
	
	  /*
    1. Write a program that asks user' first and last names and then prints out the initials of the user
   Ex: Enter your first and last names:
       Cybertek
       batch12
       output: initial is: C.B
    */
   
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your first and last names");
        String firstName = input.next();
        // cmsac Enter
           input.nextLine();  // takes out the "Enter" from scanner' memory
           String lastName = input.nextLine();
           String initials = firstName.substring(0,1).concat(".")
                       + lastName.substring(0,1);
        // Cybertek
        // 01234567    
               
     //  String initials = "" + firstName.charAt(0) + "."+lastName.charAt(0);
       
           
       initials = initials.toUpperCase();
       System.out.println("Initial is: "+initials);
               
    
       
           
           
         /*  Notes:
        	    System.out.println(firstName.charAt(0)+lastName.charAt(0));
				We can not assign like this/ it gives us number.
				It wont give initial.
				'A'+'B'==>'AB' (wrong)
				66 + 65 = 131  (correct)
				If we add "." between charAt, it gives us initials. 
				If we add number, it also gives us string.
				Because, anything we add to string, it return us string.
          */

       int FirstNameIndex = firstName.length()-1;
       int lastNameIndex = lastName.length()-1;
       
       String LastLetters =""+firstName.charAt(FirstNameIndex)
       					+"."+lastName.charAt(lastNameIndex);
       
       String LastLetters2 = firstName.substring(FirstNameIndex, FirstNameIndex+1)
       						+lastName.substring(lastNameIndex, lastNameIndex+1);
       LastLetters2=LastLetters2.toLowerCase();
       System.out.println("Last letters are: "+LastLetters2);
       
       /*
        Notes:
        (FirstNameIndex, FirstNameIndex+1) we can write only (FirstNameIndex) it is also works.
        (lastNameIndex, lastNameIndex+1) we can write only (lastNameIndex) it is also works.
        Because if we write substring, it gives us from the number till end, 
        According to print last letter, we do not need.
        */
   }

}
