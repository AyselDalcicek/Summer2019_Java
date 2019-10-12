package day36;


public class ConstructorsReview {

	public ConstructorsReview() {
	
	System.out.println("default constructor");

}

public ConstructorsReview(int a) {
	
	System.out.println("Constructor with argument int: "+a);
	
}


public static void main(String[] args) {
	
	
	ConstructorsReview obj = new ConstructorsReview(); 
	
//	ConstructorsReveiw obj2 = new ConstructorsReveiw("Batch 12"); 
						// the constructor with arg of String is not exist
	
	ConstructorsReview obj2 = new ConstructorsReview(10); 
	
	
        
    }
    

}
