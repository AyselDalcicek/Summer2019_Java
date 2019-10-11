package day22_NestedLoop;

public class practice_triangle2 {
	public static void main(String[] args) {
		
			
			 /*
	        
	         ******
	         *****
	         ****
	         ***
	         **
	         *
	  
	  */  
			
		
        for (int x = 1; x<=7; x++) {
        	
        	for (int y = 7; y >= x; y--){
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
       
	}

}
