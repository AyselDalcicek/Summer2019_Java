
package day34_Contructors;

import java.util.ArrayList;

public class WarmUp_Dupl_Apper_Fruq_MaxArrayL_MaxReturnMeth {
	
	/*
	    
    /*
     Assignment:
        1. write a return method that can remove duplicates from a string
            Ex: RemoveDup("AABBBCCCDD")  ==> ABCD
     
        2. write a return method that passes two string parameters a and b, 
             return the number appearances of b in a
            Ex:     occurred("ABAB" , "A") ==> 2
             
     
        3. combine method 1 and method 2 to write a method that can find 
        the frequency of characters
            Ex: frequency("AAABBBCCCDD")  ==> A3B3C3D2
            
            
	    4. write a return method that can find the maximum number from an Integer arrayList   
	    (DO NOT use sort methods of Collections class)
	    
	    
	    5. write a return method that can find the minimum number from an Integer arrayList    
	     (DO NOT use sort methods of Collections class)
	        
     
     */
	
	public static void main(String[] args) {
		 //task01
        String a = RemoveDup("abcabcdefdef");   // abcdef
                // OR
        System.out.println(a);
        System.out.println( RemoveDup("abcabcdefdef") );  // abcdef
        
		        
		        // task02
		        int count  = ApperanceCount("abaacdabcdaaa", "c"); 
		        System.out.println(count);  // 2
		                 //OR
		        System.out.println( ApperanceCount("abaacdabcdaaa", "c"));  // 2
		        
        
        // task03:
        System.out.println(frequency("abaacdabcnbbbggg"));
          
        
	    
      //task04:
        ArrayList<Integer> list = new ArrayList<Integer>();
               list.add(10);
               list.add(20);
               list.add(0);
               list.add(30);
       
        int maxnum = maximum(list);  // 30
        System.out.println(maxnum);
       
        //task05
       int minnum  = minimum(list); // 0
       System.out.println(minnum);
        
        
    }
    
    
    // task01
    public static String RemoveDup(String str) {
                                    //"abcabc"
        String result = "";
        for(int i=0; i < str.length(); i++) {
            if( ! result.contains( str.substring(i, i+1) ) ) {
                result += str.substring(i, i+1);
            }
        }
        
        return result;
    }
    
    
    // task02
    public static int ApperanceCount(String str1, String str2) {
                            // abab        a   ==>1
                            // bab          a  ==. 2
            
        int count=0;  //  to count how many time b is appeared in a
        
        while(str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
        }
            
        return count;   
        
    }
    
    
    // task03
    public static String frequency(String str) {
                                // "abcabcabc"  ==> "a3b3c3"
                                    
        String nonDup = RemoveDup(str); // "abc"
        String result = "";  // to store the expected result
        
        for(int i=0; i < nonDup.length(); i++) {
                int frequency = ApperanceCount( str ,  ""+nonDup.charAt(i) ); // OR nonDup.substring((i, i+1)
                result += "" + nonDup.charAt(i) + frequency;
                        // OR nonDup.substring((i, i+1)  
        }
            
        return result;
		 
		
		   
   

	}
	
	

    // task04:
    public static int maximum ( ArrayList<Integer>  list) {
        int max = Integer.MIN_VALUE;
        
        for( int each :  list) {
            if(each > max ) {
                max = each;
            }       
        }
            return max;
    }
    
    
    // task05:
    public static int minimum( ArrayList<Integer>  list ) {
        int min = Integer.MAX_VALUE;
        
        for( int each :  list) {
            if(each < min ) {
                min = each;
            }       
        }
            return min;
    	
    }
    
    
    
    
    
}

