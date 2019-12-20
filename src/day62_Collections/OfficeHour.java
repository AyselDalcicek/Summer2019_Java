package day62_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.LinkedList;


public class OfficeHour {

	
public static void main(String[] args) {
        
        String[] s = {"ad","gr"};
       //   List<String> s = new List<>();    cannot creatr obj from List because it is Inerface
        
        
        //pollymorphisim --> object types is child, refrence type is parent class/interface
        List<String> cars = new ArrayList<String>();
        cars.add("bmw");//0
        cars.add("Nissan");
        cars.add("Toyota");
        cars.add("audi");
        
        System.out.println( cars.get(0) ); //bmw
        
        //1.way of prinitng all values
        System.out.println(cars);//toString [bmw, Nissan, Toyota, audi]
        
        System.out.println("     "+ cars);
        
        //2.for each loop
        for(String car : cars) {
            System.out.println("forEach -->  "+car);
//					            forEach -->  bmw
//					            forEach -->  Nissan
//					            forEach -->  Toyota
//					            forEach -->  audi
        }
        
        //remove 
        System.out.println("==================");
        
        //I want to remove audi which is in index 1 
        cars.remove(1);
        
        //here is another remove method, provide the value, then it returns boolean
        boolean b = cars.remove("ab");
        System.out.println("Removed? " +b);   // Removed? false
        
        System.out.println("After romove audi " + cars);   // After romove audi [bmw, Toyota, audi]
        
      //reverse 
        for(int i = cars.size()-1; i >= 0; i-- ) {
            System.out.print(cars.get(i) + ", ");
        }
        
        System.out.println();
        
        Iterator itr = cars.iterator();
        
        System.out.println("Is there any value in cars? " + itr.hasNext());
        
        
        while(itr.hasNext()){ //check if there is any valus in cars collection
            System.out.println(itr.next()); //get value
        }
        
    
        
        
        //created obj from ArrayList
        ArrayList<Integer> price = new ArrayList<>();
        
        
        
        List<String> languaages = new LinkedList<String>();
        languaages.add("java");
        languaages.add("python");
        languaages.add("ruby");
        languaages.add("c++");
        
        System.out.println(languaages);
        languaages.remove(1); //python
        
        for(int i =0; i <languaages.size(); i++  ) {
            System.out.println(languaages.get(i));
        }
        
        
        
        List<String> books = new Vector<String>();
        
        Set<Integer> numbers = new HashSet<>();
        numbers.add(23);
        numbers.add(23);//
        numbers.add(90);
        numbers.add(23);//
        numbers.add(45);
        numbers.add(90);//
        
        System.out.println(numbers);
        
        Iterator itrNum = numbers.iterator();
        
//      System.out.println(itrNum.hasNext()); //
//      System.out.println(itrNum.next()); //getting only one value 
//      System.out.println(itrNum.next());
        
        System.out.println("======");
        
        while(itrNum.hasNext()){
            System.out.println(itrNum.next());
        }
        
        
        
        
    }
}