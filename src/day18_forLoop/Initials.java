package day18_forLoop;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*Write a program that ask user's first and last name, then prints out the initial of the user*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String secondName = scan.next();

        char ch1 = firstName.charAt(0);
        char ch2 = secondName.charAt(0);
        String initial = "" + ch1 + ch2;
        initial = initial.toUpperCase();

        System.out.println("Your initial is: " + initial);


        // method 2

        String firstName1 = "Cybertek";
        String lastName2 = "school";

        String str1 = firstName1.substring(0,1);
        String str2 = lastName2.substring(0,1);
        String initial2 = (str1 + str2).toUpperCase();

        System.out.println(initial2);














    }
}
