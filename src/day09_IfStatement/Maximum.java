package day09_IfStatement;

public class Maximum {
    public static void main(String[] args) {

        // write a java program that accepts three numbers and return the max number
        // (assume none of them are equal)

        double a = 250;
        double b = 490;
        double c = 936;

        boolean aIsMax = (a > b && a >c );

        boolean bIsMax = (b > a && b > c);
        // bIsMax = aIsMax == false && b > c;

        boolean cIsMax = (c > a && c > b);
        // cIsMax = !aIsMax && bIsMax == false;
        //

        double max = 0; // we want to assign the max num to variable max

        if (aIsMax) {
            max = a;
        }
        if (bIsMax) {
            max = b;
        }
        if (cIsMax) {
            max = c;
        }

        System.out.println(max + " is the max number");

        boolean aIsMin = a < b && a < c;

        boolean bIsMin = aIsMin == false && b < c;
        // b < a && b< c
        boolean cIsMin = aIsMin == false && bIsMin == false;
        //c < a && c < b;

        double min = 0;
        if(aIsMin) {
            min = a;
        }
        if (bIsMin) {
            min = b;
        }
        if (cIsMin) {
            min = c;
        }

        System.out.println(min + " is the min number");

        boolean aIsMed = (a > b && a < c) || (a > c && a < b);

        boolean bIsMed = (b > c && b < a) || (b < c && b > a);

        boolean cIsMed = !aIsMed && !bIsMed;

        double med = 0;

        if (aIsMed) {
            med = a;
        }
        if (bIsMed) {
            med = b;
        }
        if (cIsMed) {
            med = c;
        }

        System.out.println(med + " is the medium number");














    }
}
