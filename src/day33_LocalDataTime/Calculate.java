package day33_LocalDataTime;

import java.util.Arrays;

// create a method that can calculate the addition of two integers
////////////////////////////////////////////////////////// decimals
//                                        multiplication of two integers
//                                                              decimals
public class Calculate {
    public static void main(String[] args) {
        int a = 10;
        double b = 20;
        System.out.println(addition(a,(int)b));// we dont use casting often

        float num1 = 10.5f;
        float num2 = 9;
        System.out.println(addition(num1,num2));

        int[] arr1 = {4,3,2,1};
        Arrays.sort(arr1);

        char[] arr2 = {'C','D','A','B'};
        Arrays.sort(arr2);

        long l1 = 100;
        long l2 = 200;
        System.out.println(multiplication(l1, l2));
        System.out.println(multiplication((int)l1, (int) l2));



    }
    public static int addition (int a , int b){
        return  a+b;
    }
    public static double addition(double a, double b){
        return  a+b;
    }
    public static double addition(double a, int b){
        return a+b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static double multiplication(double a ,double b){
        return a*b;
    }
}
