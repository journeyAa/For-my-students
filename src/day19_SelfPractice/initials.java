package day19_SelfPractice;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {

        /*write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();

        String str1 = firstName.substring(0,1);
        String str2 = lastName.substring(0,1);

        System.out.println("Your initial is: " + (str1 + str2).toUpperCase());





    }
}
