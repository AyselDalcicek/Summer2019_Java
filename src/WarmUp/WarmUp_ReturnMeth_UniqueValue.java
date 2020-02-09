package WarmUp;

public class WarmUp_ReturnMeth_UniqueValue {
	
	/*
	  	write a return method that accepts String and returns the unique values from the String
 		Ex: 
           Unique("AABBCDEEE")  ==> "CD"
	 */
	
	public static void main(String[] args) {
		
		String word = UniqueValue("AABBCDEEE");
		System.out.println(word);   // CD
		
		
	}


	public static String UniqueValue(String str) { 
							// "AABBCDEEE"    ==>"CD"
		String result =""; // to store unique character
		
		for(int j=0; j<str.length(); j++) {
			
		int count = 0;  // to count number of appearances
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		if(count==1) {
			result+=""+str.charAt(j);
		}
		}
		return result;
	}
	
	
	public static void method1() {   
		return;   // void --> exits  We can not write any value
	}
	
	
}
