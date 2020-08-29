package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Desc_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");

        int[] arr = new int[scan.nextInt()];

        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.println("Enter your number");
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));










    }
}
