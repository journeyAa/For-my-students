package day20_WhileLoops;

import java.util.Scanner;

public class WhileLoop_Practice3 {
    public static void main(String[] args) {
        String password = "Alper123";

        System.out.println("Enter your password:");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while(!input.equals(password)){
            System.out.println("Please re-enter your password:");
            input = scan.nextLine();

        }














    }
}
