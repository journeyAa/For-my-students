package day08_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {

        /* Write a program to identify if the number is even or odd

      */

        int num1 = 101;

        boolean even = num1 % 2 == 0;
        boolean odd = !even;

        if(even) {
            System.out.println("number " + num1 + " is even number");
        }

        if(!even) {
            System.out.println("number " + num1 + " is odd number");
        }










    }
}
