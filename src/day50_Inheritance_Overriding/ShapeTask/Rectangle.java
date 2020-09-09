package day50_Inheritance_Overriding.ShapeTask;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
        area = CalculateArea();
        perimeter = calculatePerimeter();
    }

    public double CalculateArea(){
        return width*length;
    }

    public double calculatePerimeter(){
        return (width+length)*2;
    }


}
