package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp_RemoveDup_ArrayList {
	/*
	    1. write a return method that can remove the duplicated objects from an Integer arraylist
	    2. write a return method that can remove the duplicated objects from a String arraylist
	    3. write a return method that can remove the duplicated objects from a Character arraylist
	    4. write a return method that can remove the duplicated objects from a Double arraylist
	 */
	
	
	public static void main(String[] args) {
		//Task01:
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3) );
		
		list1 = RemoveDup(list1);
		
		System.out.println(list1); //  //[1,2,3]
		
	            
				ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,4,5,5,6,6));
	            System.out.println(list2); // [4, 4, 5, 5, 6, 6]
	        
	            list2 = RemoveDup(list2);
	            
	            System.out.println(list2); // [4, 5, 6]
		
		
		//Task02:
		String[] names = {"Aysel", "Aysel", "Bera", "Zeynep", "Kadir", "Zeynep", "Zeynep"};
		ArrayList<String> list3 = new ArrayList<>( Arrays.asList( names ) );
		
		        // OR
		//ArrayList<String> list3 = new ArrayList<>( Arrays.asList( 
		                         //  "Aysel", "Aysel", "Bera", "Zeynep", "Kadir", "Zeynep", "Zeynep" ) );
		
		System.out.println(list3); // [Aysel, Aysel, Bera, Zeynep, Kadir, Zeynep, Zeynep]
		
		list3=RemoveDup2(list3);
		System.out.println(list3);  // [Aysel, Bera, Zeynep, Kadir]
		
					//Task03:
					Character[] letters = {'A','A','C','C','C','b','b','a','a','Y'};
					ArrayList<Character> list4 = new ArrayList<>(Arrays.asList(letters) );
					System.out.println(list4);  // [A, A, C, C, C, b, b, a, a, Y]
					
					list4=RemoveDup3(list4);
					System.out.println(list4);  // [A, C, b, a, Y]
		
					
		//Task04:	
		Double[] num = {1.4, 1.4, 1.4, 1.4, 4.0, 6.7, 3.0, 3.0, 3.0} ;
		ArrayList<Double> list5 = new ArrayList<>( Arrays.asList(num) );
		
   // OR ArrayList<Double> list5 = new ArrayList<>(Arrays.asList(1.4, 1.4, 1.4, 1.4, 4.0, 6.7, 3.0, 3.0, 3.0));
	
		list5=RemoveDup4(list5);
		System.out.println(list5);
					
		
	}
	//Task01:
	public static ArrayList<Integer> RemoveDup(ArrayList<Integer> list) {
		ArrayList<Integer> result = new ArrayList<>();
	
		/*
		for (Integer each : list) {
			if(! result.contains(each) ) {
				result.add(each);
		}
	}
	*/  // second way
		for(int i =0; i<list.size(); i++) {
			if( ! result.contains(list.get(i) ) ) {
				result.add(list.get(i) );
			}
		}
	return result;
	}

  // task02:
	public static ArrayList<String>  RemoveDup2 ( ArrayList<String>  list ){
        ArrayList<String> result = new ArrayList<>();  //[1,2,3]
        
        for(int i=0; i < list.size(); i++ ) {
            if( ! result.contains( list.get(i) )  ) {
                result.add( list.get(i)  );
            }
        }
    
        return result;
    }
	
	
	// task03:
	public static ArrayList<Character> RemoveDup3 ( ArrayList<Character> list){
		ArrayList<Character> result = new ArrayList<>();
		
		for(int i =0; i<list.size(); i++){
			if( ! result.contains(list.get(i) )){
				result.add(list.get(i));
			}
		}
		return result;
	}
	
	// task04:
	public static ArrayList<Double> RemoveDup4 (ArrayList<Double> list){
		ArrayList<Double> result = new ArrayList<>();
		
		 for(int i =0; i<list.size(); i++) {
			 if( ! list.contains(list.get(i)) ) {
				 result.add(list.get(i));
			 }
		 }
		
		return result;
		
	}
	

	
}
