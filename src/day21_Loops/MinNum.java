package day21_Loops;

import java.util.Scanner;
// ask user to enter nums five times then print out the min number
public class MinNum {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        int min = 2147483647; // any num the user entered will be smaller than this num, so the first num will be min
        int max = -999999999; // any input user entered will be greater than this num, so the fist num will be max

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }

        }

        System.out.println("the minimum number you entered is: " + min);
        System.out.println(max);



















    }
}
