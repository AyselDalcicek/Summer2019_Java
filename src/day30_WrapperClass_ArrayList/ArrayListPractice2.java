package day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<=30; i++) {
			if(i%2!=0) {
				continue;
			}	
				list.add(i);
			
			
		}
		
		System.out.println(list); // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30]
		
		System.out.println(list.size()); // 16
		
		System.out.println(list.get(4)); // 8
		
			
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i)+" "); //  0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 
			}
			System.out.println();
		
	
			for(int each: list) {  // un-boxing  --> we can also write Integer 
				System.out.print(each+" ");  //  0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 
			}
				
			System.out.println();
			
			
			int num = list.get(7);  //  un-boxing,  there is no primitives in ArrayList
			System.out.println(num);  // 14
			
			// list.clear();  // the size of list becomes 0:   []
			System.out.println(list.get(2)); 
			
			
			
			 ArrayList<Integer> list2 = new ArrayList<>();
	            
	            for(int i=20; i >= 0; i--) {
	                list2.add(i);
	            }
	        
	        System.out.println(list2);
	        
	        
	        // sorting the arraylist:
	                        Collections.sort(list2);
	                    System.out.println(list2);
	        
	}

}
