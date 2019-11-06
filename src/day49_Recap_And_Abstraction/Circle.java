package day49_Recap_And_Abstraction;

//Area of the circle:     3.14 * radius * radius
//Perimeter of circle:    3.14 * 2 * radius

public class Circle extends Shape {
    
    double radius;
    double diameter;
    final double PI = 3.14;
    
    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2 ;
    }
    
    @Override
    protected void Area() {
        double Area = radius * radius * PI;
        System.out.println("Area of the circle is "+Area);
    }
    
    @Override
    protected void perimeter() {
        double perimeter = PI * diameter;
        System.out.println("perimeter of the circle is "+perimeter);
    }
    

}
