package day25_ArraysContinue;

import java.util.Arrays;

public class WarmUp_DescendingOrder {
	
	public static void main(String[] args) {
		
		
		
		/*Write a program that can print the arrays in descending order (largest to smaller)
		
		*/
		
		int[] descend = {2000, 90, 89, 78, 65, 5555, 444,-5};
			Arrays.sort(descend);
			String result ="[";
			 for (int a = descend.length -1; a >=0; a--) {
				 System.out.print(descend[a] + ", ");
		
			 }
	
            
              
		
	}

}
