package Warm_Ups;
/*
Create a class called Rectangle
                instance variables:
                    length, width
                add a constructor that initialize the fileds
                instance methods:
                        area(): can return the area of the rectangle as double
                        perimeter(): cna return the perimeter of the rectangle as double
                        toString(): returns the info of the rectangle objects

 */
public class Rectangle {
    double length;
    double width;

   public Rectangle(double length, double width){
       this.length = length;
       this.width = width;
   }

   public double area(){
       return length*width;
   }

   public double perimeter(){
       return 2*(width + length);
   }

   public String toString(){
       return "Rectangle width: " + width + ", Length: " + length + ", Perimeter: " + perimeter() + " Area: " + area();
   }
}
