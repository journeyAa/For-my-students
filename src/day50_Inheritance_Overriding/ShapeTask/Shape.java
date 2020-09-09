package day50_Inheritance_Overriding.ShapeTask;

/*
warmup Task:
        1. create a class called Shape
                        vairables: area, perimeter
                        methods: calculateArea(), calculatePerimeter()

        3. override super class' calculateArea(), calculatePerimeter() methods to the sub classes:
                Area of the circle:    3.14 * radius * radius
                Area of the rectangle:  width * length
                Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
                Perimeter of Square: 4 * side

 */

public class Shape {
    public double area;
    public double perimeter;

    public double CalculateArea(){
        return 0;
    }

    public double calculatePerimeter(){
        return 0;
    }

    public double getArea() {
        return 0;
    }
}
