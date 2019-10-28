package day36_JavaReview;

import java.util.ArrayList;

public class SelfPractice_addMethod {
	public static void main(String[] args) {
		

	ArrayList<String> list = new ArrayList<>();
	list.add("Medina");
	list.add(1, "Erkan");
	list.add(2, "Hakan");
	System.out.println(list);  // [Medina, Erkan, Hakan]
	
			
			ArrayList<String> list2 = new ArrayList<>();
		//	list2.add("Medina");
		//	list2.add(2, "Erkan");
		//	list2.add(1, "Hakan");
		//	System.out.println(list2);  // compile error
	
     ArrayList<String> list3 = new ArrayList<>();
	//  list3.add(2, "Ayse");  // compile error   OR //  list3.add(3, "Ayse"); compile error
	 list3.add("Medina");
   	 list3.add(1, "Erkan");
	 list3.add(0, "Hakan");
	 System.out.println(list3);	 // [Hakan, Medina, Erkan]
	 
     ArrayList<String> list4 = new ArrayList<>();
     list4.add("Medina"); 
     list4.add(1, "Erkan"); 
     list4.add(0, "Hakan");
     list4.add(2, "Ayse");
	 System.out.println(list4);	// [Hakan, Medina, Ayse, Erkan]
	 
	System.out.println("------------------------------");
	 ArrayList<String> list5 = new ArrayList<>();
	 list5.add("Enes");  
	 list5.add("Akobir");  
	 list5.add(1, "Alex");  
	 list5.add(0, "Alp");
	 System.out.println(list5); // [Alp, Enes, Alex, Akobir]	
			
	
	ArrayList<String> names = new ArrayList<>();
		   
		   names.add("Bera");
		   names.add(1,"Aysel");
		   names.add(1,"Kadir");
		   names.add(0,"Asiya");
		   names.add("Zeynep");
		   System.out.println(names);  // [Asiya, Bera, Kadir, Aysel, Zeynep]
		   String str1= names.get(4);
		   System.out.println(str1);  // Zeynep
	}
}
