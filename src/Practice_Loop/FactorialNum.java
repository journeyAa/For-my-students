package Practice_Loop;

import java.util.Scanner;

/*Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120*/
public class FactorialNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int factorialNum = 1;
        int num = scan.nextInt();
        for (int i = num; i >= 1; i--) {
            factorialNum *= i;
        }
        System.out.println(factorialNum);









    }
}
