package day24_ArrayRecap;

public class WarmUp_MinValueFromArray {
	
	/*
    1. write a program that return the minimum value from an int array
    2. write a program that return the second minimum value from an int array
    
    */
   
	public static void main(String[] args) {
		
	
	
	
	int [] arr = {100, 2, 2, 3, 3, 4, 5, 6};
		int min =9999999;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
	
		System.out.println("minimum number is: "+min);
		
		int secondMin = 9999999;
		for(int j=0; j<arr.length; j++ ) {
			
			if(arr[j]<secondMin  && arr[j]!=min ) { //  arr[j] > min   boyle de yazilabilir/
				secondMin=arr[j];
			}	
		}
		System.out.println("second minimum number is: "+secondMin);
		
		
	}

}
