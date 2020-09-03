package day50.ShapeTask;
/*
  2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
             give the instance variables that are needed to calculate the Area, perimeter, of those shapes
    AFTER TODAY'S TOPIC:
 */
public class Circle extends Shape {
    public double radius;
    public double diameter;
    public static double PI= 3.14;

    public Circle(double radius){
        this.radius=radius;
        diameter = radius *2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return radius*radius*PI;
    }

    public double calculatePerimeter(){
        return diameter*PI;
    }

}
