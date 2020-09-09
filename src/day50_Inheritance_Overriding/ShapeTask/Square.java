package day50_Inheritance_Overriding.ShapeTask;

public class Square extends Shape {

    public double side;

    public Square(double side){
        this.side = side;
        perimeter = calculatePerimeter();
        area = CalculateArea();

    }
    public double calculatePerimeter(){
        return side*4;
    }

    public double CalculateArea(){
        return side*side;
    }
}
