package day62_Collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class SetInterface {
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>();
                list1.addAll(Arrays.asList(100, 100, 100));
                
            System.out.println(list1); // [100,100,100]
            System.out.println(list1.get(0)); // 100
        
        Set<Integer> st1 = new HashSet<>();  //
        
       // st1.addAll(Arrays.asList(100, 100, 200));  // it also works
        
                    st1.add(100);
                    st1.add(100);
                    st1.add(100);
                    st1.add(200);
            System.out.println(st1); // [100, 200]
     // System.out.println(st1.get(0));  // set does not have index number
        
            System.out.println("======================");
        Set<Integer> hashset = new HashSet<Integer>();
                hashset.add(100);
                hashset.add(10);
                hashset.add(5);
                hashset.add(4);
                hashset.add(3);
                hashset.add(1);
                hashset.add(100);
            
                System.out.println(hashset);  // HashSet does not keep the objects order as it is
                							// [1, 3, 100, 4, 5, 10]               							
        Set<Integer> linkedhashset = new LinkedHashSet<>();
                linkedhashset.add(100);
                linkedhashset.add(10);
                linkedhashset.add(5);
                linkedhashset.add(4);
                linkedhashset.add(40);
                linkedhashset.add(40);
                System.out.println(linkedhashset); //[100, 10, 5, 4, 40]
                // LinkedHashSet keeps the order as it is 
            // doubly-linked: add() & remove() are faster than HashSet
            
        
        SortedSet<String> treeset = new TreeSet<>();
                    treeset.add("Z");
                    treeset.add("Y");
                    treeset.add("Y");
                    treeset.add("A");
                    treeset.add("B");
                    treeset.add("Z");
                    treeset.add("Z");
                    treeset.add("Z");
                    treeset.add("X");
                    treeset.add("W");
            
                    System.out.println( treeset );   // [A, B, W, X, Y, Z]
                    System.out.println("==============");
                    
                    
        //Task: remove duplicates from an ArrayList, and sorted
                List<Integer> list = new ArrayList<>();
                        list.addAll(Arrays.asList(10,9,3,1,8,8,7,6,10,10,10,10));
                        Collections.sort(list);  // how to sort List
                        
                        System.out.println(list); // [1, 3, 6, 7, 8, 8, 9, 10, 10, 10, 10, 10]
            
            //solution:             
            List<Integer> list2 = new ArrayList<>();
                list2.addAll(Arrays.asList(10,9,3,1,8,8,7,6,10,10,10,10));
                
            TreeSet<Integer> ts = new TreeSet<>(list2  );   
            System.out.println(ts); // [1, 3, 6, 7, 8, 9, 10]
                        
                        
    /*
        String str="AAAABBBCCCDDD"; 
        write program that can remove duplicates from String
        
     */
            String str = "AAZZYYYXXAATTBBCCDDA";  // AZYXTBCD
            String[] arr =  str.split("");
            System.out.println( Arrays.toString(arr) );  
            					// [A, A, Z, Z, Y, Y, Y, X, X, A, A, T, T, B, B, C, C, D, D, A]
            
            
//            System.out.println("---------------------");
//     TreeSet<String> restroom = new TreeSet<>( Arrays.asList(arr) );
//            System.out.println(restroom); //[A, B, C, D, T, X, Y, Z]
//            
//		     HashSet<String> restroom2 = new HashSet<>( Arrays.asList(arr) );
//		     System.out.println(restroom2);  // [A, B, C, D, T, X, Y, Z]
//		     System.out.println("---------------------");
     
    LinkedHashSet<String> restroom = new LinkedHashSet<>( Arrays.asList(arr) );
    System.out.println(restroom);  //[A, Z, Y, X, T, B, C, D]
    String result = restroom.toString().replace("[", "").replace("]", "").replace(", ", "");
            
            System.out.println(result); // AZYXTBCD
            
               System.out.println("-------------------------"); 
               
               
        // second soluition
            String str2 =   new LinkedHashSet<String>(Arrays.asList(arr)).toString();
            System.out.println(str2);  // [A, Z, Y, X, T, B, C, D]
            
            
            
    }
}

