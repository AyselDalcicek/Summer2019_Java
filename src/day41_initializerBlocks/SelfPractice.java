package day41_initializerBlocks;


	public class SelfPractice {
	    String name ="hakan";
	    
	    static String studentName = "Erhan";
	    
	    {
	        studentName = "holly";
	        name = "emrah";
	    }
	    
	    
	    static {
	        studentName = "almaz";
	    }
	    
	    public SelfPractice() {
	        studentName = "bekir";
	        name ="okan";
	    }
	    
	    
	    static {
	        studentName = "juline";
	        
	    }
	    
	    
	    public static void main(String[] args) {
	    	SelfPractice obj = new SelfPractice();
	    
	        System.out.println(obj.studentName);
	        System.out.println(obj.name);
	    }
	    

}
