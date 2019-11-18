package day48_MethodOverriding;

public class Tests{
	
	
	int num = 10;
	
	public static void main(String[] args) {
		Tests obj1 = new Tests();
		obj1.num=20;
		Tests obj2 = new Tests();
		System.out.println(obj2.num);
	}
	

}
