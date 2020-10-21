package Practice.Practice_Constructor.day42;

import Git.Phone;

public class Circle {

    double radius;
    double diameter;
    static double PI= 3.14;

    public void setInfo(double radius){
        this.radius=radius;
        diameter = radius*2;

    }

    public double calcArea(){
        return radius*radius*PI;
    }

    public double calcPerimeter(){
        return diameter* PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
