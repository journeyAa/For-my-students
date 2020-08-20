package Warm_Ups;
/*
 Create a class called Circle
                variables:
                        radius, pi, diameter
                add a constructor that can initialize the radius of the circle
                instance methods:
                        area(): can return the area of the circle as double
                        perimeter(): cna return the perimeter of the circle as double
                        toString(): returns the info of the circle

 */
public class
Circle {
    double radius;
    static double pi;
    double diameter;

    static {
        pi = 3.14;
    }

    public Circle(double radius, double pi, double diameter){
        this.radius = radius;
        this.diameter= diameter;
    }

    public double area(){
        return radius*radius*pi;
    }

    public String toString(){
        return "Radius of the Circle: " + radius + "\nDiameter of the Circle" + diameter + "\nArea of the Circle: " + area();
    }


}
