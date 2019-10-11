package day24_ArrayRecap;

public class ArraysPractice_LongestName {
	
	public static void main(String[] args) {
		
	
			 
	        /*
	         ask user to enter 5 names. then return the longest name 
	         
	         */
		        
		        
		        
		        
		String[]  names = {"Seyfo","Asiya","Myra","kAteryna",
		                    "Daulet", "vladislav zakharovich skorobogotko",
		                "pneumonoultramicroscopicsilicovolcanoconiosis"};
		        String LongestName ="";
		        
		        int max = 0;
		        for(int i=0; i < names.length; i++) {
		            
		            if(names[i].length() > max) {
		                max = names[i].length();
		                LongestName = names[i];
		                
		            }
		        }
		        
		        System.out.println(max);
		        System.out.println(LongestName);
		        
		        
		
	}

}
