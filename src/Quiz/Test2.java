package Quiz;

// quiz 11

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
		
		Test2 test = new Test2(25);
		System.out.println(test.total);
	
	
	}
	
}
