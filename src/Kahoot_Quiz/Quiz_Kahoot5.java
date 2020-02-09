package Kahoot_Quiz;

public class Quiz_Kahoot5 {
	public static void main(String[] args) {
		
		int i =5;  
        do {
            i--;
            System.out.print(i + " ");  // 4
        //  i++;
            
        }while(i >0);
        System.out.println();
        
        System.out.println("==============");
        
        int x ;
        int y = 5;
        for(x = 0; x < y ; x ++ ) { //  x =3  x=6;
            
            System.out.print(   (x+=2)   +" ");
            //                   2  5 
        }
        
        System.out.println();
        System.out.println("==============");
        
        int X =10;  // 10 + 0 = 10+1 =11+2+3+4+5 =25
        
        for(int j=0 ; j <= 5; j++) {  // j: 0 1 2 3 4 5
            X += j;
        }
        
        
        for( int a =0; a< 5; a++) {
            System.out.print(a+" ");
            break;
        //  System.out.println("Hello");  // break statement is the closing statement
        }
        System.out.println();
        System.out.println("*******************");
        
        
        String str = "Java";
        String str2 = new String(str); // "Java"
        System.out.println( str == str2); //false,  differnet memory
        System.out.println( str.equals(str2) );  // true
        
        int count  = 10;
        
        do {
            count += 2;
        }while( str == str2);
        
        System.out.println(count);  //12
        
        System.out.println("*******************");
        
        int count2  = 10;
        
        while( str == str2) {
            count2 += 2;
        }
        System.out.println(count2);  // 10
        
        
        
        
		
		
		
	}

}
