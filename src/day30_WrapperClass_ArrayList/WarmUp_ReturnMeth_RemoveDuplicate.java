package day30_WrapperClass_ArrayList;

public class WarmUp_ReturnMeth_RemoveDuplicate {
	
	/*
    	write a return method that accepts a String and removes duplicate values from the String
   		Ex:
       RemoveDuplicate("aaabbbccc") ==> "abc"
 
    */
	
	
	public static void main(String[] args) {
		
		
		String word =RevDuplicate("aabbcc");    // word==> can be any name
				System.out.println(word);  // abc
		
		
	}
	
	public static String RevDuplicate (String str ) {
									//  "aabbcc";  ==>  "abc
		String result ="";    // to store the non duplicated values
		for(int i=0; i<str.length(); i++) {
			if(!result.contains(str.substring(i, i+1))){
				result+=str.substring(i, i+1);
			
			}
		}
		
		return result;
		
	}
	
	

	
	
	
	
	
	
	
}
