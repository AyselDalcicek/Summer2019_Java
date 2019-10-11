package day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethods {
	public static void main(String[] args) {
		
		
		  /*
        to print entire array as whole, we need to convert the array to String
                  Arrays.toString( VairableName ): used for converting single
                       dimensional arrays to  String  value
                       
                  Arrays class: Utility of all the arrays, 
                              Arrays class is presented in "Java.util"package
                       
                       
       */
		

		int num1 =10;
		System.out.println(num1);  // 10
		
		int[] arr = {1,2,3};
		System.out.println(arr);  // [I@24d46ca6
		
		String str = Arrays.toString(arr);
		System.out.println(str);  // [1, 2, 3]
		
		String[] names = {"Elvira", "Bibish", "Tural", "Daulet", "Aysel"};
		System.out.println(names[0]);  //Elvira
		System.out.println(names); // hash code
		System.out.println(Arrays.toString(names)); // [Elvira, Bibish, Tural, Daulet, Aysel]
		
		System.out.println("===============================");
		
		
		  
        /*
         Arrays.sort(variableName): 
                    sorts the values of the array in ascending order (smallest to largest)
         
         */
		
		int[] Numbers = {9,8,100,3000,4,5,6};

		System.out.println(Arrays.toString(Numbers));  // [9, 8, 100, 3000, 4, 5, 6]
		

        Arrays.sort(  Numbers );   // sort all the values of the array in ascending order

        						// sort method does:    Numbers = [4, 5, 6, 8, 9, 100, 3000];
        
		
		System.out.println(Arrays.toString(Numbers)); //  [4, 5, 6, 8, 9, 100, 3000]
		
		System.out.println("Maximum: " + Numbers[Numbers.length-1]);
		System.out.println("Minimum: " + Numbers[0]);
		
		
		
		String[] NameLists = {"Alma", "Enes", "Myra", "Simith", "Sarah", "Lexi", "ABC","Abc","abc"};
			Arrays.sort(NameLists);		// alphabetical order ( from AsCII table)
			
			System.out.println(Arrays.toString(NameLists)); // [ABC, Abc, Alma, Enes, Lexi, Myra, Sarah, Simith, abc] 
			
			
		char[] ch = {'0','9','8', '5', '3', '2','1'};
			Arrays.sort(ch);
			System.out.println(Arrays.toString(ch));  // [0, 1, 2, 3, 5, 8, 9]
			
			
			int[] nums = {2000, 90, 89, 78, 65, 5555, 444,-5};  // [-5, 65, 78, 89, 90, 444, 2000, 5555]
				Arrays.sort(nums);
			System.out.println(Arrays.toString(nums));
			System.out.println("Minimun Number: "+nums[0]);
			System.out.println("Maximum Number: "+nums[nums.length-1]);
			System.out.println("Second Maximum Number: "+nums[nums.length-2]);
			System.out.println("Second Minimum Number: "+nums[1]);
				
		
		
		
	}

}
