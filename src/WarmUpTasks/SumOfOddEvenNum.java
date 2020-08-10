package WarmUpTasks;
/* 4. write a program that can calculate the sum of all numbers between 1 to 100
    5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
    6. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
    7. write a program that can calculate the sum of all numbers between 1 to any given number*/

import java.util.Scanner;

public class SumOfOddEvenNum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i; // SUM = SUM +I;

        }
        System.out.println(sum);
        System.out.println();
        System.out.println("==============================================================================");

        int sumEven = 0;
        for(int s = 1; s <= 100; s++){
            if(s % 2 == 0)
            sumEven += s;
        }
        System.out.println(sumEven);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int sumOdd = 0;
        for(int d = 1; d <= 100; d++){
            if(d % 2 != 0)
            sumOdd += d;
        }
        System.out.println(sumOdd);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int sumA = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;

            
        }






    }
}