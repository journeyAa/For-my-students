package Practice.pracice_Inheritance.day50;
/*
 2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
             give the instance variables that are needed to calculate the Area, perimeter, of those shapes

 */

public class Circle extends Shape{

    public double radius;
    public static double PI;

    static {
        PI=3.14;
    }

    public Circle(double radius){
        this.radius=radius;
        area = calculateArea();
        perimeter=calculatePerimeter();
    }

    public double calculateArea(){
        return radius*radius*PI;
    }

    public double calculatePerimeter(){
        return radius*2*PI;
    }


}
