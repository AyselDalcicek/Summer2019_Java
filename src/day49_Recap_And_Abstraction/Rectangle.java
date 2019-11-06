package day49_Recap_And_Abstraction;

  //Area of the rectangle:  width * length
  //Perimeter of rectangle: (width + length) * 2

public class Rectangle extends Shape {
	
	double length;
	double width;
	
    public Rectangle(double length, double width) {  
    	this.length=length;
    	this.width= width;
    // if we do not give constructor shape main method works but we should always need assign 
	// But now    Rectangle rectangle = new Rectangle(10,20);  in main method we can change easily parameter if we need
		
	}
    
    @Override
    protected void Area() {
        double Area = length * width;
        System.out.println("Area of the rectangle is "+Area);
    }
    
    @Override
    protected void perimeter() {
        double perimeter = (length+width) * 2;
        System.out.println("primeter of the rectangle is "+perimeter);
    }

}
