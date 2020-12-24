package Practice.pracice_Inheritance.day50;

public class Square extends Shape {

    public double side;

    public Square(double side){
        this.side=side;
    }

    public double calculateArea(){
        return side*side;
    }

    public double calculatePerimeter(){
        return side*4;
    }




}
