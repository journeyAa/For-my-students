package Practice.Practice_WrapperClass;

import java.util.Arrays;
import java.util.Scanner;

public class WrapperClass_3 {
    public static void main(String[] args) {
        String[] num1 = {"10.0","12.2","3.5","63.5","10.0","24.5"};

        double[] num2 = new double[num1.length];

        for (int i = 0; i <= num1.length-1; i++) {
            num2[i] =Double.parseDouble(num1[i]) ;

        }
        System.out.println(Arrays.toString(num2));

        System.out.println("===========================================");

        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        byte by = Byte.MAX_VALUE;
        byte By = Byte.MIN_VALUE;


        System.out.println(a);
        System.out.println(b);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt();
            if(n > max){
                max = n;
            }
            if(n < min){
                min= n;
            }


        }
        System.out.println("The max num you entered was " + max);
        System.out.println("The min num you entered was " + min);















    }
}
