package day08_LogicalOperators;

public class Triangle {
    public static void main(String[] args) {

        double angle1 = 100;
        double angle2 = 60;
        double angle3 = 20;

        boolean validTriangle = (angle1 + angle2 + angle3) == 180;
        boolean invalid = !validTriangle;

        if(validTriangle) {
            System.out.println("This is a valid triangle shape");
        }

        if(invalid) {
            System.out.println("This is not a triangle shape");
        }





    }
}
