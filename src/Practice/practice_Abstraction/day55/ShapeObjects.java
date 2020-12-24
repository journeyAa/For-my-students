package Practice.practice_Abstraction.day55;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle= new Circle(2.5);
        System.out.println(circle);

        System.out.println("Circle.hasVolume = " + Circle.hasVolume);

        System.out.println("========================================================");

        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle);


    }
}
