package day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		

        /*
         Declaration of arrayList:
                ArrayList<ClassType> variableName = new ArrayList<>();
                
                ArrayList<ClassType>  variableName = new ArrayList<ClassType>();
         */
		
		int[] arrya1 = new int[1];
		
		ArrayList<Integer> list = new ArrayList<>();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
				list2.add( 10 );  // if we do not write this print will be --> []     // auto-boxing
				
				list2.add( 20 );  // if we do not add this print will be --> [10]
				
				list2.add( 30 );  // if we do not add this print will be --> [10, 20] 
			  // [10, 20, 30]  
		// index:  0   1   2
				
		System.out.println(list2);  // [10, 20, 30]  
		
		System.out.println(list2.get(1) ); // 20
	 // System.out.println(list2.get(9));  // maximum index number is 2 
		
		
		System.out.println(list2.size()); //3
		
			list2.clear();  // clears the array removes all the values out from the array
			
			System.out.println(list2); // []
			
			System.out.println(list2.size()); // 0
	
	
	
	
	}
	
	

}
