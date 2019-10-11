package day29_ReturnMethods;

public class WarmUp_Fruquency2 {
	
	public static void main(String[] args) {
		
		String input = "XXXXXYYYYZZ";
		
		String nonDup ="";
		for(int i = 0; i<input.length(); i++) {
			if(!nonDup.contains(""+input.charAt(i)) ){
				nonDup+=""+input.charAt(i);
				
				
			}
		}
		System.out.println(nonDup);   // XYZ

		
		String result ="";
		
		for(int j=0; j<nonDup.length(); j++) {
			int count =0;
			for(int i=0; i<input.length(); i++) {
				if(input.charAt(i)==nonDup.charAt(j)) {
					count++;
				}
			}
			result+=""+nonDup.charAt(j)+count;   
			}
			System.out.println(result);   // X5Y4Z2
			
		
		
		
	}

}
