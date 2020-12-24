package Practice.practice_Abstraction.day55;

public abstract class Shape {
    /*
      1. create an abstract class called Shape
            attributes:
                name(static), area, perimeter, hasVolume(static), volume
            abstract methods: calculateArea(), calculatePerimeter(), calculateVolume()
                                return-types: double

     */

    public static String name;
    public double area;
    public double perimeter;
    public static boolean hasVolume;
    public double volume;



    public abstract double calcArea();

    public abstract double calcPerimeter();

    public abstract double calcVolume();
}
