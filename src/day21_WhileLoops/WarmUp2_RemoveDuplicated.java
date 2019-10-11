package day21_WhileLoops;

public class WarmUp2_RemoveDuplicated {
	public static void main(String[] args) {
		
		 /*
	      
	     write a java program that can remove duplicated values from String
	        EX:
	            input: aabbcc
	            output: abc
	     */
	    
	        String s1 = "aabbcc";
	        //           i
	        //  a:  (0, 1)  
	    //          (i, 1+1)
	        String result = "";  //abc  // to store the new String value that does not have duplicates
	        
	        for(int i=0; i < s1.length(); i++) {					// if asagidaki gibi de yazilabilir.
	            if(! result.contains( s1.substring(i, i+1) )) {  // if(! result.contains(""+S1.CharAt(i) )) {
	                //                          (5, 6) ==> c						// s!.substring(i,i+1)
	                result += s1.substring(i, i+1);
	            }
	        }
	        System.out.println(result);
	
	        
	        
	}

}
