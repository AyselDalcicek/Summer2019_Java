package day56_Polymorphism;

class Animal{
	
	public void method1() {
		
	}
	
	
}

class Dog extends Animal {
		// Dog IS An Animal
	public void method2() {
		
	}
	
}


public class UpCasting {   // Converting sub type to super type.
	
	public static void main(String[] args) {
		
		System.out.println(  (double)10 );
		
		// UpCasting: casting subclass to superior type  
		Dog  obj = new Dog();       	

		Animal obj2 = (Animal)obj;    // Like child can enventually be parent so it always allowed
		
		 // Down casting
		Animal obj3 = new Animal();		
		
		Dog obj4 = (Dog)obj3; // not allowed  because like parent can enventually can not be a child
						// Dog obj4 = obj3; it gives compile error so 
						// to get rid off the compile error we are casting.
						// but when we run it, it gives us ClassCastException
		
		System.out.println("Hello");
		
		
		
		
	}

}