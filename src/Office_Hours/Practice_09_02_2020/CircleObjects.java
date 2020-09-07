package Office_Hours.Practice_09_02_2020;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        System.out.println("Circle 1");
        System.out.println(circle1.radius);
        System.out.println(circle1.diameter);

       ////
       // System.out.println(circle1.calculateArea());
        System.out.println(circle1.area);

      //  System.out.println(circle1.perimeter());
        System.out.println(circle1.perimeter);
        System.out.println("=========================================================");

       Circle circle2 = new Circle(5);
        System.out.println("Circle 2");
        System.out.println(circle2.radius);
        System.out.println(circle2.diameter);
        System.out.println(circle2.area);
        System.out.println(circle2.perimeter);
        System.out.println("==================================================");

        Circle circle3 = new Circle(6);
        System.out.println("Circle 3");
        System.out.println(circle3.radius);
        System.out.println(circle3.diameter);
        System.out.println(circle3.area);
        System.out.println(circle3.perimeter);

        System.out.println("=====================================");
        // calculate the area of the circle that has the radius of 10;

        System.out.println("Area: " + new Circle(10).area);
        System.out.println("Perimeter" + new Circle(20).perimeter);

        System.out.println("==================================================");

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);












    }
}
