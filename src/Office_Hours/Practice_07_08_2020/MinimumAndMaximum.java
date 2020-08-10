package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 2147483647;
        int max = -2147483648;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n < min){
                min = n;
            }
            if(n > max){
                max = n
;            }

        }

        System.out.println("the max is " + max + ", and the min is: " + min);
















    }
}
