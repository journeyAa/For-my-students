package day34_WrapperClasses;

import java.util.Scanner;
import java.util.Spliterator;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;

        Byte b = Byte.MAX_VALUE;

        System.out.println(a);
        System.out.println(b);

        int a2 = Integer.MIN_VALUE;
        System.out.println(a2);

        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Enter a mumber");
            int n = scan.nextInt();

            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
























    }
}
