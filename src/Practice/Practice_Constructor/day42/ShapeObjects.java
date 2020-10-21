package Practice.Practice_Constructor.day42;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.setInfo(10);
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());
        System.out.println(circle1);

        Circle circle2 = new Circle();
        circle2.setInfo(3);
        System.out.println(circle2);

        Circle circle3 = new Circle();
        circle3.setInfo(4);
        System.out.println(circle3);











    }
}
