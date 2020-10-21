package Practice.Practice_ArRays;

import java.util.Scanner;

/*Write a program that ask user how many numbers he wants to enter, and get all the user inputs and store them
* int an array variable, then return the max and min*/
public class FindingMaxFromInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n-1; i++) {// getting user input then store them in the array
            System.out.println("Enter a number");
            int number = scan.nextInt();
            arr[i] = number;
            // 0    1 2 3 4 5

        }
        for (int i = 0; i <= arr.length-1 ; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("the max number in this array is: " + max);
        System.out.println("the min number in this array is: " + min);























    }
}
