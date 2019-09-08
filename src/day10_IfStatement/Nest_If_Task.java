package day10_IfStatement;

public class Nest_If_Task {
	
	/*
    Nested if:
    
       if(  condition1  ){
               if( condition2){
                       // some code to run
               }
           }
           
           
    
    */
   
   public static void main(String[] args) {
       
       if(true) {
           System.out.println("Hello Cybertek");
           
           if(false) {
               System.out.println("Hello WOrld");
           }
           
       }
       
       
       
       if(true) {
           System.out.println("Hello batch 12"); // printed
           
           if(false) {
               System.out.println("Hello programmers");
           } 
           else {
               System.out.println("Hello Team SDET"); // printed
           }
           
       }
       
       /*
	       	60 <= grade < 70 ==> D
	       	70 <= grade < 80 ==> C
	       	80 <= grade < 90 ==> B
	       	90 <= grade <= 100 ==>A
	       	
	        50 <= grade < 60 ==> F
			40 <= grade < 50 ==> G
		    30 <= grade < 40 ==> H
		    20 <= grade < 30 ==> I
		    10 <= grade < 20 ==> J
			 0 <= grade < 10  ==> K
			 
			 
      */
     int grade = 80;
     
     if( grade >= 60 && grade <= 100) {
         System.out.println("you passed");
         
         if( grade >=90 && grade <= 100) {
             System.out.println("\twith a grade of A");   
         } 
         else if(grade >=80 && grade < 90) {
             System.out.println("\twith a grade of B");
         }
         else if(grade >= 70 && grade < 80) {
             System.out.println("\twith a grade of C");
         }
         else if(grade >= 50 && grade < 60) {
        	 System.out.println("\twith a grade of F");
         }
         else if(40 <= grade && grade < 50) {
        	 System.out.println("\twith a grade of G");
         }
         else if(30 <= grade && grade < 40 ) {
        	 System.out.println("\twith a grade of H");
         }
         else if(20 <= grade && grade < 30) {
        	 System.out.println("\twith a grade of I");
         }
         else if( 10 <= grade && grade < 20 ) {
        	 System.out.println("\twith a grade of J");
         }
         else { // 0 <= grade < 10
             System.out.println("\t with a grade of K");
         }
         
     }
     else {  // either less than 60 or greater than 100
         
         if(grade < 60) {
             System.out.println("You failed with a grade of F");
         }
         else { // greater than 100
             System.out.println("Invalid score, error 404");
         }
         
      
    		  
    	
    	  }
         
     }
     
     
     
     
     
     
     
       
       
       
   }
   


