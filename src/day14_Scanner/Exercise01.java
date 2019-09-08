package day14_Scanner;

import java.util.Scanner;

public class Exercise01 {
	
	public static void main(String[] args) {
		
		/*
		Write a Java program to calculate total amount of sale based on the unit price and quantity of a product taken.
		User should be able to enter unit price and quantity.
		Then the program will perform calculations and display amounts.
		The discount rate is 10% for the quantity purchased between 100 and 120 units, and 15% for the quantity purchased greater than 120 units.
		If the quantity purchased is less than 100 units, the discount rate is 0%.
		See the example output as shown below:
		Input:
		Enter unit price: 25
		Enter quantity: 110
		Output:
		Grand Total: $ 2750.0
		Discount: 10%
		Discount applied: $ 275.0
		Total: $ 2475.0
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter unit price");
	    double unitprice = input.nextDouble();
	      
	    System.out.println("Please enter quantity");
	    int quantity =input.nextInt();
	    
	    double grandTotal = unitprice*quantity;		
		
		if (quantity >=100 && quantity<=120) {
			double discount=grandTotal*10/100;
			System.out.println("Grand Total : $ "+grandTotal);
			System.out.println("Discount : %10");
			System.out.println("Discount Applied : $ "+discount);
			System.out.println("Total : "+(grandTotal-discount));
		}	
		  else if  (quantity>=120) {    
	          double discount = grandTotal*15/100;
	          System.out.println("Grand Total : $" + grandTotal);
	          System.out.println("Discount : %15");
	          System.out.println("Discount Applied : $ "+ (discount));
	          System.out.println("Total : $ "+ (grandTotal-discount));   
	      }
	      else {   
	         System.out.println("Grand total : $ " + grandTotal);
	         System.out.println("Discount : %0 ");	         
	         System.out.println("Discount Applied : $ 0");	         
	         System.out.println("Total : $ " + (grandTotal));
		
	      }
		
		
		
		
		
	}

	}
