package day12_SwitchScanner;

import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {

        //write a program that can ask youser to enter two number, and the prints the sum of those two number
        //            Enter your first number
        //            10
        //            Enter your second number
        //            20

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = scan.nextInt();
        System.out.println("Enter your second number: ");
        int b = scan.nextInt();

        System.out.println("Sum of those two number are " + (a + b));



    }
}
