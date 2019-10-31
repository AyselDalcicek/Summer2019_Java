package day43_JavaRecap;

import day42_EncapsulationOOP.TestData;
import day44_AccessModifiers.Testdata;
import day44_AccessModifiers.defaultAccessModifer;

public class Test2 {
	static int a;  int b;
	
	long total = 100; // 200,  175
	
	public Test2() {
		
		total -= 50;
		
	}
	
	public Test2(int total) {
		this();  //  total = 150;
		this.total += total;  // total += 25  ==> 175
	}
	
	{
		total *= 2 ; 
	}
	
	static {
		int total = 20;
		total /= 2;
	}
		
	public static void main(String[] args) {
		
		System.out.println(Testdata.age); // package 44 
		System.out.println(Testdata.Name); // package 44 
		System.out.println(Testdata.ID);	// package 44 
		
	//	System.out.println(Testdata.salary); // default access modifier is not visible outside package  // package 44 
	//	System.out.println(Testdata.number); // protected access modifier is not visible outside package // package 44 
		
		defaultAccessModifer obj = new defaultAccessModifer(); // package 44 
		System.out.println(obj.namePublic);  // // package 44 
	//	System.out.println(obj.namePrivate); // access modifier is private  // package 44 
	//	System.out.println(obj.nameDefault); // access modifier is default is only visible in same package  // package 44 
		
		
		Test2 test = new Test2(25);
		System.out.println(test.total);
	
	
	}
	
}
