package day50_Inheritance_Overriding.ShapeTask;
/*
  2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
             give the instance variables that are needed to calculate the Area, perimeter, of those shapes
    AFTER TODAY'S TOPIC:

    variable: area, perimeter
    methods: calculateArea, calculatePerimeter
 */



    public class Circle extends Shape {
    public double radius;
    public double diameter;
    public static double PI= 3.14;

// we need constructor to initialize the radius
    public Circle(double radius){
        this.radius=radius;
        diameter = radius *2;
        area = CalculateArea();
        perimeter = calculatePerimeter();
    }

    public double CalculateArea(){
        return radius*radius*PI;
    }

    public double calculatePerimeter(){
        return diameter*PI;
    }

}
