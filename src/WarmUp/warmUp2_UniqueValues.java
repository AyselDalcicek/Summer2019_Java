package WarmUp;

public class warmUp2_UniqueValues {
	/*
	 *
	/*Write a program that can print out the unique values from an int Array.
	 */
	public static void main(String[] args) {
		
		
		String[] arr = {"A","A","A","A","B","C","C"};
	   // index:        0     1    2    3    4
		
		for(int j = 0; j<arr.length; j++) {
			
			int count = 0;
			for(int i = 0; i<arr.length; i++) {
				if(arr[i].equals(arr[j])) { //if(arr[i]=="A" boyle de olur ama new Int olunca yazdirmaz
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[j]);
			}
			
	}	
			
			
		
	
}
}
