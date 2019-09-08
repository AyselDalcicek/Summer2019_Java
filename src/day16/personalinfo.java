package day16;

import java.util.Scanner;

public class personalinfo {
	
	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Welcome to the patient portal!");
	        System.out.println("Please enter your personal information");
	        System.out.println("Enter your first name");
	        String firstName = scan.next();
	        System.out.println("Enter your last name");
	        String lastName = scan.next();
	        System.out.println("Enter your email");
	        String email = scan.next();
	        email += scan.nextLine();
	        System.out.println("Enter your street");
	        String street = scan.next();
	        street += scan.nextLine();
	        System.out.println("Enter your city");
	        String city = scan.next();
	        city += scan.nextLine();
	        System.out.println("Enter your state");
	        String state = scan.next();
	        System.out.println("Enter your zip code");
	        int zipcode = scan.nextInt();
	        System.out.println("Enter your work phone number");
	        long workPhoneNumber = scan.nextLong();
	        System.out.println("Enter your personal phone number");
	        long personalPhoneNumber = scan.nextLong();
	        System.out.println("Enter your age");
	        int age = scan.nextInt();
	        System.out.println("Enter your height");
	        double height = scan.nextDouble();
	        System.out.println("Enter your weight");
	        double weight = scan.nextDouble();
	        System.out.println("Are you married?");
	        boolean isMarried = scan.nextBoolean();
	        
	        String contacts =("work phone number - " +workPhoneNumber+", personal phone number - "+personalPhoneNumber );
	        String fullName = (lastName+", "+firstName);
	        String address =("Address: "+street+", "+city+", "+state+" "+zipcode);
	        
	        System.out.println("Patient personal information"+ 
	        "\n"+"Full name: "+fullName+"\n"+address+"\n"+"Contacts: "
	        		+ ""+contacts+ ", email: "+email+"\n"+"Age: "+age+"\n"+"Height: "
	        				+ ""+height+"\n"+"Weight: "+weight+" pounds"+"\n"+"Married?: "+isMarried);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
