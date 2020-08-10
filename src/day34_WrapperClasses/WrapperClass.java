package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {

        Integer num = 100;
        int a = 100;

        byte t = 100;
        int z = t;

        //Integer z2  = t;

        Byte b1 = 50;
        int n1 = b1;

        Byte b2 = 40;
        // Integer n2 - b2;

        Integer n3 = new Integer (123);

        Double [] arr = new Double[3];

        System.out.println(Arrays.toString(arr));

        int p1 = 300;
        Integer p2 = p1; // Autoboxing / implicitly done

        Integer q1 = 500;
        int q2 = q1; // unboxing // done implicitly as well

       // Double r1 = 300; wrapper class is only dedicated to its primitive
        Double r1 = 300.0;  // wrapper to primitive is unboxing // primitive to wrapper is autoboxing
        double r2 = r1;

        long l1 = 400;
        Long l2 = l1; // autoboxing

        Double[] arrD = {5.6, 6.9,1.2,3.5,8.2};
        for (double each : arrD){
            System.out.println(each);
        }
















    }
}
