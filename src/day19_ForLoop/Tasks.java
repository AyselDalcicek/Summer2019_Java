package day19_ForLoop;

public class Tasks {
	
	public static void main(String[] args) {
		
		
	        // task01
	        
	        for(int i = 1; i <= 10; i++) {
	             System.out.println("the square of "+ i + " is: " + (i * i) );
	        }
	            
		
	        System.out.println("====================================");
	            
	        
	        
	        // task02
		
	            for(int i = 1; i <= 32; i++) {
	                
	                if(i %2 == 0) {
	                    System.out.print(i+" ");
	                }
	                
	            }
	            System.out.println();
	        
	        System.out.println("====================================");
	          
	        
	        
	          // task03:
	            
	            for(int i = 1; i <= 32; i++) {
	                
	                if(i %2 == 1) {
	                    System.out.print(i+" ");
	                } 
	                
	                
	            }
	            
	            System.out.println();
	            System.out.println("====================================");
	          
	            
	            
	            // task04:
	            
	            String str = "Java";
	            //			  0123	
	            // "avaJ"
	            String reverse =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	            String reverse2 ="";
	            
	            for (int i = 3; i<=0 ; i--) {  // if many words  int i = str.length()-1
	            	reverse2 +=str.charAt(i);
	            }
	            System.out.println(reverse);
	            System.out.println(reverse2);
	            
	            
	            
	            // task05:
	            System.out.println("====================================");
	            
	            System.out.println("   ^");
		        System.out.println("  /|\\");
		        System.out.println(" / | \\");
		        System.out.println("/  |  \\");
		        
		         for (int i = 0 ; i < 12; i++)
		         {
		         
		        System.out.println("|  |  |");
		        
		         }
		        System.out.println("-------");


		       
		        
	            
	        
	}

}
