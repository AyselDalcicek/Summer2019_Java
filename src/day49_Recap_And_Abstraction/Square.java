package day49_Recap_And_Abstraction;

 // Area of the square:     side * side
 //Perimeter of Square: 4 * side

public class Square extends Shape{
    
    double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    protected void Area() {
        double Area = side*side;
        System.out.println("Area of the Square is "+Area);
    }
    
    @Override
    protected void perimeter() {
        double perimeter = side * 4;
        System.out.println("perimeter of the square is "+perimeter);
    }
}
