package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodsPractice {
	
	public static void main(String[] args) {
		sum(10, 20);  // 30
		
	//	int max=sum(10,20); // the method sum does not return any value
		
		addition(10, 20); // this method is an int value
		
		System.out.println(addition(10, 20));  // 30
		
		int num= addition(10, 20);
		System.out.println(num);     //30
		
		byte num2 =(byte)addition(10, 20);
		System.out.println(num2);    //30
		
		float num3 =addition(10, 20);
		System.out.println(num3);    // 30.0
		
		System.out.println("============================");
		
		
		
		
				
				int max= (int)graterNumber(90, 200, 30);  
				// it's gonna be reusable if we assign to a variable
				
				System.out.println(max);    // 200
				
				System.out.println(graterNumber(90, 200, 30));   // 200.0
				
				
    	System.out.println("----------------------------------------");
				
			    int[] arr = {20, 30, 1, 2, 3, 5, 9};
				int maxNum = maximum(arr);
				System.out.println(maxNum);   // 30
				
				
				
				int[] arr2 = {1000, 90000, 876544, 66788, 7778889};  
				int maxNum2 = maximum(arr2);  // 30
				System.out.println(maxNum2);  // 7778889
				
				
				
				
		 String[] names = {"Aysel", "Bera", "Kadir", "Zeynep", "Dalcicek"};
		
		 String longname = Longest(names);
		 System.out.println(longname);  // Dalcicek
		    
		 System.out.println( Longest(names) );  // Dalcicek
		    
			    
			    
		 
			   int[] array = {1,2,3,4,5,6,7};  // 7 6 5 4 3 2 1
			   array = Sort(array);
			   System.out.println( Arrays.toString(array) );  // [7, 6, 5, 4, 3, 2, 1]
			            
			            
		            
		}
	
	// write a method that accepts an int array and returns the maximum number from the array
	public static int maximum(int [] arr ) {
		
		Arrays.sort(arr);
		
		return arr [arr.length-1];
		
	}
	
	
	
	
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public static int addition(int a, int b) {
		return a+b;	
	}
	
	
	// write a method that accepts 3 numbers and returns the largest number
	public static double graterNumber(int a, int b, int c) {
		int[] arr = {a,b,c};
		//
		Arrays.sort(arr);
		return arr[arr.length-1];
	}			
			
	 // write a method that accepts String array, and returns the longest String value form the array
		public static String Longest(String[] arr ) {
			
			String longWord ="";
			
			int max=0;
			for ( int i=0; i<arr.length; i++) {
				if (arr[i].length()>max) {
					max=arr[i].length();
					longWord=arr[i];
				}
			}
			return longWord;
		}
			
		// write a method that accepts an int array and sorts it then return an array.
			public static int[] Sort(int[] arr) {
									// {5,3,2,22,3};
				Arrays.sort(arr); // [2,3,3,5,22]
				int[] numbers =new int[arr.length];
				
				int z =0;
				for(int i=arr.length-1; i>=0; i-- ) {
					numbers[z]=arr[i];
					z++;
				}
				return numbers;
			}
			
			
			
			
		
	}
	


