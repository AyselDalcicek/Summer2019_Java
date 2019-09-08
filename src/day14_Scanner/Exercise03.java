package day14_Scanner;

import java.util.Scanner;

public class Exercise03 {
	
	public static void main(String[] args) {
		
		/*
		 Write a program that determines the change to be dispensed from a vending
		machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
		increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
		dollar bill to pay for the item.
		Input: 
		Enter price in cents: 95↵
		Output:
		Your change is 0 quarters, 0 dimes, and 1 nickels.
		Remember:
		1 quarter = 25 cents.
		1 dimes = 10 cents.
		1 nickels  = 5 cents.
		you will need to use assignment and short hand operators for this task. Good luck (edited) 
		 */
		
		
		Scanner dolar= new Scanner(System.in);
		
		System.out.println("Please enter price in cent");
		
		int price, change, quarter, dime, nickel,
		
			input = dolar.nextInt();
		
		if (input>0 && input<=100 && input%5==0) {
			 change = 100 - input;
			 quarter = change/25;
			 change %= 25;
			 dime = change/10;
			 nickel = change%10;
			 
			System.out.println("Your change is : "+quarter+" quarter "
								+dime+" dimes "+nickel+" nickels.");	
		}else {
				System.out.println("Invalid Input");
				
				
			}
		
		
			}
			
		
		
	
		
		
	
		
		
		
		

	}
