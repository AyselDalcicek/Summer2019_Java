package WarmUp;

public class WarmUp_kmToMiles_gallonToLitters {
	
	 /*
    1. write a method that can convert km to miles
                   1 km = 0.612 miles
    2. write a method that can convert gallons to litters
                  1 G = 3.75 L
                  
    */
	
	public static void main(String[] args) {
		
 //  KmToMiles(); // not enough info for the method to perform its tasks
        
        KmToMiles(1000);  // KmToMiles( 10.0 );
		
		KmToMiles(1000);
		
		GallonToLitter(85.5);
		
		
		
	}
	
	
	
	public static void GallonToLitter(double gallons ) {
		double litters = gallons*3.75;
		System.out.println(gallons+" gallons equal to "+litters+"litters");
	}
	
	
	public static void KmToMiles(double KM) {
		
		double Miles = KM *0.612;
		System.out.println(KM+" km equals to "+Miles+" miles");
		
		
		
	}
	

}
