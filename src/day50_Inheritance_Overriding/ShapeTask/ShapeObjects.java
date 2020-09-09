package day50_Inheritance_Overriding.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.CalculateArea());

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle.CalculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square(2);
        System.out.println(square.calculatePerimeter());
        System.out.println(square.CalculateArea());










    }
}
