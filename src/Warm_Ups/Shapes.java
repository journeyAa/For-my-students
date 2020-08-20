package Warm_Ups;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called Shapes:
                create an arraylist of circle and add 5 objects of circle
                find out the circles that has max and min area
                create a an arraylist of rectangle and add 5 objects of rectangle
                find out the rectangles that has max and min area

 */
public class Shapes {
    public static void main(String[] args) {

        Circle ob1 = new Circle(2,3.14, 4);
        Circle ob2 = new Circle(3,3.14, 6);
        Circle ob3 = new Circle(4,3.14, 8);
        Circle ob4 = new Circle(5,3.14, 10);
        Circle ob5 = new Circle(7,3.14, 14);

        ArrayList<Circle> circles = new ArrayList<>();
        circles.addAll(Arrays.asList(ob1, ob2, ob3, ob4,ob5));

        double max = 0;
        double min = 0;

        for (Circle each: circles){
             max = circles.get(0).area();
             min = circles.get(0).area();
            if(each.area()>max){
                max= each.area();
            }
            if(each.area()<min){
                min = each.area();
            }
        }

        System.out.println("The max area: " + max);
        System.out.println("The min area: " + min);





    }
}
