package day26_ForEach;

public class continueStatements {
	
	public static void main(String[] args) {
		
		
		String str = "java";
		System.out.println(str.length()); // 4
		
		
		for(int i=0; i < 5; i++) {
			if(i > 2) {
				continue;
			}
			
			System.out.print(i+" ");  // 0 1 2 
			
		}
		
		System.out.println();
		
		int[] numers = {1,2,3,4,5};
		
		for(int i =0; i < numers.length; i++) {
			
			if(numers[i] < 3) {
				continue;
			}
			
			System.out.print(numers[i] +" ");
			
			/*
			if(numers[i] < 3) {
				continue;
			}       
			*/
			
		}
			
		
	}

}
