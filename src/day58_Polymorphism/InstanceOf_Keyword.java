package day58_Polymorphism;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DoubleDV;
import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Cylinder;
import day55_Abstraction.ShapeTask.Rectangle;
import day55_Abstraction.ShapeTask.Shape;

public class InstanceOf_Keyword {
    public static void main(String[] args) {


        Animal animal1 = new Animal(10, 'F');
        Animal animal2 = new Dog("Simba", 4, 'M');
        Animal animal3 = new Cat("Niko", 2, 'M');

        // verify animal3 is the object of Animal class
        boolean r1 = animal3 instanceof Animal;
        System.out.println(r1);

        // verify animal3 is the object of Cat class
        boolean r2 = animal3 instanceof Cat;
        System.out.println(r2);

        // verify animal3 is the object of Dog class
        boolean r3 = animal3 instanceof Dog; // there is no IS a relation
        System.out.println(r3);

        boolean r4 = animal2 instanceof Animal;
        System.out.println(r4);

        System.out.println(animal2 instanceof Dog);

        System.out.println(animal1 instanceof Dog);
        System.out.println("======================================================");

        Circle circle1 = new Circle(10);
        identifyShape(circle1);

        Rectangle rectangle1 = new Rectangle(2,3);
        identifyShape(rectangle1);

        Cylinder cylinder1 = new Cylinder(1,2);
        identifyShape(cylinder1);




    }

    public static void identifyShape(Shape shape){
        if(shape instanceof Circle){
            System.out.println("The shape is circle");
        }else if (shape instanceof Cylinder){
            System.out.println("The shape is cylinder");
        }else {
            System.out.println("The shape is rectangle");
        }
    }

    public static boolean equalShapes(Shape shape1, Shape shape2){
        boolean result = false;

        boolean bothCircle = shape1 instanceof Circle && shape2 instanceof Circle;

        if(bothCircle){
            Circle c1 = (Circle) shape1;
            Circle c2 = (Circle) shape2;
            if(c1.radius == c2.radius){
                result = true;
            }
        }

        return result;


        }
    }



