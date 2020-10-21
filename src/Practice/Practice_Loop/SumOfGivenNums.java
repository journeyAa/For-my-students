package Practice.Practice_Loop;

import java.util.Scanner;

// write a program that can calculate the sum of all numbers between 1 to any given number
public class SumOfGivenNums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int sum = 0;

        if(num > 0){
            for (int i = 1; i <= num; i++) {
               sum += i;
            }
            System.out.println("the sum is: " + sum);

        }else{
            System.out.println("Invalid number");
        }














    }
}
