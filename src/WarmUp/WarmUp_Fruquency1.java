package WarmUp;

public class WarmUp_Fruquency1 {
	
	/*
	 1. write a method that can find the frequency of characters in String.
    Ex: 
        FrequencyTest("XXXYYYZZZ")
        output: X3Y3Z3
        FrequencyTest("AAABBBBBCCCC")
        output: A3B5C4
	 */

	public static void main(String[] args) {
		
		String str = "aaaaabbbbbbbcccccccccDD";
		//        expected result: a5b7c9D2
		//        letters     :"abcd
		
		String removeDup = "";    // to store the non duplicated values of the str
		for(int i=0; i<str.length(); i++) {
			if(!removeDup.contains(str.substring(i, i+1))){
				removeDup+=str.substring(i,i+1);
			}
		}
		
		System.out.println(removeDup);   // abcD
		// String str = "aaaaabbbbbbbcccccccccDD";    removeDup = "abcD"
														//         j, j+1
														//         0  1
		//      (1, 2)
		//      expected result: a5b7c9D2         
		
		String result=""; // count the numbers of appearances
		
		for(int j=0; j<removeDup.length(); j++) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.substring(i, i+1).equals(removeDup.substring(j, j+1))  ) {
				count++;
				
			}
			
		}
		result +=removeDup.substring(j, j+1)+count;
		}
		System.out.println(result);   // a5b7c9D2
		
		
		
		
		
		
	}
}
